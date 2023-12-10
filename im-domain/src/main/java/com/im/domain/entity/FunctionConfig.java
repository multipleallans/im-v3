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
@TableName("function_config")
public class FunctionConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 站点ID
     */
    private String orgId;

    /**
     * 禁止网页/客户端注册 0否1是
     */
    private Integer webAppRegist;

    /**
     * 网页/客户端显示IP 0否1是
     */
    private Integer webAppIpShow;

    /**
     * 单账号多段登录，网页/客户端最大登录数量
     */
    private Integer maxLoginCounts;

    /**
     * 安全登录开关0关1开
     */
    private Integer safeLogin;

    /**
     * 安全登录，最大登录重试次数
     */
    private Integer safeLoginRetryCounts;

    /**
     * 安全登录，是否适用IP黑名单功能 0否1是
     */
    private Integer safeLoginApplyBlacklist;

    /**
     * 禁止普通用户添加好友0否1是
     */
    private Integer addFriend;

    /**
     * 禁止普通用户建群0否1是
     */
    private Integer createRoom;

    /**
     * 开启手机号验证0否1是
     */
    private Integer phoneVerify;

    /**
     * 群主/群管理踢人是否删除被踢人信息0否1是
     */
    private Integer outRoomDelMessage;

    /**
     * 隐藏群主/群管理的管理消息（禁言、撤回消息等）0否1是
     */
    private Integer missRoomManegerMsg;

    /**
     * 冻结：o:否;1:是
     */
    private Integer isFrozen;

    /**
     * IP黑名单：o:否;1:是
     */
    private Integer ipBlack;

    /**
     * IP Web白名单：o:否;1:是
     */
    private Integer ipWhite;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;
}
