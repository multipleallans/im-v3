package com.im.persistence.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 运营-消息群发
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("yy_send_group_msg")
public class YySendGroupMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 发送账号
     */
    private String sendMemberIds;

    /**
     * 消息类型：0-文字；1-图片
     */
    private String msgType;

    /**
     * 文字消息
     */
    private String message;

    /**
     * 图片
     */
    private String picture;

    private LocalDateTime createTime;

    private Integer orgId;
}
