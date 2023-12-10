package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.SysUser;
import com.im.persistence.mapper.SysUserMapper;
import com.im.persistence.service.SysUserPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class SysUserPersistenceServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserPersistenceService {

}
