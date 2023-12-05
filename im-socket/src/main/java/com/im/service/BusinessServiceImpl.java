package com.im.service;

import com.im.api.dto.UserDTO;
import com.im.api.service.ImService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BusinessServiceImpl implements BusinessService {

    @DubboReference
    ImService imService;

    @Override
    @Async
    public void udpHandleMethod(String message) throws Exception {
        log.info("业务开始处理");
        imService.get(3);
        Thread.sleep(300);
        log.info("业务处理完成");
    }

    @Override
    public void testCallImservice() throws Exception {
        log.info("testCallImservice");
        UserDTO dto = imService.get(3);
        log.info("Ger response, dto : {}", dto);
    }
}
