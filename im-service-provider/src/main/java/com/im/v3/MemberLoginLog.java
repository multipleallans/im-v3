package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member_login_log", schema = "im-v3", catalog = "")
public class MemberLoginLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "modify_date", nullable = true)
    private Timestamp modifyDate;
    @Basic
    @Column(name = "ip", nullable = true, length = 128)
    private String ip;
    @Basic
    @Column(name = "mid", nullable = true, length = 255)
    private String mid;
    @Basic
    @Column(name = "mnick_name", nullable = true, length = 255)
    private String mnickName;
    @Basic
    @Column(name = "mtel", nullable = true, length = 255)
    private String mtel;
    @Basic
    @Column(name = "device_type", nullable = true, length = 32)
    private String deviceType;
    @Basic
    @Column(name = "mhead_pic", nullable = true, length = 64)
    private String mheadPic;
    @Basic
    @Column(name = "username", nullable = true, length = 32)
    private String username;
    @Basic
    @Column(name = "device_version", nullable = true, length = 32)
    private String deviceVersion;
    @Basic
    @Column(name = "ip_addr", nullable = true, length = 255)
    private String ipAddr;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMnickName() {
        return mnickName;
    }

    public void setMnickName(String mnickName) {
        this.mnickName = mnickName;
    }

    public String getMtel() {
        return mtel;
    }

    public void setMtel(String mtel) {
        this.mtel = mtel;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getMheadPic() {
        return mheadPic;
    }

    public void setMheadPic(String mheadPic) {
        this.mheadPic = mheadPic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
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
        MemberLoginLog that = (MemberLoginLog) o;
        return Objects.equals(id, that.id) && Objects.equals(createDate, that.createDate) && Objects.equals(modifyDate, that.modifyDate) && Objects.equals(ip, that.ip) && Objects.equals(mid, that.mid) && Objects.equals(mnickName, that.mnickName) && Objects.equals(mtel, that.mtel) && Objects.equals(deviceType, that.deviceType) && Objects.equals(mheadPic, that.mheadPic) && Objects.equals(username, that.username) && Objects.equals(deviceVersion, that.deviceVersion) && Objects.equals(ipAddr, that.ipAddr) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, modifyDate, ip, mid, mnickName, mtel, deviceType, mheadPic, username, deviceVersion, ipAddr, orgId);
    }
}
