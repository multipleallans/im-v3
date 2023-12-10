package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.persistence.entity.EmployeeDefaultMessage;
import com.im.persistence.mapper.EmployeeDefaultMessageMapper;
import com.im.persistence.service.EmployeeDefaultMessagePersistenceService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工默认消息 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Service
public class EmployeeDefaultMessagePersistenceServiceImpl extends ServiceImpl<EmployeeDefaultMessageMapper, EmployeeDefaultMessage> implements EmployeeDefaultMessagePersistenceService {

}
