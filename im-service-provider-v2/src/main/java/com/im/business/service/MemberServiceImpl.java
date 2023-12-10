package com.im.business.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.api.service.MemberService;
import com.im.domain.entity.Member;
import com.im.persistence.service.MemberPersistenceService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService(interfaceClass = MemberService.class)
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberPersistenceService memberPersistenceService;

    public Member getByNickName(String nickName){
        QueryWrapper<Member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("nick_name",nickName);
        Member member = memberPersistenceService.getOne(queryWrapper);
        return member;
    }}
