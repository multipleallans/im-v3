package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "yy_ip_list", schema = "im-v3", catalog = "")
public class YyIpList {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "ip_address", nullable = false, length = 15)
    private String ipAddress;
    @Basic
    @Column(name = "note", nullable = true, length = 256)
    private String note;
    @Basic
    @Column(name = "type", nullable = true, length = 1)
    private String type;
    @Basic
    @Column(name = "stauts", nullable = true, length = 1)
    private String stauts;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts;
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
        YyIpList yyIpList = (YyIpList) o;
        return id == yyIpList.id && Objects.equals(ipAddress, yyIpList.ipAddress) && Objects.equals(note, yyIpList.note) && Objects.equals(type, yyIpList.type) && Objects.equals(stauts, yyIpList.stauts) && Objects.equals(orgId, yyIpList.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ipAddress, note, type, stauts, orgId);
    }
}
