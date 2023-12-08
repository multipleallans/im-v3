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
 * @since 2023-12-08 06:20:49
 */
@Getter
@Setter
@TableName("show_config")
public class ShowConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 站点ID
     */
    private String orgid;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * app启动图片配置
     */
    private String appStartImg;

    /**
     * 图标
     */
    private String icon;

    /**
     * logo
     */
    private String logo;
}
