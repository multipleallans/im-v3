package com.im.persistence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.persistence.entity.Member;
import com.im.persistence.mapper.MemberMapper;
import com.im.persistence.service.MemberPersistenceService;
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
public class MemberPersistenceServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberPersistenceService {

}
