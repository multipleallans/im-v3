package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "default_portrait", schema = "im-v3", catalog = "")
public class DefaultPortrait {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "img_addres", nullable = true, length = 255)
    private String imgAddres;
    @Basic
    @Column(name = "up_time", nullable = true)
    private Timestamp upTime;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgAddres() {
        return imgAddres;
    }

    public void setImgAddres(String imgAddres) {
        this.imgAddres = imgAddres;
    }

    public Timestamp getUpTime() {
        return upTime;
    }

    public void setUpTime(Timestamp upTime) {
        this.upTime = upTime;
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
        DefaultPortrait that = (DefaultPortrait) o;
        return Objects.equals(id, that.id) && Objects.equals(imgAddres, that.imgAddres) && Objects.equals(upTime, that.upTime) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imgAddres, upTime, orgId);
    }
}
