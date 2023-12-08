package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.AppVersion;
import com.im.mapper.AppVersionMapper;
import com.im.service.AppVersionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * app版本升级 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:20:49
 */
@Service
public class AppVersionServiceImpl extends ServiceImpl<AppVersionMapper, AppVersion> implements AppVersionService {

}
