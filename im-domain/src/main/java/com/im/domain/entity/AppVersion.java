package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * app版本升级
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("app_version")
public class AppVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 下载链接
     */
    private String downUrl;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 版本号
     */
    private String version;

    /**
     * 描述
     */
    private String descript;

    /**
     * 站点(同orgId)
     */
    private Integer orgId;

    /**
     * 系统(1安卓2为IOS)
     */
    private String deviceType;

    /**
     * 是否强更(0否1是)
     */
    private Byte forceUpdate;

    /**
     * 0: 不显示, 1显示
     */
    private String isShow;

    /**
     * 应用id
     */
    private String appId;

    /**
     * APP昵称
     */
    private String appName;
}
