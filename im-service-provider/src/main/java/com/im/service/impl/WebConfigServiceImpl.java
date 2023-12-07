package com.im.service.impl;

import com.im.entity.WebConfig;
import com.im.service.BaseService;
import com.im.service.WebConfigService;
import com.im.utils.redis.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class WebConfigServiceImpl implements WebConfigService {

	public final static String redisKey ="webConfig";

	private final BaseService<WebConfig, String> baseService;

	private final RedisService redisService;

	@Autowired
	public WebConfigServiceImpl(BaseService<WebConfig, String> baseService, RedisService redisService) {
		this.baseService = baseService;
		this.redisService = redisService;
	}

	@Override
	@Transactional(readOnly = true)
	public WebConfig get() throws Exception {
		return getOne();
	}

	@Override
	public WebConfig getOne() throws Exception {
		return 	redisService.getAndSet(redisKey, 60 * 60 * 24 * 4L, WebConfig.class, new RedisService.SetRedisValue1() {
			@Override
			public Object setValue() {
				try {
					return baseService.getAll(WebConfig.class).get(0);
				} catch (Exception e) {
					log.error("",e);
				}
				return null;
			}
		});

//		if (StringUtils.isNotEmpty(value)){
//			try {
//				return JSONObject.parseObject(value,WebConfig.class);
//			}catch (Exception e) {
//				log.error("WebConfig,jsonValue:{}",value);
//			}
//		}
//		return null;
	}

	@Override
	@Transactional
	public void update(WebConfig wc) throws Exception {
		baseService.update(wc);
		redisService.delete(redisKey);
	}

}
