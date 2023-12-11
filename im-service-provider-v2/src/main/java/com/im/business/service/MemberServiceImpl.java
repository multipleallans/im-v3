package com.im.business.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.api.service.MemberService;
import com.im.domain.entity.Member;
import com.im.domain.entity.MemberLoginLog;
import com.im.persistence.service.MemberLoginLogPersistenceService;
import com.im.persistence.service.MemberPersistenceService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@DubboService(interfaceClass = MemberService.class)
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberPersistenceService memberPersistenceService;

    @Autowired
    private MemberLoginLogPersistenceService memberLoginLogPersistenceService;

    public Member getByNickName(String nickName) {
        QueryWrapper<Member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("nick_name", nickName);
        Member member = memberPersistenceService.getOne(queryWrapper);
        return member;
    }

    @Override
    public List<Member> getList(String[] properties, Object[] vals) throws Exception {
        QueryWrapper<Member> queryWrapper = new QueryWrapper<>();
        if (!ArrayUtils.isEmpty(properties)) {
            for (int i = 0; properties != null && i < properties.length; i++) {
                if (null != vals[i] && vals[i].getClass().isArray()) {
                    String column = properties[i];
                    Object value = vals[i];
                    queryWrapper.eq(column, value);
                }
            }
            return memberPersistenceService.list(queryWrapper);
        }
        return null;
    }

    @Override
    @Transactional
    public void update(Member member) {
        memberPersistenceService.updateById(member);
    }

    @Override
    public boolean saveLoginLog(MemberLoginLog memberLoginLog) {
        return memberLoginLogPersistenceService.save(memberLoginLog);
    }

    @Override
    public Member getByMemberId(String memberId) {
        return memberPersistenceService.getById(memberId);
    }


}
