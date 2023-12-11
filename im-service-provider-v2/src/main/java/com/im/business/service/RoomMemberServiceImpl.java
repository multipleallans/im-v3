package com.im.business.service;

import com.im.api.service.RoomMemberService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = RoomMemberService.class)
public class RoomMemberServiceImpl implements RoomMemberService{
}
