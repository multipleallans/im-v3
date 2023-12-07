package com.im.service;

import com.im.entity.AppVersionEntity;
import com.im.entity.CommodityCategoryEntity;
import com.im.entity.CommodityEntity;

import java.util.List;

public interface AppVersionService {
    AppVersionEntity get(String siteId, String os,String appId) ;

    List<AppVersionEntity> getAppVersion(String appId);

    List<CommodityEntity> getCommodity();
    List<CommodityCategoryEntity> getCommodityCategory();

}
