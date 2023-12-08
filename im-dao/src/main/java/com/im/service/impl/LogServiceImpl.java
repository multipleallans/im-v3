package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.Log;
import com.im.mapper.LogMapper;
import com.im.service.LogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:20:49
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements LogService {

}
