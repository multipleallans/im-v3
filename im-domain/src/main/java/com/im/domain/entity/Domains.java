package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

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
public class Domains implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "domain_id", type = IdType.AUTO)
    private Integer domainId;

    private Integer orgId;

    private String httpDomain;

    private String wsDomain;

    private String ossDomain;

    private String adminDomain;
}
