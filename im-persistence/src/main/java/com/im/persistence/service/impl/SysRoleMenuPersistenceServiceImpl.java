package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.persistence.entity.SysRoleMenu;
import com.im.persistence.mapper.SysRoleMenuMapper;
import com.im.persistence.service.SysRoleMenuPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与菜单对应关系 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class SysRoleMenuPersistenceServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuPersistenceService {

}
