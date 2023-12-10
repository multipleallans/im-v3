package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("member_login_log")
public class MemberLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String ip;

    private String mid;

    private String mnickName;

    private String mtel;

    /**
     * 设备类型：
     */
    private String deviceType;

    /**
     * 用户头像
     */
    private String mheadPic;

    private String username;

    private String deviceVersion;

    /**
     * IP归属地
     */
    private String ipAddr;

    private Integer orgId;
}
