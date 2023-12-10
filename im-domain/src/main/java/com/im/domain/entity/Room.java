package com.im.domain.entity;

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
 * @since 2023-12-10 06:29:53
 */
@Getter
@Setter
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String descri;

    private String headImg;

    private String name;

    private Object openerPrice;

    private Object sendPrice;

    private Integer status;

    private Integer controlGame;

    private Integer controlModel;

    private Integer gameType;

    private Integer limitNum;

    private Object openFeeAdd;

    private Object openFeeSum;

    private String owner;

    private Object playerWinRateS1;

    private String psw;

    private Integer sendCount;

    private Object sendFeeAdd;

    private Object sendFeeSum;

    private String unDead;

    private Object playerOpenWinRateS1;

    private Object playerSendWinRateS1;

    private String roomId;

    private String props;

    private String subname;

    private String fixedRobotIds;

    private Object winFeeAdd;

    private Object winFeeSum;

    private String rulePic;

    private Integer gameStatus;

    private LocalDateTime endDate;

    private String ownerUUID;

    private Integer independence;

    private String agentRedFanDian;

    private Integer maxRobotCount;

    private Integer openRedDelayEnd;

    private Integer openRedDelayStart;

    private String fateqqCodepayId;

    private String fateqqKey;

    private String fateqqToken;

    private String domain;

    private Integer robotRule;

    private String memberIds;

    private String stopspeakMemberIds;

    private String memberMgrIds;

    private Integer yaoqingAble;

    private Integer yaoqingAuditAble;

    private Integer useCustomHeadpic;

    private Integer orgId;
}
