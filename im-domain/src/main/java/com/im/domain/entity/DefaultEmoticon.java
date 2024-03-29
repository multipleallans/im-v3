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
 * @since 2023-12-10 10:03:23
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
    private Date upTime;

    /**
     * 显示顺序
     */
    private Integer sort;

    private Integer orgId;
}
