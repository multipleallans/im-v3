package com.im.api.service;

import com.im.api.dto.UserAddDTO;
import com.im.api.dto.UserDTO;

public interface ImService {
    UserDTO get(Integer var1);

    Integer add(UserAddDTO var1);
}
