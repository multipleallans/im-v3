package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.Domains;
import com.im.persistence.mapper.DomainsMapper;
import com.im.persistence.service.DomainsPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class DomainsPersistenceServiceImpl extends ServiceImpl<DomainsMapper, Domains> implements DomainsPersistenceService {

}
