package com.im.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.api.dto.UserDTO;
import com.im.domain.entity.Member;
import com.im.persistence.service.MemberPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:38:29
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberPersistenceService memberPersistenceService;

    @RequestMapping("/getByNickName")
    public Member get(String nickName) throws Exception {
        QueryWrapper<Member> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("nick_name",nickName);
        Member member = memberPersistenceService.getOne(queryWrapper);
        return member;
    }

}
