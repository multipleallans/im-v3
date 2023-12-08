package com.im.v3;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "ip_white", schema = "im-v3", catalog = "")
public class IpWhite {
    @Basic
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "ip_address", nullable = true, length = 20)
    private String ipAddress;
    @Basic
    @Column(name = "ip_address_start", nullable = true, length = 20)
    private String ipAddressStart;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @Basic
    @Column(name = "note", nullable = true, length = 255)
    private String note;
    @Basic
    @Column(name = "type", nullable = true)
    private Integer type;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddressStart() {
        return ipAddressStart;
    }

    public void setIpAddressStart(String ipAddressStart) {
        this.ipAddressStart = ipAddressStart;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        IpWhite ipWhite = (IpWhite) o;
        return Objects.equals(id, ipWhite.id) && Objects.equals(ipAddress, ipWhite.ipAddress) && Objects.equals(ipAddressStart, ipWhite.ipAddressStart) && Objects.equals(status, ipWhite.status) && Objects.equals(note, ipWhite.note) && Objects.equals(type, ipWhite.type) && Objects.equals(orgId, ipWhite.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ipAddress, ipAddressStart, status, note, type, orgId);
    }
}
