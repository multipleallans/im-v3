package com.im.controller;

import com.im.api.dto.UserDTO;
import com.im.api.service.ImService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SampleController {

    @DubboReference
    ImService imService;
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
}

