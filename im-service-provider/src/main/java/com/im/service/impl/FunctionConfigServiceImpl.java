package com.im.service.impl;

import com.alibaba.fastjson.JSON;
import com.im.entity.FunctionConfigEntity;
import com.im.service.BaseService;
import com.im.service.FunctionConfigService;
import com.im.utils.redis.RedisService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class FunctionConfigServiceImpl implements FunctionConfigService {

    private BaseService<FunctionConfigEntity,String> baseService;
    private RedisService redisService;

    public static final String REDIS_KEY_FUNCTION_CONFIG="function:config";

    @Override
    public FunctionConfigEntity get() throws Exception {
        String config = redisService.get(REDIS_KEY_FUNCTION_CONFIG);
        if (null != config && !config.isEmpty()) {
            return JSON.parseObject(config, FunctionConfigEntity.class);
        }
        FunctionConfigEntity configEntity = (FunctionConfigEntity) baseService.get(FunctionConfigEntity.class,"org_id","1");
        redisService.set(REDIS_KEY_FUNCTION_CONFIG, JSON.toJSONString(configEntity));
        return configEntity;
    }
}
