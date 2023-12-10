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
@TableName("admin_sendmsg_log")
public class AdminSendmsgLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 发送管理员ID
     */
    private String sendAdminId;

    /**
     * 发送管理员名称
     */
    private String sendAdminName;

    /**
     * 发送内容
     */
    private String txt;

    private LocalDateTime createDate;

    /**
     * 接收者ID
     */
    private String receiverId;

    /**
     * 接收者名称
     */
    private String receiverName;

    /**
     * 站点
     */
    private Integer orgId;
}
