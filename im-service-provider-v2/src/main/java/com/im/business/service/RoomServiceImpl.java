package com.im.business.service;

import com.im.api.service.RoomService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = RoomService.class)
public class RoomServiceImpl implements RoomService {
}
