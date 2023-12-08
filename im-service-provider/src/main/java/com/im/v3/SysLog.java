package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_log", schema = "im-v3", catalog = "")
public class SysLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Long userId;
    @Basic
    @Column(name = "username", nullable = true, length = 50)
    private String username;
    @Basic
    @Column(name = "operation", nullable = true, length = 50)
    private String operation;
    @Basic
    @Column(name = "time", nullable = true)
    private Integer time;
    @Basic
    @Column(name = "method", nullable = true, length = 200)
    private String method;
    @Basic
    @Column(name = "params", nullable = true, length = -1)
    private String params;
    @Basic
    @Column(name = "ip", nullable = true, length = 64)
    private String ip;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
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
        SysLog sysLog = (SysLog) o;
        return id == sysLog.id && Objects.equals(userId, sysLog.userId) && Objects.equals(username, sysLog.username) && Objects.equals(operation, sysLog.operation) && Objects.equals(time, sysLog.time) && Objects.equals(method, sysLog.method) && Objects.equals(params, sysLog.params) && Objects.equals(ip, sysLog.ip) && Objects.equals(gmtCreate, sysLog.gmtCreate) && Objects.equals(orgId, sysLog.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, username, operation, time, method, params, ip, gmtCreate, orgId);
    }
}
