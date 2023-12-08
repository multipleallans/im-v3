package com.im.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:20:49
 */
@Getter
@Setter
@TableName("default_friend")
public class DefaultFriend implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 好友ID
     */
    private String friendId;

    /**
     * 备注
     */
    private String note;

    /**
     * 打招呼内容
     */
    private String sendHelloMsg;

    private Integer orgId;
}
