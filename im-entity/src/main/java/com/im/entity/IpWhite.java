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
@TableName("ip_white")
public class IpWhite implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String ipAddress;

    private String ipAddressStart;

    private Integer status;

    private String note;

    private Integer type;

    private Integer orgId;
}
