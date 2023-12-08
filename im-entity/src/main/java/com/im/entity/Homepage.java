package com.im.entity;

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
public class Homepage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 图标
     */
    private String icon;

    /**
     * 链接
     */
    private String link;

    /**
     * 参数开关0否1是
     */
    private Integer paramterOpen;

    /**
     * 所用用户可见0，特权用户专享1
     */
    private Integer rule;

    /**
     * 顺序
     */
    private Integer sort;

    private Integer orgId;

    /**
     * 详情
     */
    private String info;
}
