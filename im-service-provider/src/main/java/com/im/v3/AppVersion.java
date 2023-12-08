package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "app_version", schema = "im-v3", catalog = "")
public class AppVersion {
    @Basic
    @Column(name = "down_url", nullable = false, length = 255)
    private String downUrl;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;
    @Basic
    @Column(name = "version", nullable = false, length = 25)
    private String version;
    @Basic
    @Column(name = "descript", nullable = true, length = 255)
    private String descript;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "device_type", nullable = false, length = 25)
    private String deviceType;
    @Basic
    @Column(name = "force_update", nullable = false)
    private byte forceUpdate;
    @Basic
    @Column(name = "is_show", nullable = true, length = 5)
    private String isShow;
    @Basic
    @Column(name = "app_id", nullable = true, length = 25)
    private String appId;
    @Basic
    @Column(name = "app_name", nullable = true, length = 255)
    private String appName;

    public String getDownUrl() {
        return downUrl;
    }

    public void setDownUrl(String downUrl) {
        this.downUrl = downUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public byte getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(byte forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppVersion that = (AppVersion) o;
        return id == that.id && forceUpdate == that.forceUpdate && Objects.equals(downUrl, that.downUrl) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(gmtModified, that.gmtModified) && Objects.equals(version, that.version) && Objects.equals(descript, that.descript) && Objects.equals(orgId, that.orgId) && Objects.equals(deviceType, that.deviceType) && Objects.equals(isShow, that.isShow) && Objects.equals(appId, that.appId) && Objects.equals(appName, that.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downUrl, id, gmtCreate, gmtModified, version, descript, orgId, deviceType, forceUpdate, isShow, appId, appName);
    }
}
