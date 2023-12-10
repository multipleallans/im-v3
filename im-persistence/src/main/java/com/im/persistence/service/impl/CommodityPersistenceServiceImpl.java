package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.persistence.entity.Commodity;
import com.im.persistence.mapper.CommodityMapper;
import com.im.persistence.service.CommodityPersistenceService;
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
public class CommodityPersistenceServiceImpl extends ServiceImpl<CommodityMapper, Commodity> implements CommodityPersistenceService {

}
