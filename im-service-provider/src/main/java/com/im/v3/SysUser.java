package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_user", schema = "im-v3", catalog = "")
public class SysUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Long orgId;
    @Basic
    @Column(name = "username", nullable = true, length = 50)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 50)
    private String password;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "mobile", nullable = true, length = 100)
    private String mobile;
    @Basic
    @Column(name = "status", nullable = true)
    private Byte status;
    @Basic
    @Column(name = "remark", nullable = true, length = 500)
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
    @Basic
    @Column(name = "google_kaptcha_key", nullable = true, length = 25)
    private String googleKaptchaKey;
    @Basic
    @Column(name = "enable_google_kaptcha", nullable = true)
    private Byte enableGoogleKaptcha;
    @Basic
    @Column(name = "last_login_ip", nullable = true, length = 255)
    private String lastLoginIp;
    @Basic
    @Column(name = "last_login_time", nullable = true)
    private Timestamp lastLoginTime;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getGoogleKaptchaKey() {
        return googleKaptchaKey;
    }

    public void setGoogleKaptchaKey(String googleKaptchaKey) {
        this.googleKaptchaKey = googleKaptchaKey;
    }

    public Byte getEnableGoogleKaptcha() {
        return enableGoogleKaptcha;
    }

    public void setEnableGoogleKaptcha(Byte enableGoogleKaptcha) {
        this.enableGoogleKaptcha = enableGoogleKaptcha;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return userId == sysUser.userId && Objects.equals(orgId, sysUser.orgId) && Objects.equals(username, sysUser.username) && Objects.equals(password, sysUser.password) && Objects.equals(email, sysUser.email) && Objects.equals(mobile, sysUser.mobile) && Objects.equals(status, sysUser.status) && Objects.equals(remark, sysUser.remark) && Objects.equals(userIdCreate, sysUser.userIdCreate) && Objects.equals(gmtCreate, sysUser.gmtCreate) && Objects.equals(gmtModified, sysUser.gmtModified) && Objects.equals(googleKaptchaKey, sysUser.googleKaptchaKey) && Objects.equals(enableGoogleKaptcha, sysUser.enableGoogleKaptcha) && Objects.equals(lastLoginIp, sysUser.lastLoginIp) && Objects.equals(lastLoginTime, sysUser.lastLoginTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, orgId, username, password, email, mobile, status, remark, userIdCreate, gmtCreate, gmtModified, googleKaptchaKey, enableGoogleKaptcha, lastLoginIp, lastLoginTime);
    }
}
