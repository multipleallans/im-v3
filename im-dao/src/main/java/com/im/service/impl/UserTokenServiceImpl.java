package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.UserToken;
import com.im.mapper.UserTokenMapper;
import com.im.service.UserTokenService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户Token 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:20:49
 */
@Service
public class UserTokenServiceImpl extends ServiceImpl<UserTokenMapper, UserToken> implements UserTokenService {

}
