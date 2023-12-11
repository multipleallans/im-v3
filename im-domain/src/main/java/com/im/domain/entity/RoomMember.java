package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 06:29:53
 */
@Getter
@Setter
@TableName("room_member")
public class RoomMember implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 群组ID,主键
     */
    private String roomId;

    /**
     * 用户ID主键
     */
    private String memberId;

    /**
     * 是否管理员：0否，1是
     */
    private Integer isManager;

    /**
     * 是否禁言：0:否;1:是
     */
    private Integer isStopSpeaker;

    private Date createDate;

    private Date modifyDate;

    private Integer orgId;
}
