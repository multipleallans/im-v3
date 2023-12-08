package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Favourite {
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
    @Column(name = "ctype", nullable = true)
    private Integer ctype;
    @Basic
    @Column(name = "jsonstr", nullable = true, length = -1)
    private String jsonstr;
    @Basic
    @Column(name = "uid", nullable = true, length = 255)
    private String uid;

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

    public Integer getCtype() {
        return ctype;
    }

    public void setCtype(Integer ctype) {
        this.ctype = ctype;
    }

    public String getJsonstr() {
        return jsonstr;
    }

    public void setJsonstr(String jsonstr) {
        this.jsonstr = jsonstr;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favourite favourite = (Favourite) o;
        return Objects.equals(id, favourite.id) && Objects.equals(createDate, favourite.createDate) && Objects.equals(modifyDate, favourite.modifyDate) && Objects.equals(ctype, favourite.ctype) && Objects.equals(jsonstr, favourite.jsonstr) && Objects.equals(uid, favourite.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, modifyDate, ctype, jsonstr, uid);
    }
}
