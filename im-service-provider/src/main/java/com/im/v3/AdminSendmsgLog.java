package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "admin_sendmsg_log", schema = "im-v3", catalog = "")
public class AdminSendmsgLog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "send_admin_id", nullable = true, length = 32)
    private String sendAdminId;
    @Basic
    @Column(name = "send_admin_name", nullable = true, length = 255)
    private String sendAdminName;
    @Basic
    @Column(name = "txt", nullable = true, length = -1)
    private String txt;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "receiver_id", nullable = true, length = 32)
    private String receiverId;
    @Basic
    @Column(name = "receiver_name", nullable = true, length = 255)
    private String receiverName;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendAdminId() {
        return sendAdminId;
    }

    public void setSendAdminId(String sendAdminId) {
        this.sendAdminId = sendAdminId;
    }

    public String getSendAdminName() {
        return sendAdminName;
    }

    public void setSendAdminName(String sendAdminName) {
        this.sendAdminName = sendAdminName;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
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
        AdminSendmsgLog that = (AdminSendmsgLog) o;
        return Objects.equals(id, that.id) && Objects.equals(sendAdminId, that.sendAdminId) && Objects.equals(sendAdminName, that.sendAdminName) && Objects.equals(txt, that.txt) && Objects.equals(createDate, that.createDate) && Objects.equals(receiverId, that.receiverId) && Objects.equals(receiverName, that.receiverName) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sendAdminId, sendAdminName, txt, createDate, receiverId, receiverName, orgId);
    }
}
