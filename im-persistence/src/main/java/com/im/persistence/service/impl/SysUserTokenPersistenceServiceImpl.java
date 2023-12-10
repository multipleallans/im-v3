package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.persistence.entity.SysUserToken;
import com.im.persistence.mapper.SysUserTokenMapper;
import com.im.persistence.service.SysUserTokenPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户Token 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class SysUserTokenPersistenceServiceImpl extends ServiceImpl<SysUserTokenMapper, SysUserToken> implements SysUserTokenPersistenceService {

}
