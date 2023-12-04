package com.im.service;

import com.im.api.dto.UserAddDTO;
import com.im.api.dto.UserDTO;
import com.im.api.service.ImService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = ImService.class)
public class ImServiceImpl implements ImService {
    @Override
    public UserDTO get(Integer id) {
        UserDTO dto = new UserDTO();
        dto.setId(id);
        dto.setName("name");
        dto.setGender(id % 1 + 1);
        return dto;
    }

    @Override
    public Integer add(UserAddDTO addDTO) {
        return (int) (System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
    }
}
