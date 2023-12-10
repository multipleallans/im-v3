package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.DefaultRoom;
import com.im.persistence.mapper.DefaultRoomMapper;
import com.im.persistence.service.DefaultRoomPersistenceService;
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
public class DefaultRoomPersistenceServiceImpl extends ServiceImpl<DefaultRoomMapper, DefaultRoom> implements DefaultRoomPersistenceService {

}
