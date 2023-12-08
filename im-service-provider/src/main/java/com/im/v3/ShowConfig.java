package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "show_config", schema = "im-v3", catalog = "")
public class ShowConfig {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "orgid", nullable = true, length = 8)
    private String orgid;
    @Basic
    @Column(name = "contact", nullable = true, length = 255)
    private String contact;
    @Basic
    @Column(name = "app_start_img", nullable = true, length = 255)
    private String appStartImg;
    @Basic
    @Column(name = "icon", nullable = true, length = 255)
    private String icon;
    @Basic
    @Column(name = "logo", nullable = true, length = 255)
    private String logo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAppStartImg() {
        return appStartImg;
    }

    public void setAppStartImg(String appStartImg) {
        this.appStartImg = appStartImg;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowConfig that = (ShowConfig) o;
        return Objects.equals(id, that.id) && Objects.equals(orgid, that.orgid) && Objects.equals(contact, that.contact) && Objects.equals(appStartImg, that.appStartImg) && Objects.equals(icon, that.icon) && Objects.equals(logo, that.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgid, contact, appStartImg, icon, logo);
    }
}
