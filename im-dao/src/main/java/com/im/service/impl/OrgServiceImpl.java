package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.Org;
import com.im.mapper.OrgMapper;
import com.im.service.OrgService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 机构管理 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:20:49
 */
@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, Org> implements OrgService {

}
