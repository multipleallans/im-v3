package com.im.domain.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

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


    private static final long serialVersionUID = 1L;

    private String id;

    private Date createDate;

    private String headpic;

    private Date lastLoginDate;

    private String lastLoginIp;

    private Double money;

    private String nickName;

    private String parent;

    private String parentPath;

    private String password;

    private String registIp;

    private Integer status;

    private String telphone;

    private Object txMoney;

    private Double txMoneyIng;

    private String memberId;

    @EnumValue
    private MemberType memberType = MemberType.USER;

    private Double losePriceSum;

    private Integer openRedCount;

    private String username;

    private Double openRedPriceSum;

    private Double rechargePriceSum;

    private Date modifyDate;

    private Integer sendRedCount;

    private Double sendRedPriceSum;

    private Double txPriceSum;

    private Double winPriceSum;

    private String qrCodeImg;

    private Double tichenPriceSum;

    private String preTxImg;

    private Integer preTxPay;

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
