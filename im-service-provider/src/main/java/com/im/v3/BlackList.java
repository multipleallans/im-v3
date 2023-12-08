package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "black_list", schema = "im-v3", catalog = "")
public class BlackList {
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
    @Column(name = "blacklist_ids", nullable = true, length = -1)
    private String blacklistIds;
    @Basic
    @Column(name = "mid", nullable = true, length = 255)
    private String mid;

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

    public String getBlacklistIds() {
        return blacklistIds;
    }

    public void setBlacklistIds(String blacklistIds) {
        this.blacklistIds = blacklistIds;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackList blackList = (BlackList) o;
        return Objects.equals(id, blackList.id) && Objects.equals(createDate, blackList.createDate) && Objects.equals(modifyDate, blackList.modifyDate) && Objects.equals(blacklistIds, blackList.blacklistIds) && Objects.equals(mid, blackList.mid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, modifyDate, blacklistIds, mid);
    }
}
