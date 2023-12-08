package com.im.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

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
@TableName("default_emoticon")
public class DefaultEmoticon implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 表情地址
     */
    private String imgAddres;

    /**
     * 上传时间
     */
    private LocalDateTime upTime;

    /**
     * 显示顺序
     */
    private Integer sort;

    private Integer orgId;
}
