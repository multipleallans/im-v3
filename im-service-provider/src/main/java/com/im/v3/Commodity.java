package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Commodity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 64)
    private String name;
    @Basic
    @Column(name = "category_id", nullable = true)
    private Integer categoryId;
    @Basic
    @Column(name = "prize", nullable = true, precision = 0)
    private Double prize;
    @Basic
    @Column(name = "in_stock", nullable = true)
    private Integer inStock;
    @Basic
    @Column(name = "img", nullable = true, length = 255)
    private String img;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "modify_time", nullable = true)
    private Timestamp modifyTime;
    @Basic
    @Column(name = "org_id", nullable = true, length = -1)
    private String orgId;
    @Basic
    @Column(name = "commodity_info", nullable = true, length = -1)
    private String commodityInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

    public Integer getInStock() {
        return inStock;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getCommodityInfo() {
        return commodityInfo;
    }

    public void setCommodityInfo(String commodityInfo) {
        this.commodityInfo = commodityInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return id == commodity.id && Objects.equals(name, commodity.name) && Objects.equals(categoryId, commodity.categoryId) && Objects.equals(prize, commodity.prize) && Objects.equals(inStock, commodity.inStock) && Objects.equals(img, commodity.img) && Objects.equals(createTime, commodity.createTime) && Objects.equals(modifyTime, commodity.modifyTime) && Objects.equals(orgId, commodity.orgId) && Objects.equals(commodityInfo, commodity.commodityInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, categoryId, prize, inStock, img, createTime, modifyTime, orgId, commodityInfo);
    }
}
