package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_user_token", schema = "im-v3", catalog = "")
public class SysUserToken {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Basic
    @Column(name = "token", nullable = false, length = 100)
    private String token;
    @Basic
    @Column(name = "gmt_expire", nullable = true)
    private Timestamp gmtExpire;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getGmtExpire() {
        return gmtExpire;
    }

    public void setGmtExpire(Timestamp gmtExpire) {
        this.gmtExpire = gmtExpire;
    }

    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserToken that = (SysUserToken) o;
        return userId == that.userId && Objects.equals(token, that.token) && Objects.equals(gmtExpire, that.gmtExpire) && Objects.equals(gmtModified, that.gmtModified) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, token, gmtExpire, gmtModified, orgId);
    }
}
