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
@TableName("default_portrait")
public class DefaultPortrait implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 图片地址
     */
    private String imgAddres;

    /**
     * 上传时间
     */
    private LocalDateTime upTime;

    private Integer orgId;
}
