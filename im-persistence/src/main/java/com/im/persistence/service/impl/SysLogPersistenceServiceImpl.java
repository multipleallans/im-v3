package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.SysLog;
import com.im.persistence.mapper.SysLogMapper;
import com.im.persistence.service.SysLogPersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class SysLogPersistenceServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogPersistenceService {

}
