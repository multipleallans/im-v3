package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.MessageHistory;
import com.im.persistence.mapper.MessageHistoryMapper;
import com.im.persistence.service.MessageHistoryPersistenceService;
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
public class MessageHistoryPersistenceServiceImpl extends ServiceImpl<MessageHistoryMapper, MessageHistory> implements MessageHistoryPersistenceService {

}
