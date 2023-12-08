package com.im.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.Member;
import com.im.mapper.MemberMapper;
import com.im.service.MemberService;
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
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
