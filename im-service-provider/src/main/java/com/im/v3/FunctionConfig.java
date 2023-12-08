package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "function_config", schema = "im-v3", catalog = "")
public class FunctionConfig {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "org_id", nullable = true, length = 32)
    private String orgId;
    @Basic
    @Column(name = "web_app_regist", nullable = true)
    private Integer webAppRegist;
    @Basic
    @Column(name = "web_app_ip_show", nullable = true)
    private Integer webAppIpShow;
    @Basic
    @Column(name = "max_login_counts", nullable = true)
    private Integer maxLoginCounts;
    @Basic
    @Column(name = "safe_login", nullable = true)
    private Integer safeLogin;
    @Basic
    @Column(name = "safe_login_retry_counts", nullable = true)
    private Integer safeLoginRetryCounts;
    @Basic
    @Column(name = "safe_login_apply_blacklist", nullable = true)
    private Integer safeLoginApplyBlacklist;
    @Basic
    @Column(name = "add_friend", nullable = true)
    private Integer addFriend;
    @Basic
    @Column(name = "create_room", nullable = true)
    private Integer createRoom;
    @Basic
    @Column(name = "phone_verify", nullable = true)
    private Integer phoneVerify;
    @Basic
    @Column(name = "out_room_del_message", nullable = true)
    private Integer outRoomDelMessage;
    @Basic
    @Column(name = "miss_room_maneger_msg", nullable = true)
    private Integer missRoomManegerMsg;
    @Basic
    @Column(name = "is_frozen", nullable = true)
    private Integer isFrozen;
    @Basic
    @Column(name = "ip_black", nullable = true)
    private Integer ipBlack;
    @Basic
    @Column(name = "ip_white", nullable = true)
    private Integer ipWhite;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "modify_date", nullable = true)
    private Timestamp modifyDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Integer getWebAppRegist() {
        return webAppRegist;
    }

    public void setWebAppRegist(Integer webAppRegist) {
        this.webAppRegist = webAppRegist;
    }

    public Integer getWebAppIpShow() {
        return webAppIpShow;
    }

    public void setWebAppIpShow(Integer webAppIpShow) {
        this.webAppIpShow = webAppIpShow;
    }

    public Integer getMaxLoginCounts() {
        return maxLoginCounts;
    }

    public void setMaxLoginCounts(Integer maxLoginCounts) {
        this.maxLoginCounts = maxLoginCounts;
    }

    public Integer getSafeLogin() {
        return safeLogin;
    }

    public void setSafeLogin(Integer safeLogin) {
        this.safeLogin = safeLogin;
    }

    public Integer getSafeLoginRetryCounts() {
        return safeLoginRetryCounts;
    }

    public void setSafeLoginRetryCounts(Integer safeLoginRetryCounts) {
        this.safeLoginRetryCounts = safeLoginRetryCounts;
    }

    public Integer getSafeLoginApplyBlacklist() {
        return safeLoginApplyBlacklist;
    }

    public void setSafeLoginApplyBlacklist(Integer safeLoginApplyBlacklist) {
        this.safeLoginApplyBlacklist = safeLoginApplyBlacklist;
    }

    public Integer getAddFriend() {
        return addFriend;
    }

    public void setAddFriend(Integer addFriend) {
        this.addFriend = addFriend;
    }

    public Integer getCreateRoom() {
        return createRoom;
    }

    public void setCreateRoom(Integer createRoom) {
        this.createRoom = createRoom;
    }

    public Integer getPhoneVerify() {
        return phoneVerify;
    }

    public void setPhoneVerify(Integer phoneVerify) {
        this.phoneVerify = phoneVerify;
    }

    public Integer getOutRoomDelMessage() {
        return outRoomDelMessage;
    }

    public void setOutRoomDelMessage(Integer outRoomDelMessage) {
        this.outRoomDelMessage = outRoomDelMessage;
    }

    public Integer getMissRoomManegerMsg() {
        return missRoomManegerMsg;
    }

    public void setMissRoomManegerMsg(Integer missRoomManegerMsg) {
        this.missRoomManegerMsg = missRoomManegerMsg;
    }

    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public Integer getIpBlack() {
        return ipBlack;
    }

    public void setIpBlack(Integer ipBlack) {
        this.ipBlack = ipBlack;
    }

    public Integer getIpWhite() {
        return ipWhite;
    }

    public void setIpWhite(Integer ipWhite) {
        this.ipWhite = ipWhite;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionConfig that = (FunctionConfig) o;
        return Objects.equals(id, that.id) && Objects.equals(orgId, that.orgId) && Objects.equals(webAppRegist, that.webAppRegist) && Objects.equals(webAppIpShow, that.webAppIpShow) && Objects.equals(maxLoginCounts, that.maxLoginCounts) && Objects.equals(safeLogin, that.safeLogin) && Objects.equals(safeLoginRetryCounts, that.safeLoginRetryCounts) && Objects.equals(safeLoginApplyBlacklist, that.safeLoginApplyBlacklist) && Objects.equals(addFriend, that.addFriend) && Objects.equals(createRoom, that.createRoom) && Objects.equals(phoneVerify, that.phoneVerify) && Objects.equals(outRoomDelMessage, that.outRoomDelMessage) && Objects.equals(missRoomManegerMsg, that.missRoomManegerMsg) && Objects.equals(isFrozen, that.isFrozen) && Objects.equals(ipBlack, that.ipBlack) && Objects.equals(ipWhite, that.ipWhite) && Objects.equals(createDate, that.createDate) && Objects.equals(modifyDate, that.modifyDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgId, webAppRegist, webAppIpShow, maxLoginCounts, safeLogin, safeLoginRetryCounts, safeLoginApplyBlacklist, addFriend, createRoom, phoneVerify, outRoomDelMessage, missRoomManegerMsg, isFrozen, ipBlack, ipWhite, createDate, modifyDate);
    }
}
