package com.im.domain.entity;

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
public class Friends implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Date createDate;

    private Date modifyDate;

    private String friendid;

    private String mid;

    /**
     * 对朋友的备注，默认member，nickname
     */
    private String note;

    private Integer orgId;
}
