package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.SysRoleOrg;
import com.im.persistence.mapper.SysRoleOrgMapper;
import com.im.persistence.service.SysRoleOrgPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与机构对应关系 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class SysRoleOrgPersistenceServiceImpl extends ServiceImpl<SysRoleOrgMapper, SysRoleOrg> implements SysRoleOrgPersistenceService {

}
