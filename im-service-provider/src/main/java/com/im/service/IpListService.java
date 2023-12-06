package com.im.service;


import com.im.entity.IpListEntity;
import com.im.entity.Member;
import com.im.utils.Pager;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public interface IpListService {

    /**
     *
     * @param member
     * @param request
     * @return  true 可以访问
     */
    boolean enableRequest(Member member, HttpServletRequest request);

}
