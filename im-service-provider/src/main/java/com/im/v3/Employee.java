package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Employee {
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
    @Column(name = "invite_code", nullable = true, length = 32)
    private String inviteCode;
    @Basic
    @Column(name = "member_id", nullable = true, length = 255)
    private String memberId;
    @Basic
    @Column(name = "member_uuid", nullable = true, length = 255)
    private String memberUuid;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "ip_white", nullable = true, length = 32)
    private String ipWhite;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;
    @Basic
    @Column(name = "user_status", nullable = true)
    private Integer userStatus;

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

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberUuid() {
        return memberUuid;
    }

    public void setMemberUuid(String memberUuid) {
        this.memberUuid = memberUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpWhite() {
        return ipWhite;
    }

    public void setIpWhite(String ipWhite) {
        this.ipWhite = ipWhite;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(createDate, employee.createDate) && Objects.equals(modifyDate, employee.modifyDate) && Objects.equals(inviteCode, employee.inviteCode) && Objects.equals(memberId, employee.memberId) && Objects.equals(memberUuid, employee.memberUuid) && Objects.equals(name, employee.name) && Objects.equals(ipWhite, employee.ipWhite) && Objects.equals(orgId, employee.orgId) && Objects.equals(userStatus, employee.userStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, modifyDate, inviteCode, memberId, memberUuid, name, ipWhite, orgId, userStatus);
    }
}
