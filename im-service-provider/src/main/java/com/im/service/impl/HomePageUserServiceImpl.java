package com.im.service.impl;

import com.im.entity.HomepageUserEntity;
import com.im.service.BaseService;
import com.im.service.HomePageUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@SuppressWarnings("all")
@AllArgsConstructor
@Slf4j
public class HomePageUserServiceImpl implements HomePageUserService {

    private final BaseService<HomepageUserEntity, String> baseService;

    @Override
    public List<HomepageUserEntity> getHomepageUserInfo(String member_id) {
        try {
            return baseService.getList(HomepageUserEntity.class,"member_id", member_id);
        } catch (Exception e) {
            log.error("",e);
        }
        return Collections.emptyList();
    }
}
