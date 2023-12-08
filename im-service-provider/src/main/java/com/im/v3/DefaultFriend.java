package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "default_friend", schema = "im-v3", catalog = "")
public class DefaultFriend {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "friend_id", nullable = true, length = 32)
    private String friendId;
    @Basic
    @Column(name = "note", nullable = true, length = 255)
    private String note;
    @Basic
    @Column(name = "send_hello_msg", nullable = true, length = 255)
    private String sendHelloMsg;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSendHelloMsg() {
        return sendHelloMsg;
    }

    public void setSendHelloMsg(String sendHelloMsg) {
        this.sendHelloMsg = sendHelloMsg;
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
        DefaultFriend that = (DefaultFriend) o;
        return Objects.equals(id, that.id) && Objects.equals(friendId, that.friendId) && Objects.equals(note, that.note) && Objects.equals(sendHelloMsg, that.sendHelloMsg) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, friendId, note, sendHelloMsg, orgId);
    }
}
