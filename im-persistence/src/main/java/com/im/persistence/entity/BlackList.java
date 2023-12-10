package com.im.persistence.entity;

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
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
@TableName("black_list")
public class BlackList implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String blacklistIds;

    private String mid;
}
