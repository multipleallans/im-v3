package com.im.api.service;


import com.im.domain.entity.Member;
import com.im.domain.entity.MemberLoginLog;

import java.util.List;

public interface MemberService {

    Member getByNickName(String nickName);

    List<Member> getList(String[] properties, Object[] vals) throws Exception;

    void update(Member member);

    boolean saveLoginLog(MemberLoginLog memberLoginLog);

    Member getByMemberId(String memberId);
}
