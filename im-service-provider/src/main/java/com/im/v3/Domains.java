package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Domains {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "domain_id", nullable = false)
    private int domainId;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "http_domain", nullable = true, length = 32)
    private String httpDomain;
    @Basic
    @Column(name = "ws_domain", nullable = true, length = 32)
    private String wsDomain;
    @Basic
    @Column(name = "oss_domain", nullable = true, length = 64)
    private String ossDomain;
    @Basic
    @Column(name = "admin_domain", nullable = true, length = 32)
    private String adminDomain;

    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getHttpDomain() {
        return httpDomain;
    }

    public void setHttpDomain(String httpDomain) {
        this.httpDomain = httpDomain;
    }

    public String getWsDomain() {
        return wsDomain;
    }

    public void setWsDomain(String wsDomain) {
        this.wsDomain = wsDomain;
    }

    public String getOssDomain() {
        return ossDomain;
    }

    public void setOssDomain(String ossDomain) {
        this.ossDomain = ossDomain;
    }

    public String getAdminDomain() {
        return adminDomain;
    }

    public void setAdminDomain(String adminDomain) {
        this.adminDomain = adminDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domains domains = (Domains) o;
        return domainId == domains.domainId && Objects.equals(orgId, domains.orgId) && Objects.equals(httpDomain, domains.httpDomain) && Objects.equals(wsDomain, domains.wsDomain) && Objects.equals(ossDomain, domains.ossDomain) && Objects.equals(adminDomain, domains.adminDomain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, orgId, httpDomain, wsDomain, ossDomain, adminDomain);
    }
}
