package com.im.controller;

import com.im.api.dto.UserDTO;
import com.im.api.service.ImService;
import com.im.api.service.MemberService;
import com.im.domain.entity.Member;
import com.im.service.BusinessService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SampleController {

    @DubboReference
    ImService imService;

    @DubboReference
    MemberService memberService;

    @Autowired
    BusinessService businessService;

    @Value("${chicken.name}")
    private String chickenName;

    @Value("${chicken.age}")
    private int chickenAge;

    @RequestMapping("/user")
    public String user() {
        return "chickenName: " + chickenName + ", chickenAge: "+ chickenAge;
    }

    @RequestMapping("/get")
    public UserDTO get() {
        return imService.get(1);
    }

    @RequestMapping("/businessService")
    public UserDTO businessService() throws Exception {
        businessService.testCallImservice();
        return imService.get(1);
    }

    @RequestMapping("/getMember")
    public Member getMember(String memberId) throws Exception {
        return memberService.getByMemberId(memberId);
    }
}

