package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.AppVersion;
import com.im.persistence.mapper.AppVersionMapper;
import com.im.persistence.service.AppVersionPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * app版本升级 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class AppVersionPersistenceServiceImpl extends ServiceImpl<AppVersionMapper, AppVersion> implements AppVersionPersistenceService {

}
