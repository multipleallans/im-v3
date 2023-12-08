package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_macro", schema = "im-v3", catalog = "")
public class SysMacro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "macro_id", nullable = false)
    private long macroId;
    @Basic
    @Column(name = "type_id", nullable = true)
    private Long typeId;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic
    @Column(name = "value", nullable = true, length = 2000)
    private String value;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @Basic
    @Column(name = "type", nullable = true)
    private Byte type;
    @Basic
    @Column(name = "order_num", nullable = true)
    private Integer orderNum;
    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    private String remark;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;

    public long getMacroId() {
        return macroId;
    }

    public void setMacroId(long macroId) {
        this.macroId = macroId;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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
        SysMacro sysMacro = (SysMacro) o;
        return macroId == sysMacro.macroId && Objects.equals(typeId, sysMacro.typeId) && Objects.equals(name, sysMacro.name) && Objects.equals(value, sysMacro.value) && Objects.equals(status, sysMacro.status) && Objects.equals(type, sysMacro.type) && Objects.equals(orderNum, sysMacro.orderNum) && Objects.equals(remark, sysMacro.remark) && Objects.equals(gmtCreate, sysMacro.gmtCreate) && Objects.equals(gmtModified, sysMacro.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(macroId, typeId, name, value, status, type, orderNum, remark, gmtCreate, gmtModified);
    }
}
