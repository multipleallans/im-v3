package com.im.entity;

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
 * @since 2023-12-08 06:20:49
 */
@Getter
@Setter
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String inviteCode;

    private String memberId;

    private String memberUuid;

    private String name;

    private String ipWhite;

    private Integer orgId;

    /**
     * 特权用户在线状态
     */
    private Integer userStatus;
}
