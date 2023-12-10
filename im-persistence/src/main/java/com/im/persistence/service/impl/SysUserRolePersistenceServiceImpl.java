package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.SysUserRole;
import com.im.persistence.mapper.SysUserRoleMapper;
import com.im.persistence.service.SysUserRolePersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与角色对应关系 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class SysUserRolePersistenceServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements SysUserRolePersistenceService {

}
