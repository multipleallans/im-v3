package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.SysUser;
import com.im.mapper.SysUserMapper;
import com.im.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:54:54
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
