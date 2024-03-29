package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.domain.entity.Notice;
import com.im.persistence.mapper.NoticeMapper;
import com.im.persistence.service.NoticePersistenceService;
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
public class NoticePersistenceServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticePersistenceService {

}
