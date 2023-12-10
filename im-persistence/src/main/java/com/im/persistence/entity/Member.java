package com.im.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author jojo
 * @since 2023-12-10 10:03:23
 */
@Getter
@Setter
public class Member implements Serializable {

    //普通用户,机器人,代理
    public enum MEMBER_TYPE {
        USER,ROBOT,AGENT
    }

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private String headpic;

    private LocalDateTime lastLoginDate;

    private String lastLoginIp;

    private Object money;

    private String nickName;

    private String parent;

    private String parentPath;

    private String password;

    private String registIp;

    private Integer status;

    private String telphone;

    private Object txMoney;

    private Object txMoneyIng;

    private String memberId;

    private Object losePriceSum;

    private Integer openRedCount;

    private String username;

    private Object openRedPriceSum;

    private Object rechargePriceSum;

    private LocalDateTime modifyDate;

    private Integer sendRedCount;

    private Object sendRedPriceSum;

    private Object txPriceSum;

    private Object winPriceSum;

    private String qrCodeImg;

    private Object tichenPriceSum;

    private String preTxImg;

    private Integer preTxPay;

    private MEMBER_TYPE memberType = MEMBER_TYPE.USER;

    private String parentmid;

    private Integer oneLevelCount;

    private Object rechargePriceToday;

    private Object tichenPriceToday;

    private Object txPriceToday;

    private String preBankAddr;

    private String preBankBelonger;

    private String preBankCode;

    private String preBankName;

    private String wxOpenId;

    private String qqOpenId;

    private String sex;

    private String payPwd;

    private Integer sendTransferCount;

    private Object sendTransferPriceSum;

    private Integer shimingStatus;

    private Integer sysGenerate;

    private String inviteCode;

    /**
     * 站点ID
     */
    private Integer orgId;
}
