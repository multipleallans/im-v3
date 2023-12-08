package com.im.v3;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "employee_default_message", schema = "im-v3", catalog = "")
public class EmployeeDefaultMessage {
    @Basic
    @Column(name = "employee_id", nullable = false, length = 32)
    private String employeeId;
    @Basic
    @Column(name = "member_id", nullable = false, length = 32)
    private String memberId;
    @Basic
    @Column(name = "msg_1", nullable = true, length = 254)
    private String msg1;
    @Basic
    @Column(name = "msg_2", nullable = true, length = 254)
    private String msg2;
    @Basic
    @Column(name = "msg_3", nullable = true, length = 254)
    private String msg3;
    @Basic
    @Column(name = "picture_1", nullable = true, length = 254)
    private String picture1;
    @Basic
    @Column(name = "picture_2", nullable = true, length = 254)
    private String picture2;
    @Basic
    @Column(name = "picture_3", nullable = true, length = 254)
    private String picture3;
    @Basic
    @Column(name = "picture_4", nullable = true, length = 254)
    private String picture4;
    @Basic
    @Column(name = "picture_5", nullable = true, length = 254)
    private String picture5;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "invite_code", nullable = true, length = 12)
    private String inviteCode;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public String getMsg3() {
        return msg3;
    }

    public void setMsg3(String msg3) {
        this.msg3 = msg3;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getPicture4() {
        return picture4;
    }

    public void setPicture4(String picture4) {
        this.picture4 = picture4;
    }

    public String getPicture5() {
        return picture5;
    }

    public void setPicture5(String picture5) {
        this.picture5 = picture5;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
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
        EmployeeDefaultMessage that = (EmployeeDefaultMessage) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(memberId, that.memberId) && Objects.equals(msg1, that.msg1) && Objects.equals(msg2, that.msg2) && Objects.equals(msg3, that.msg3) && Objects.equals(picture1, that.picture1) && Objects.equals(picture2, that.picture2) && Objects.equals(picture3, that.picture3) && Objects.equals(picture4, that.picture4) && Objects.equals(picture5, that.picture5) && Objects.equals(id, that.id) && Objects.equals(inviteCode, that.inviteCode) && Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, memberId, msg1, msg2, msg3, picture1, picture2, picture3, picture4, picture5, id, inviteCode, orgId);
    }
}
