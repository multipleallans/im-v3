package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

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
@TableName("message_history")
public class MessageHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String uuid;

    private String date;

    /**
     * 发送者头像
     */
    private String fromHeadpic;

    /**
     * 加工过的消息，如果是媒体消息，则是不带域名的上传地址
     */
    private String oldTxt;

    /**
     * 接收对象的ID
     */
    private String toUid;

    /**
     * 接收群ID
     */
    private String toGroupid;

    private String chatid;

    /**
     * 解析方式  默认使用rich-text   还有其它的选择uparse voice(语音) video(视频)
     */
    private String psr;

    private String txt;

    private String aite;

    /**
     * 发送人ID
     */
    private String fromUid;

    /**
     * 发送人名字
     */
    private String fromName;

    /**
     * 如果是媒体消息，则是多媒体格式 "simple_content": "[图片]"
     */
    private String simpleContent;

    private Date createDate;

    private Date modifyDate;

    private Integer orgId;
}
