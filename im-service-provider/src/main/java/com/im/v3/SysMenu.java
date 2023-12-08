package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sys_menu", schema = "im-v3", catalog = "")
public class SysMenu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "menu_id", nullable = false)
    private long menuId;
    @Basic
    @Column(name = "parent_id", nullable = true)
    private Long parentId;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic
    @Column(name = "url", nullable = true, length = 200)
    private String url;
    @Basic
    @Column(name = "perms", nullable = true, length = 500)
    private String perms;
    @Basic
    @Column(name = "type", nullable = true)
    private Integer type;
    @Basic
    @Column(name = "icon", nullable = true, length = 50)
    private String icon;
    @Basic
    @Column(name = "order_num", nullable = true)
    private Integer orderNum;
    @Basic
    @Column(name = "gmt_create", nullable = true)
    private Timestamp gmtCreate;
    @Basic
    @Column(name = "gmt_modified", nullable = true)
    private Timestamp gmtModified;

    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysMenu sysMenu = (SysMenu) o;
        return menuId == sysMenu.menuId && Objects.equals(parentId, sysMenu.parentId) && Objects.equals(name, sysMenu.name) && Objects.equals(url, sysMenu.url) && Objects.equals(perms, sysMenu.perms) && Objects.equals(type, sysMenu.type) && Objects.equals(icon, sysMenu.icon) && Objects.equals(orderNum, sysMenu.orderNum) && Objects.equals(gmtCreate, sysMenu.gmtCreate) && Objects.equals(gmtModified, sysMenu.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, parentId, name, url, perms, type, icon, orderNum, gmtCreate, gmtModified);
    }
}
