package com.im.domain.entity;

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
 * @since 2023-12-10 10:03:23
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
