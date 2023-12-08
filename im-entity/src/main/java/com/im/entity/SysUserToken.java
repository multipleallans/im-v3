package com.im.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户Token
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:54:54
 */
@Getter
@Setter
@TableName("sys_user_token")
public class SysUserToken implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * token
     */
    private String token;

    /**
     * 过期时间
     */
    private LocalDateTime gmtExpire;

    /**
     * 更新时间
     */
    private LocalDateTime gmtModified;

    private Integer orgId;
}
