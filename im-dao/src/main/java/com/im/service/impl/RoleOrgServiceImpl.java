package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.RoleOrg;
import com.im.mapper.RoleOrgMapper;
import com.im.service.RoleOrgService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与机构对应关系 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:20:49
 */
@Service
public class RoleOrgServiceImpl extends ServiceImpl<RoleOrgMapper, RoleOrg> implements RoleOrgService {

}
