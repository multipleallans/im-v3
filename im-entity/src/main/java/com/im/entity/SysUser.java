package com.im.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:54:54
 */
@Getter
@Setter
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /**
     * 所属机构
     */
    private Long orgId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态 0:禁用，1:正常
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建用户id
     */
    private Long userIdCreate;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;

    /**
     * 谷歌秘钥
     */
    private String googleKaptchaKey;

    /**
     * 谷歌验证码开关
     */
    private Byte enableGoogleKaptcha;

    /**
     * 最后登陆ip
     */
    private String lastLoginIp;

    /**
     * 最后登陆时间
     */
    private LocalDateTime lastLoginTime;
}
