package com.im.api.service;


import com.im.domain.entity.Member;

public interface MemberService {

    Member getByNickName(String nickName);

}
