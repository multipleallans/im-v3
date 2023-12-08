package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "yy_send_group_msg", schema = "im-v3", catalog = "")
public class YySendGroupMsg {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "send_member_ids", nullable = true, length = 32)
    private String sendMemberIds;
    @Basic
    @Column(name = "msg_type", nullable = true, length = 2)
    private String msgType;
    @Basic
    @Column(name = "message", nullable = true, length = -1)
    private String message;
    @Basic
    @Column(name = "picture", nullable = true, length = 64)
    private String picture;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendMemberIds() {
        return sendMemberIds;
    }

    public void setSendMemberIds(String sendMemberIds) {
        this.sendMemberIds = sendMemberIds;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
        YySendGroupMsg that = (YySendGroupMsg) o;
        return Objects.equals(id, that.id) && Objects.equals(sendMemberIds, that.sendMemberIds) && Objects.equals(msgType, that.msgType) && Objects.equals(message, that.message) && Objects.equals(picture, that.picture) && Objects.equals(createTime, that.createTime) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sendMemberIds, msgType, message, picture, createTime, orgId);
    }
}
