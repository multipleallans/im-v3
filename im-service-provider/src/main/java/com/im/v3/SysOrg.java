package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_org", schema = "im-v3", catalog = "")
public class SysOrg {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "org_id", nullable = false)
    private long orgId;
    @Basic
    @Column(name = "parent_id", nullable = true)
    private Long parentId;
    @Basic
    @Column(name = "code", nullable = true, length = 100)
    private String code;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "order_num", nullable = true)
    private Integer orderNum;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        SysOrg sysOrg = (SysOrg) o;
        return orgId == sysOrg.orgId && Objects.equals(parentId, sysOrg.parentId) && Objects.equals(code, sysOrg.code) && Objects.equals(name, sysOrg.name) && Objects.equals(orderNum, sysOrg.orderNum) && Objects.equals(status, sysOrg.status) && Objects.equals(gmtCreate, sysOrg.gmtCreate) && Objects.equals(gmtModified, sysOrg.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgId, parentId, code, name, orderNum, status, gmtCreate, gmtModified);
    }
}
