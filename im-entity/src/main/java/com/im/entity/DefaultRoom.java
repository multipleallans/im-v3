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
 * @since 2023-12-08 06:54:53
 */
@Getter
@Setter
@TableName("default_room")
public class DefaultRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 群组ID
     */
    private String roomId;

    private Integer orgId;
}
