package com.im.persistence.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品类别
     */
    private Integer categoryId;

    /**
     * 单价
     */
    private Object prize;

    /**
     * 库存
     */
    private Integer inStock;

    /**
     * 商品缩略图地址
     */
    private String img;

    private LocalDateTime createTime;

    private LocalDateTime modifyTime;

    private String orgId;

    /**
     * 商品详情
     */
    private String commodityInfo;
}
