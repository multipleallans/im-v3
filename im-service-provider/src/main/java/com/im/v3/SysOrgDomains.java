package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "sys_org_domains", schema = "im-v3", catalog = "")
public class SysOrgDomains {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Long orgId;
    @Basic
    @Column(name = "domain_id", nullable = true)
    private Integer domainId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysOrgDomains that = (SysOrgDomains) o;
        return id == that.id && Objects.equals(orgId, that.orgId) && Objects.equals(domainId, that.domainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgId, domainId);
    }
}
