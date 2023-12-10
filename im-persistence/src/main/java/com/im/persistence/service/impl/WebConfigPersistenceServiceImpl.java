package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.WebConfig;
import com.im.persistence.mapper.WebConfigMapper;
import com.im.persistence.service.WebConfigPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class WebConfigPersistenceServiceImpl extends ServiceImpl<WebConfigMapper, WebConfig> implements WebConfigPersistenceService {

}
