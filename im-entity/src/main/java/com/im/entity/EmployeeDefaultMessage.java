package com.im.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 员工默认消息
 * </p>
 *
 * @author jojo
 * @since 2023-12-08 06:54:53
 */
@Getter
@Setter
@TableName("employee_default_message")
public class EmployeeDefaultMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工 id
     */
    private String employeeId;

    private String memberId;

    /**
     * 打招呼话术
     */
    private String msg1;

    /**
     * 打招呼话术
     */
    private String msg2;

    /**
     * 打招呼话术
     */
    private String msg3;

    private String picture1;

    private String picture2;

    private String picture3;

    private String picture4;

    private String picture5;

    private String id;

    /**
     * 邀请码
     */
    private String inviteCode;

    private Integer orgId;
}
