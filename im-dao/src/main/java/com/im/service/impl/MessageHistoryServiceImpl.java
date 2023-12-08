package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.MessageHistory;
import com.im.mapper.MessageHistoryMapper;
import com.im.service.MessageHistoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:54:53
 */
@Service
public class MessageHistoryServiceImpl extends ServiceImpl<MessageHistoryMapper, MessageHistory> implements MessageHistoryService {

}
