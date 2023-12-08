package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Member {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 32)
    private String id;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "headpic", nullable = true, length = 255)
    private String headpic;
    @Basic
    @Column(name = "last_login_date", nullable = true)
    private Timestamp lastLoginDate;
    @Basic
    @Column(name = "last_login_ip", nullable = true, length = 255)
    private String lastLoginIp;
    @Basic
    @Column(name = "money", nullable = true, precision = 3)
    private Double money;
    @Basic
    @Column(name = "nick_name", nullable = true, length = 255)
    private String nickName;
    @Basic
    @Column(name = "parent", nullable = true, length = 255)
    private String parent;
    @Basic
    @Column(name = "parent_path", nullable = true, length = -1)
    private String parentPath;
    @Basic
    @Column(name = "password", nullable = true, length = 255)
    private String password;
    @Basic
    @Column(name = "regist_ip", nullable = true, length = 255)
    private String registIp;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @Basic
    @Column(name = "telphone", nullable = true, length = 255)
    private String telphone;
    @Basic
    @Column(name = "tx_money", nullable = true, precision = 2)
    private Double txMoney;
    @Basic
    @Column(name = "tx_money_ing", nullable = true, precision = 2)
    private Double txMoneyIng;
    @Basic
    @Column(name = "member_id", nullable = true, length = 255)
    private String memberId;
    @Basic
    @Column(name = "lose_price_sum", nullable = true, precision = 2)
    private Double losePriceSum;
    @Basic
    @Column(name = "open_red_count", nullable = true)
    private Integer openRedCount;
    @Basic
    @Column(name = "username", nullable = true, length = 255)
    private String username;
    @Basic
    @Column(name = "open_red_price_sum", nullable = true, precision = 2)
    private Double openRedPriceSum;
    @Basic
    @Column(name = "recharge_price_sum", nullable = true, precision = 2)
    private Double rechargePriceSum;
    @Basic
    @Column(name = "modify_date", nullable = true)
    private Timestamp modifyDate;
    @Basic
    @Column(name = "send_red_count", nullable = true)
    private Integer sendRedCount;
    @Basic
    @Column(name = "send_red_price_sum", nullable = true, precision = 2)
    private Double sendRedPriceSum;
    @Basic
    @Column(name = "tx_price_sum", nullable = true, precision = 2)
    private Double txPriceSum;
    @Basic
    @Column(name = "win_price_sum", nullable = true, precision = 2)
    private Double winPriceSum;
    @Basic
    @Column(name = "qr_code_img", nullable = true, length = 255)
    private String qrCodeImg;
    @Basic
    @Column(name = "tichen_price_sum", nullable = true, precision = 3)
    private Double tichenPriceSum;
    @Basic
    @Column(name = "pre_tx_img", nullable = true, length = 255)
    private String preTxImg;
    @Basic
    @Column(name = "pre_tx_pay", nullable = true)
    private Integer preTxPay;
    @Basic
    @Column(name = "member_type", nullable = true)
    private Integer memberType;
    @Basic
    @Column(name = "parentmid", nullable = true, length = 255)
    private String parentmid;
    @Basic
    @Column(name = "one_level_count", nullable = true)
    private Integer oneLevelCount;
    @Basic
    @Column(name = "recharge_price_today", nullable = true, precision = 0)
    private Double rechargePriceToday;
    @Basic
    @Column(name = "tichen_price_today", nullable = true, precision = 0)
    private Double tichenPriceToday;
    @Basic
    @Column(name = "tx_price_today", nullable = true, precision = 0)
    private Double txPriceToday;
    @Basic
    @Column(name = "pre_bank_addr", nullable = true, length = 255)
    private String preBankAddr;
    @Basic
    @Column(name = "pre_bank_belonger", nullable = true, length = 255)
    private String preBankBelonger;
    @Basic
    @Column(name = "pre_bank_code", nullable = true, length = 255)
    private String preBankCode;
    @Basic
    @Column(name = "pre_bank_name", nullable = true, length = 255)
    private String preBankName;
    @Basic
    @Column(name = "wx_open_id", nullable = true, length = 255)
    private String wxOpenId;
    @Basic
    @Column(name = "qq_open_id", nullable = true, length = 255)
    private String qqOpenId;
    @Basic
    @Column(name = "sex", nullable = true, length = 255)
    private String sex;
    @Basic
    @Column(name = "pay_pwd", nullable = true, length = 255)
    private String payPwd;
    @Basic
    @Column(name = "send_transfer_count", nullable = true)
    private Integer sendTransferCount;
    @Basic
    @Column(name = "send_transfer_price_sum", nullable = true, precision = 0)
    private Double sendTransferPriceSum;
    @Basic
    @Column(name = "shiming_status", nullable = true)
    private Integer shimingStatus;
    @Basic
    @Column(name = "sys_generate", nullable = true)
    private Integer sysGenerate;
    @Basic
    @Column(name = "invite_code", nullable = true, length = 16)
    private String inviteCode;
    @Basic
    @Column(name = "org_id", nullable = true)
    private Integer orgId;

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

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistIp() {
        return registIp;
    }

    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Double getTxMoney() {
        return txMoney;
    }

    public void setTxMoney(Double txMoney) {
        this.txMoney = txMoney;
    }

    public Double getTxMoneyIng() {
        return txMoneyIng;
    }

    public void setTxMoneyIng(Double txMoneyIng) {
        this.txMoneyIng = txMoneyIng;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Double getLosePriceSum() {
        return losePriceSum;
    }

    public void setLosePriceSum(Double losePriceSum) {
        this.losePriceSum = losePriceSum;
    }

    public Integer getOpenRedCount() {
        return openRedCount;
    }

    public void setOpenRedCount(Integer openRedCount) {
        this.openRedCount = openRedCount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getOpenRedPriceSum() {
        return openRedPriceSum;
    }

    public void setOpenRedPriceSum(Double openRedPriceSum) {
        this.openRedPriceSum = openRedPriceSum;
    }

    public Double getRechargePriceSum() {
        return rechargePriceSum;
    }

    public void setRechargePriceSum(Double rechargePriceSum) {
        this.rechargePriceSum = rechargePriceSum;
    }

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getSendRedCount() {
        return sendRedCount;
    }

    public void setSendRedCount(Integer sendRedCount) {
        this.sendRedCount = sendRedCount;
    }

    public Double getSendRedPriceSum() {
        return sendRedPriceSum;
    }

    public void setSendRedPriceSum(Double sendRedPriceSum) {
        this.sendRedPriceSum = sendRedPriceSum;
    }

    public Double getTxPriceSum() {
        return txPriceSum;
    }

    public void setTxPriceSum(Double txPriceSum) {
        this.txPriceSum = txPriceSum;
    }

    public Double getWinPriceSum() {
        return winPriceSum;
    }

    public void setWinPriceSum(Double winPriceSum) {
        this.winPriceSum = winPriceSum;
    }

    public String getQrCodeImg() {
        return qrCodeImg;
    }

    public void setQrCodeImg(String qrCodeImg) {
        this.qrCodeImg = qrCodeImg;
    }

    public Double getTichenPriceSum() {
        return tichenPriceSum;
    }

    public void setTichenPriceSum(Double tichenPriceSum) {
        this.tichenPriceSum = tichenPriceSum;
    }

    public String getPreTxImg() {
        return preTxImg;
    }

    public void setPreTxImg(String preTxImg) {
        this.preTxImg = preTxImg;
    }

    public Integer getPreTxPay() {
        return preTxPay;
    }

    public void setPreTxPay(Integer preTxPay) {
        this.preTxPay = preTxPay;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public String getParentmid() {
        return parentmid;
    }

    public void setParentmid(String parentmid) {
        this.parentmid = parentmid;
    }

    public Integer getOneLevelCount() {
        return oneLevelCount;
    }

    public void setOneLevelCount(Integer oneLevelCount) {
        this.oneLevelCount = oneLevelCount;
    }

    public Double getRechargePriceToday() {
        return rechargePriceToday;
    }

    public void setRechargePriceToday(Double rechargePriceToday) {
        this.rechargePriceToday = rechargePriceToday;
    }

    public Double getTichenPriceToday() {
        return tichenPriceToday;
    }

    public void setTichenPriceToday(Double tichenPriceToday) {
        this.tichenPriceToday = tichenPriceToday;
    }

    public Double getTxPriceToday() {
        return txPriceToday;
    }

    public void setTxPriceToday(Double txPriceToday) {
        this.txPriceToday = txPriceToday;
    }

    public String getPreBankAddr() {
        return preBankAddr;
    }

    public void setPreBankAddr(String preBankAddr) {
        this.preBankAddr = preBankAddr;
    }

    public String getPreBankBelonger() {
        return preBankBelonger;
    }

    public void setPreBankBelonger(String preBankBelonger) {
        this.preBankBelonger = preBankBelonger;
    }

    public String getPreBankCode() {
        return preBankCode;
    }

    public void setPreBankCode(String preBankCode) {
        this.preBankCode = preBankCode;
    }

    public String getPreBankName() {
        return preBankName;
    }

    public void setPreBankName(String preBankName) {
        this.preBankName = preBankName;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    public Integer getSendTransferCount() {
        return sendTransferCount;
    }

    public void setSendTransferCount(Integer sendTransferCount) {
        this.sendTransferCount = sendTransferCount;
    }

    public Double getSendTransferPriceSum() {
        return sendTransferPriceSum;
    }

    public void setSendTransferPriceSum(Double sendTransferPriceSum) {
        this.sendTransferPriceSum = sendTransferPriceSum;
    }

    public Integer getShimingStatus() {
        return shimingStatus;
    }

    public void setShimingStatus(Integer shimingStatus) {
        this.shimingStatus = shimingStatus;
    }

    public Integer getSysGenerate() {
        return sysGenerate;
    }

    public void setSysGenerate(Integer sysGenerate) {
        this.sysGenerate = sysGenerate;
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
        Member member = (Member) o;
        return Objects.equals(id, member.id) && Objects.equals(createDate, member.createDate) && Objects.equals(headpic, member.headpic) && Objects.equals(lastLoginDate, member.lastLoginDate) && Objects.equals(lastLoginIp, member.lastLoginIp) && Objects.equals(money, member.money) && Objects.equals(nickName, member.nickName) && Objects.equals(parent, member.parent) && Objects.equals(parentPath, member.parentPath) && Objects.equals(password, member.password) && Objects.equals(registIp, member.registIp) && Objects.equals(status, member.status) && Objects.equals(telphone, member.telphone) && Objects.equals(txMoney, member.txMoney) && Objects.equals(txMoneyIng, member.txMoneyIng) && Objects.equals(memberId, member.memberId) && Objects.equals(losePriceSum, member.losePriceSum) && Objects.equals(openRedCount, member.openRedCount) && Objects.equals(username, member.username) && Objects.equals(openRedPriceSum, member.openRedPriceSum) && Objects.equals(rechargePriceSum, member.rechargePriceSum) && Objects.equals(modifyDate, member.modifyDate) && Objects.equals(sendRedCount, member.sendRedCount) && Objects.equals(sendRedPriceSum, member.sendRedPriceSum) && Objects.equals(txPriceSum, member.txPriceSum) && Objects.equals(winPriceSum, member.winPriceSum) && Objects.equals(qrCodeImg, member.qrCodeImg) && Objects.equals(tichenPriceSum, member.tichenPriceSum) && Objects.equals(preTxImg, member.preTxImg) && Objects.equals(preTxPay, member.preTxPay) && Objects.equals(memberType, member.memberType) && Objects.equals(parentmid, member.parentmid) && Objects.equals(oneLevelCount, member.oneLevelCount) && Objects.equals(rechargePriceToday, member.rechargePriceToday) && Objects.equals(tichenPriceToday, member.tichenPriceToday) && Objects.equals(txPriceToday, member.txPriceToday) && Objects.equals(preBankAddr, member.preBankAddr) && Objects.equals(preBankBelonger, member.preBankBelonger) && Objects.equals(preBankCode, member.preBankCode) && Objects.equals(preBankName, member.preBankName) && Objects.equals(wxOpenId, member.wxOpenId) && Objects.equals(qqOpenId, member.qqOpenId) && Objects.equals(sex, member.sex) && Objects.equals(payPwd, member.payPwd) && Objects.equals(sendTransferCount, member.sendTransferCount) && Objects.equals(sendTransferPriceSum, member.sendTransferPriceSum) && Objects.equals(shimingStatus, member.shimingStatus) && Objects.equals(sysGenerate, member.sysGenerate) && Objects.equals(inviteCode, member.inviteCode) && Objects.equals(orgId, member.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, headpic, lastLoginDate, lastLoginIp, money, nickName, parent, parentPath, password, registIp, status, telphone, txMoney, txMoneyIng, memberId, losePriceSum, openRedCount, username, openRedPriceSum, rechargePriceSum, modifyDate, sendRedCount, sendRedPriceSum, txPriceSum, winPriceSum, qrCodeImg, tichenPriceSum, preTxImg, preTxPay, memberType, parentmid, oneLevelCount, rechargePriceToday, tichenPriceToday, txPriceToday, preBankAddr, preBankBelonger, preBankCode, preBankName, wxOpenId, qqOpenId, sex, payPwd, sendTransferCount, sendTransferPriceSum, shimingStatus, sysGenerate, inviteCode, orgId);
    }
}
