package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 机构管理
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("sys_org")
public class SysOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 机构id
     */
    @TableId(value = "org_id", type = IdType.AUTO)
    private Long orgId;

    /**
     * 上级机构ID，一级机构为0
     */
    private Long parentId;

    /**
     * 机构编码
     */
    private String code;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer orderNum;

    /**
     * 可用标识  1：可用  0：不可用
     */
    private Byte status;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;
}
