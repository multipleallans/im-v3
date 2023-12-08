package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_role", schema = "im-v3", catalog = "")
public class SysRole {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_id", nullable = false)
    private long roleId;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Long orgId;
    @Basic
    @Column(name = "role_name", nullable = true, length = 100)
    private String roleName;
    @Basic
    @Column(name = "role_sign", nullable = true, length = 100)
    private String roleSign;
    @Basic
    @Column(name = "remark", nullable = true, length = 100)
    private String remark;
    @Basic
    @Column(name = "user_id_create", nullable = true)
    private Long userIdCreate;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getUserIdCreate() {
        return userIdCreate;
    }

    public void setUserIdCreate(Long userIdCreate) {
        this.userIdCreate = userIdCreate;
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
        SysRole sysRole = (SysRole) o;
        return roleId == sysRole.roleId && Objects.equals(orgId, sysRole.orgId) && Objects.equals(roleName, sysRole.roleName) && Objects.equals(roleSign, sysRole.roleSign) && Objects.equals(remark, sysRole.remark) && Objects.equals(userIdCreate, sysRole.userIdCreate) && Objects.equals(gmtCreate, sysRole.gmtCreate) && Objects.equals(gmtModified, sysRole.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, orgId, roleName, roleSign, remark, userIdCreate, gmtCreate, gmtModified);
    }
}
