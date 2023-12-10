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
 * 通用字典表
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("sys_macro")
public class SysMacro implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "macro_id", type = IdType.AUTO)
    private Long macroId;

    /**
     * 父级id
     */
    private Long typeId;

    /**
     * 名称
     */
    private String name;

    /**
     * 值
     */
    private String value;

    /**
     * 状态，0：隐藏   1：显示
     */
    private Byte status;

    /**
     * 类型,0:目录，1:参数配置
     */
    private Byte type;

    /**
     * 排序
     */
    private Integer orderNum;

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
