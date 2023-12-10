package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("yy_ip_list")
public class YyIpList implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * IP地址
     */
    private String ipAddress;

    /**
     * 备注
     */
    private String note;

    /**
     * IP名单类型：0->ipweb白名单；1->ip黑名单
     */
    private String type;

    /**
     * 状态：0-正常；1-删除
     */
    private String stauts;

    private Integer orgId;
}
