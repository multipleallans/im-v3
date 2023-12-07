package com.im.service;

import com.im.entity.HomepageUserEntity;

import java.util.List;

public interface HomePageUserService {

    List<HomepageUserEntity> getHomepageUserInfo(String member_id);

}
