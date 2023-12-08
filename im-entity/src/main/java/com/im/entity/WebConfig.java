package com.im.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2023-12-08 06:54:54
 */
@Getter
@Setter
@TableName("web_config")
public class WebConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime createDate;

    private LocalDateTime modifyDate;

    private String email;

    private String phone;

    private String qq;

    private String weblogo;

    private String websiteName;

    private String websiteUrl;

    private String wx;

    private Integer agentAddFen;

    private Integer agentBuy;

    private String agentRedFanDian;

    private Integer agentSubFen;

    private Integer controlWinLose;

    private Object loseRate;

    private Integer toSpeak;

    private Integer transferMoney;

    private Object userRegisterGiveGold;

    private Object winRate;

    private String welcomeStr;

    private String wanfa;

    private String kefuStr;

    private Object txMoneyMax;

    private Object txMoneyMin;

    private String dailiRulePic;

    private String dailiPosters;

    private Integer dailiPostersQrcodeLeft;

    private Integer dailiPostersQrcodeTop;

    private Object dailiPostersQrcodeHeight;

    private Object dailiPostersQrcodeWidth;

    private String smsApiKey;

    private String smsContent;

    private String fateqqCodepayId;

    private String fateqqKey;

    private String fateqqToken;

    private Object czMoneyMax;

    private Object czMoneyMin;

    private Integer gameDataKeepDay;

    private String dailiUrlRegisteredTo;

    private Integer showGameJieSuan;

    private Integer h5Moban;

    private String csMemberId;

    private String noticeStr;

    private Integer undeadHideMoneyWS;

    private Object openRedMoneyMaxScale;

    private String wxAppid;

    private String wxSecret;

    private Integer wxAutoLogin;

    private Integer addNewFriend;

    private String wxDomain;

    private String qqAppid;

    private String qqAppkey;

    private String qqDomain;

    private String createRoomPriceConf;

    private String site1Url;

    private Object txFee;

    private Integer chatMsgUndoSec;

    private Integer hongbaoExpireSec;

    private Integer transferExpireSec;

    private String registerCode;

    private Integer useRegisterCode;

    private String superUser;

    private String forbidRegister4ip;

    private Integer addNewFriendAble;

    private String addNewFriendAbleOthers;

    private String newRegAddFriends;

    private String newRegAddFriendsWelcomeWord;

    private Integer imFooterHotItemShow;

    private String imFooterHotItemName;

    private String imFooterHotItemUrl;

    private Integer roomMembersLimit;

    private Integer userHongBaoMaxPrice;

    private Integer lookGroupMemberDetailForRole;

    private Integer sendRedSm;

    private Integer shiming;

    private Integer transferSm;

    private Integer openRedSm;

    private Integer receivetransferSm;

    private Integer newFriendAuditOverdue;

    private Integer sendRederCanOpen4UserChat;

    private Integer regSms;

    private Integer chatUrlTxtCanLink;

    private String imFooterHotItemLogo;

    private String chatBackgroundImage;

    private String smsLoktongPwd;

    private String smsLoktongTemplateid;

    private String smsLoktongToken;

    private String smsLoktongUn;

    private Integer smsPlatform;

    private Integer showUserMsgReadStatus;

    private Integer showUserOnline;

    private Integer imFooterHotItemShowType;

    private String androidUpdDetails;

    private String androidUrl;

    private String iosUpdDetails;

    private String iosUrl;

    private String pcUpdDetails;

    private String pcUrl;

    private String sysVersionAndroid;

    private String sysVersionIos;

    private String sysVersionPc;

    private Integer useInviteCode;

    private String appIdUni;

    private String appKeyUni;

    private String masterSecretUni;

    private String mySecretaryName;

    private Integer memberIdLen;

    private Integer roomIdLen;

    private String signInCnf;

    private Object signIn1DayCoin;

    private Integer useSignIn;

    private String signInBtnBgColorIndex;

    private Integer clientChatDataKeepDays;

    private Integer cloudChatDataKeepDays;

    private Integer clientGroupChatMsgShowCount;

    private Integer clientUserChatMsgShowCount;

    private Integer cloudGroupChatDataKeepDays;

    private Integer cloudUserChatDataKeepDays;

    private String bankAccountrer;

    private String bankCardNum;

    private String bankName;

    private Integer orgId;
}
