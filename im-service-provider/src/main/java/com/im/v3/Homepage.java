package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Homepage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "icon", nullable = true, length = 255)
    private String icon;
    @Basic
    @Column(name = "link", nullable = true, length = 255)
    private String link;
    @Basic
    @Column(name = "paramter_open", nullable = true)
    private Integer paramterOpen;
    @Basic
    @Column(name = "rule", nullable = true)
    private Integer rule;
    @Basic
    @Column(name = "sort", nullable = true)
    private Integer sort;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "info", nullable = true, length = -1)
    private String info;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getParamterOpen() {
        return paramterOpen;
    }

    public void setParamterOpen(Integer paramterOpen) {
        this.paramterOpen = paramterOpen;
    }

    public Integer getRule() {
        return rule;
    }

    public void setRule(Integer rule) {
        this.rule = rule;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homepage homepage = (Homepage) o;
        return Objects.equals(id, homepage.id) && Objects.equals(name, homepage.name) && Objects.equals(icon, homepage.icon) && Objects.equals(link, homepage.link) && Objects.equals(paramterOpen, homepage.paramterOpen) && Objects.equals(rule, homepage.rule) && Objects.equals(sort, homepage.sort) && Objects.equals(orgId, homepage.orgId) && Objects.equals(info, homepage.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, icon, link, paramterOpen, rule, sort, orgId, info);
    }
}
