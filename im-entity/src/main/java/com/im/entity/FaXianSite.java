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
@TableName("fa_xian_site")
public class FaXianSite implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String logo;

    private String name;

    private Integer orderList;

    private Integer status;

    private String url;
}
