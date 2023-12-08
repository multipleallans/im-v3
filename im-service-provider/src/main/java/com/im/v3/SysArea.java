package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_area", schema = "im-v3", catalog = "")
public class SysArea {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "area_id", nullable = false)
    private long areaId;
    @Basic
    @Column(name = "area_code", nullable = false, length = 50)
    private String areaCode;
    @Basic
    @Column(name = "parent_code", nullable = false, length = 50)
    private String parentCode;
    @Basic
    @Column(name = "name", nullable = true, length = 20)
    private String name;
    @Basic
    @Column(name = "layer", nullable = true)
    private Integer layer;
    @Basic
    @Column(name = "order_num", nullable = true)
    private Integer orderNum;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @Basic
    @Column(name = "remark", nullable = true, length = 50)
    private String remark;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;

    public long getAreaId() {
        return areaId;
    }

    public void setAreaId(long areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysArea sysArea = (SysArea) o;
        return areaId == sysArea.areaId && Objects.equals(areaCode, sysArea.areaCode) && Objects.equals(parentCode, sysArea.parentCode) && Objects.equals(name, sysArea.name) && Objects.equals(layer, sysArea.layer) && Objects.equals(orderNum, sysArea.orderNum) && Objects.equals(status, sysArea.status) && Objects.equals(remark, sysArea.remark) && Objects.equals(gmtCreate, sysArea.gmtCreate) && Objects.equals(gmtModified, sysArea.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaId, areaCode, parentCode, name, layer, orderNum, status, remark, gmtCreate, gmtModified);
    }
}
