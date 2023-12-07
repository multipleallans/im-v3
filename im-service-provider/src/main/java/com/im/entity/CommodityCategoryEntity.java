package com.im.entity;


import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name="commodity_category")
@SuppressWarnings("all")
public class CommodityCategoryEntity {

    @Id
    Long id;

    /**
     * 类别名称
     * */
    String category_name;

}
