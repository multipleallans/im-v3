package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.FunctionConfig;
import com.im.persistence.mapper.FunctionConfigMapper;
import com.im.persistence.service.FunctionConfigPersistenceService;
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
public class FunctionConfigPersistenceServiceImpl extends ServiceImpl<FunctionConfigMapper, FunctionConfig> implements FunctionConfigPersistenceService {

}
