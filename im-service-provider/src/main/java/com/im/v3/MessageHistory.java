package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "message_history", schema = "im-v3", catalog = "")
public class MessageHistory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "uuid", nullable = true, length = 32)
    private String uuid;
    @Basic
    @Column(name = "date", nullable = true, length = 255)
    private String date;
    @Basic
    @Column(name = "from_headpic", nullable = true, length = 255)
    private String fromHeadpic;
    @Basic
    @Column(name = "old_txt", nullable = true, length = -1)
    private String oldTxt;
    @Basic
    @Column(name = "to_uid", nullable = true, length = 32)
    private String toUid;
    @Basic
    @Column(name = "to_groupid", nullable = true, length = 32)
    private String toGroupid;
    @Basic
    @Column(name = "chatid", nullable = true, length = 32)
    private String chatid;
    @Basic
    @Column(name = "psr", nullable = true, length = 255)
    private String psr;
    @Basic
    @Column(name = "txt", nullable = true, length = -1)
    private String txt;
    @Basic
    @Column(name = "aite", nullable = true, length = 255)
    private String aite;
    @Basic
    @Column(name = "from_uid", nullable = true, length = 32)
    private String fromUid;
    @Basic
    @Column(name = "from_name", nullable = true, length = 255)
    private String fromName;
    @Basic
    @Column(name = "simple_content", nullable = true, length = 255)
    private String simpleContent;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "modify_date", nullable = true)
    private Timestamp modifyDate;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFromHeadpic() {
        return fromHeadpic;
    }

    public void setFromHeadpic(String fromHeadpic) {
        this.fromHeadpic = fromHeadpic;
    }

    public String getOldTxt() {
        return oldTxt;
    }

    public void setOldTxt(String oldTxt) {
        this.oldTxt = oldTxt;
    }

    public String getToUid() {
        return toUid;
    }

    public void setToUid(String toUid) {
        this.toUid = toUid;
    }

    public String getToGroupid() {
        return toGroupid;
    }

    public void setToGroupid(String toGroupid) {
        this.toGroupid = toGroupid;
    }

    public String getChatid() {
        return chatid;
    }

    public void setChatid(String chatid) {
        this.chatid = chatid;
    }

    public String getPsr() {
        return psr;
    }

    public void setPsr(String psr) {
        this.psr = psr;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getAite() {
        return aite;
    }

    public void setAite(String aite) {
        this.aite = aite;
    }

    public String getFromUid() {
        return fromUid;
    }

    public void setFromUid(String fromUid) {
        this.fromUid = fromUid;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getSimpleContent() {
        return simpleContent;
    }

    public void setSimpleContent(String simpleContent) {
        this.simpleContent = simpleContent;
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
        MessageHistory that = (MessageHistory) o;
        return Objects.equals(id, that.id) && Objects.equals(uuid, that.uuid) && Objects.equals(date, that.date) && Objects.equals(fromHeadpic, that.fromHeadpic) && Objects.equals(oldTxt, that.oldTxt) && Objects.equals(toUid, that.toUid) && Objects.equals(toGroupid, that.toGroupid) && Objects.equals(chatid, that.chatid) && Objects.equals(psr, that.psr) && Objects.equals(txt, that.txt) && Objects.equals(aite, that.aite) && Objects.equals(fromUid, that.fromUid) && Objects.equals(fromName, that.fromName) && Objects.equals(simpleContent, that.simpleContent) && Objects.equals(createDate, that.createDate) && Objects.equals(modifyDate, that.modifyDate) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, date, fromHeadpic, oldTxt, toUid, toGroupid, chatid, psr, txt, aite, fromUid, fromName, simpleContent, createDate, modifyDate, orgId);
    }
}
