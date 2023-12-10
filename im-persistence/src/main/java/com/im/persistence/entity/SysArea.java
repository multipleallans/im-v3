package com.im.persistence.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 行政区划
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("sys_area")
public class SysArea implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 区域id
     */
    @TableId(value = "area_id", type = IdType.AUTO)
    private Long areaId;

    /**
     * 行政区划代码
     */
    private String areaCode;

    /**
     * 父级id
     */
    private String parentCode;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 层级
     */
    private Integer layer;

    /**
     * 排序号,1:省级,2:地市,3:区县
     */
    private Integer orderNum;

    /**
     * 显示,1:显示,0:隐藏
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;
}
