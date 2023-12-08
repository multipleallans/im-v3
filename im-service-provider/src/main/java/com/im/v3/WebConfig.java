package com.im.v3;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "web_config", schema = "im-v3", catalog = "")
public class WebConfig {
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
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    private String phone;
    @Basic
    @Column(name = "qq", nullable = true, length = 255)
    private String qq;
    @Basic
    @Column(name = "weblogo", nullable = true, length = 255)
    private String weblogo;
    @Basic
    @Column(name = "website_name", nullable = true, length = 255)
    private String websiteName;
    @Basic
    @Column(name = "website_url", nullable = true, length = 255)
    private String websiteUrl;
    @Basic
    @Column(name = "wx", nullable = true, length = 255)
    private String wx;
    @Basic
    @Column(name = "agent_add_fen", nullable = true)
    private Integer agentAddFen;
    @Basic
    @Column(name = "agent_buy", nullable = true)
    private Integer agentBuy;
    @Basic
    @Column(name = "agent_red_fan_dian", nullable = true, length = -1)
    private String agentRedFanDian;
    @Basic
    @Column(name = "agent_sub_fen", nullable = true)
    private Integer agentSubFen;
    @Basic
    @Column(name = "control_win_lose", nullable = true)
    private Integer controlWinLose;
    @Basic
    @Column(name = "lose_rate", nullable = true, precision = 2)
    private Double loseRate;
    @Basic
    @Column(name = "to_speak", nullable = true)
    private Integer toSpeak;
    @Basic
    @Column(name = "transfer_money", nullable = true)
    private Integer transferMoney;
    @Basic
    @Column(name = "user_register_give_gold", nullable = true, precision = 2)
    private Double userRegisterGiveGold;
    @Basic
    @Column(name = "win_rate", nullable = true, precision = 2)
    private Double winRate;
    @Basic
    @Column(name = "welcome_str", nullable = true, length = 255)
    private String welcomeStr;
    @Basic
    @Column(name = "wanfa", nullable = true, length = -1)
    private String wanfa;
    @Basic
    @Column(name = "kefu_str", nullable = true, length = -1)
    private String kefuStr;
    @Basic
    @Column(name = "tx_money_max", nullable = true, precision = 2)
    private Double txMoneyMax;
    @Basic
    @Column(name = "tx_money_min", nullable = true, precision = 2)
    private Double txMoneyMin;
    @Basic
    @Column(name = "daili_rule_pic", nullable = true, length = 255)
    private String dailiRulePic;
    @Basic
    @Column(name = "daili_posters", nullable = true, length = 255)
    private String dailiPosters;
    @Basic
    @Column(name = "daili_posters_qrcode_left", nullable = true)
    private Integer dailiPostersQrcodeLeft;
    @Basic
    @Column(name = "daili_posters_qrcode_top", nullable = true)
    private Integer dailiPostersQrcodeTop;
    @Basic
    @Column(name = "daili_posters_qrcode_height", nullable = true, precision = 0)
    private Double dailiPostersQrcodeHeight;
    @Basic
    @Column(name = "daili_posters_qrcode_width", nullable = true, precision = 0)
    private Double dailiPostersQrcodeWidth;
    @Basic
    @Column(name = "sms_api_key", nullable = true, length = 255)
    private String smsApiKey;
    @Basic
    @Column(name = "sms_content", nullable = true, length = 255)
    private String smsContent;
    @Basic
    @Column(name = "fateqq_codepay_id", nullable = true, length = 255)
    private String fateqqCodepayId;
    @Basic
    @Column(name = "fateqq_key", nullable = true, length = 255)
    private String fateqqKey;
    @Basic
    @Column(name = "fateqq_token", nullable = true, length = 255)
    private String fateqqToken;
    @Basic
    @Column(name = "cz_money_max", nullable = true, precision = 0)
    private Double czMoneyMax;
    @Basic
    @Column(name = "cz_money_min", nullable = true, precision = 0)
    private Double czMoneyMin;
    @Basic
    @Column(name = "game_data_keep_day", nullable = true)
    private Integer gameDataKeepDay;
    @Basic
    @Column(name = "daili_url_registered_to", nullable = true, length = 255)
    private String dailiUrlRegisteredTo;
    @Basic
    @Column(name = "show_game_jie_suan", nullable = true)
    private Integer showGameJieSuan;
    @Basic
    @Column(name = "h5_moban", nullable = true)
    private Integer h5Moban;
    @Basic
    @Column(name = "cs_member_id", nullable = true, length = 255)
    private String csMemberId;
    @Basic
    @Column(name = "notice_str", nullable = true, length = -1)
    private String noticeStr;
    @Basic
    @Column(name = "undead_hide_money_w_s", nullable = true)
    private Integer undeadHideMoneyWS;
    @Basic
    @Column(name = "open_red_money_max_scale", nullable = true, precision = 0)
    private Double openRedMoneyMaxScale;
    @Basic
    @Column(name = "wx_appid", nullable = true, length = 255)
    private String wxAppid;
    @Basic
    @Column(name = "wx_secret", nullable = true, length = 255)
    private String wxSecret;
    @Basic
    @Column(name = "wx_auto_login", nullable = true)
    private Integer wxAutoLogin;
    @Basic
    @Column(name = "add_new_friend", nullable = true)
    private Integer addNewFriend;
    @Basic
    @Column(name = "wx_domain", nullable = true, length = 255)
    private String wxDomain;
    @Basic
    @Column(name = "qq_appid", nullable = true, length = 255)
    private String qqAppid;
    @Basic
    @Column(name = "qq_appkey", nullable = true, length = 255)
    private String qqAppkey;
    @Basic
    @Column(name = "qq_domain", nullable = true, length = 255)
    private String qqDomain;
    @Basic
    @Column(name = "create_room_price_conf", nullable = true, length = -1)
    private String createRoomPriceConf;
    @Basic
    @Column(name = "site1_url", nullable = true, length = 255)
    private String site1Url;
    @Basic
    @Column(name = "tx_fee", nullable = true, precision = 0)
    private Double txFee;
    @Basic
    @Column(name = "chat_msg_undo_sec", nullable = true)
    private Integer chatMsgUndoSec;
    @Basic
    @Column(name = "hongbao_expire_sec", nullable = true)
    private Integer hongbaoExpireSec;
    @Basic
    @Column(name = "transfer_expire_sec", nullable = true)
    private Integer transferExpireSec;
    @Basic
    @Column(name = "register_code", nullable = true, length = 255)
    private String registerCode;
    @Basic
    @Column(name = "use_register_code", nullable = true)
    private Integer useRegisterCode;
    @Basic
    @Column(name = "super_user", nullable = true, length = -1)
    private String superUser;
    @Basic
    @Column(name = "forbid_register4ip", nullable = true, length = -1)
    private String forbidRegister4Ip;
    @Basic
    @Column(name = "add_new_friend_able", nullable = true)
    private Integer addNewFriendAble;
    @Basic
    @Column(name = "add_new_friend_able_others", nullable = true, length = -1)
    private String addNewFriendAbleOthers;
    @Basic
    @Column(name = "new_reg_add_friends", nullable = true, length = -1)
    private String newRegAddFriends;
    @Basic
    @Column(name = "new_reg_add_friends_welcome_word", nullable = true, length = 255)
    private String newRegAddFriendsWelcomeWord;
    @Basic
    @Column(name = "im_footer_hot_item_show", nullable = true)
    private Integer imFooterHotItemShow;
    @Basic
    @Column(name = "im_footer_hot_item_name", nullable = true, length = 255)
    private String imFooterHotItemName;
    @Basic
    @Column(name = "im_footer_hot_item_url", nullable = true, length = 255)
    private String imFooterHotItemUrl;
    @Basic
    @Column(name = "room_members_limit", nullable = true)
    private Integer roomMembersLimit;
    @Basic
    @Column(name = "user_hong_bao_max_price", nullable = true)
    private Integer userHongBaoMaxPrice;
    @Basic
    @Column(name = "look_group_member_detail_for_role", nullable = true)
    private Integer lookGroupMemberDetailForRole;
    @Basic
    @Column(name = "send_red_sm", nullable = true)
    private Integer sendRedSm;
    @Basic
    @Column(name = "shiming", nullable = true)
    private Integer shiming;
    @Basic
    @Column(name = "transfer_sm", nullable = true)
    private Integer transferSm;
    @Basic
    @Column(name = "open_red_sm", nullable = true)
    private Integer openRedSm;
    @Basic
    @Column(name = "receivetransfer_sm", nullable = true)
    private Integer receivetransferSm;
    @Basic
    @Column(name = "new_friend_audit_overdue", nullable = true)
    private Integer newFriendAuditOverdue;
    @Basic
    @Column(name = "send_reder_can_open4_user_chat", nullable = true)
    private Integer sendRederCanOpen4UserChat;
    @Basic
    @Column(name = "reg_sms", nullable = true)
    private Integer regSms;
    @Basic
    @Column(name = "chat_url_txt_can_link", nullable = true)
    private Integer chatUrlTxtCanLink;
    @Basic
    @Column(name = "im_footer_hot_item_logo", nullable = true, length = 255)
    private String imFooterHotItemLogo;
    @Basic
    @Column(name = "chat_background_image", nullable = true, length = 255)
    private String chatBackgroundImage;
    @Basic
    @Column(name = "sms_loktong_pwd", nullable = true, length = 255)
    private String smsLoktongPwd;
    @Basic
    @Column(name = "sms_loktong_templateid", nullable = true, length = 255)
    private String smsLoktongTemplateid;
    @Basic
    @Column(name = "sms_loktong_token", nullable = true, length = 255)
    private String smsLoktongToken;
    @Basic
    @Column(name = "sms_loktong_un", nullable = true, length = 255)
    private String smsLoktongUn;
    @Basic
    @Column(name = "sms_platform", nullable = true)
    private Integer smsPlatform;
    @Basic
    @Column(name = "show_user_msg_read_status", nullable = true)
    private Integer showUserMsgReadStatus;
    @Basic
    @Column(name = "show_user_online", nullable = true)
    private Integer showUserOnline;
    @Basic
    @Column(name = "im_footer_hot_item_show_type", nullable = true)
    private Integer imFooterHotItemShowType;
    @Basic
    @Column(name = "android_upd_details", nullable = true, length = 2000)
    private String androidUpdDetails;
    @Basic
    @Column(name = "android_url", nullable = true, length = 255)
    private String androidUrl;
    @Basic
    @Column(name = "ios_upd_details", nullable = true, length = 2000)
    private String iosUpdDetails;
    @Basic
    @Column(name = "ios_url", nullable = true, length = 255)
    private String iosUrl;
    @Basic
    @Column(name = "pc_upd_details", nullable = true, length = 2000)
    private String pcUpdDetails;
    @Basic
    @Column(name = "pc_url", nullable = true, length = 255)
    private String pcUrl;
    @Basic
    @Column(name = "sys_version_android", nullable = true, length = 255)
    private String sysVersionAndroid;
    @Basic
    @Column(name = "sys_version_ios", nullable = true, length = 255)
    private String sysVersionIos;
    @Basic
    @Column(name = "sys_version_pc", nullable = true, length = 255)
    private String sysVersionPc;
    @Basic
    @Column(name = "use_invite_code", nullable = true)
    private Integer useInviteCode;
    @Basic
    @Column(name = "app_id_uni", nullable = true, length = 255)
    private String appIdUni;
    @Basic
    @Column(name = "app_key_uni", nullable = true, length = 255)
    private String appKeyUni;
    @Basic
    @Column(name = "master_secret_uni", nullable = true, length = 255)
    private String masterSecretUni;
    @Basic
    @Column(name = "my_secretary_name", nullable = true, length = 255)
    private String mySecretaryName;
    @Basic
    @Column(name = "member_id_len", nullable = true)
    private Integer memberIdLen;
    @Basic
    @Column(name = "room_id_len", nullable = true)
    private Integer roomIdLen;
    @Basic
    @Column(name = "sign_in_cnf", nullable = true, length = -1)
    private String signInCnf;
    @Basic
    @Column(name = "sign_in1_day_coin", nullable = true, precision = 0)
    private Double signIn1DayCoin;
    @Basic
    @Column(name = "use_sign_in", nullable = true)
    private Integer useSignIn;
    @Basic
    @Column(name = "sign_in_btn_bg_color_index", nullable = true, length = 255)
    private String signInBtnBgColorIndex;
    @Basic
    @Column(name = "client_chat_data_keep_days", nullable = true)
    private Integer clientChatDataKeepDays;
    @Basic
    @Column(name = "cloud_chat_data_keep_days", nullable = true)
    private Integer cloudChatDataKeepDays;
    @Basic
    @Column(name = "client_group_chat_msg_show_count", nullable = true)
    private Integer clientGroupChatMsgShowCount;
    @Basic
    @Column(name = "client_user_chat_msg_show_count", nullable = true)
    private Integer clientUserChatMsgShowCount;
    @Basic
    @Column(name = "cloud_group_chat_data_keep_days", nullable = true)
    private Integer cloudGroupChatDataKeepDays;
    @Basic
    @Column(name = "cloud_user_chat_data_keep_days", nullable = true)
    private Integer cloudUserChatDataKeepDays;
    @Basic
    @Column(name = "bank_accountrer", nullable = true, length = 255)
    private String bankAccountrer;
    @Basic
    @Column(name = "bank_card_num", nullable = true, length = 255)
    private String bankCardNum;
    @Basic
    @Column(name = "bank_name", nullable = true, length = 255)
    private String bankName;
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

    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeblogo() {
        return weblogo;
    }

    public void setWeblogo(String weblogo) {
        this.weblogo = weblogo;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public Integer getAgentAddFen() {
        return agentAddFen;
    }

    public void setAgentAddFen(Integer agentAddFen) {
        this.agentAddFen = agentAddFen;
    }

    public Integer getAgentBuy() {
        return agentBuy;
    }

    public void setAgentBuy(Integer agentBuy) {
        this.agentBuy = agentBuy;
    }

    public String getAgentRedFanDian() {
        return agentRedFanDian;
    }

    public void setAgentRedFanDian(String agentRedFanDian) {
        this.agentRedFanDian = agentRedFanDian;
    }

    public Integer getAgentSubFen() {
        return agentSubFen;
    }

    public void setAgentSubFen(Integer agentSubFen) {
        this.agentSubFen = agentSubFen;
    }

    public Integer getControlWinLose() {
        return controlWinLose;
    }

    public void setControlWinLose(Integer controlWinLose) {
        this.controlWinLose = controlWinLose;
    }

    public Double getLoseRate() {
        return loseRate;
    }

    public void setLoseRate(Double loseRate) {
        this.loseRate = loseRate;
    }

    public Integer getToSpeak() {
        return toSpeak;
    }

    public void setToSpeak(Integer toSpeak) {
        this.toSpeak = toSpeak;
    }

    public Integer getTransferMoney() {
        return transferMoney;
    }

    public void setTransferMoney(Integer transferMoney) {
        this.transferMoney = transferMoney;
    }

    public Double getUserRegisterGiveGold() {
        return userRegisterGiveGold;
    }

    public void setUserRegisterGiveGold(Double userRegisterGiveGold) {
        this.userRegisterGiveGold = userRegisterGiveGold;
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
    }

    public String getWelcomeStr() {
        return welcomeStr;
    }

    public void setWelcomeStr(String welcomeStr) {
        this.welcomeStr = welcomeStr;
    }

    public String getWanfa() {
        return wanfa;
    }

    public void setWanfa(String wanfa) {
        this.wanfa = wanfa;
    }

    public String getKefuStr() {
        return kefuStr;
    }

    public void setKefuStr(String kefuStr) {
        this.kefuStr = kefuStr;
    }

    public Double getTxMoneyMax() {
        return txMoneyMax;
    }

    public void setTxMoneyMax(Double txMoneyMax) {
        this.txMoneyMax = txMoneyMax;
    }

    public Double getTxMoneyMin() {
        return txMoneyMin;
    }

    public void setTxMoneyMin(Double txMoneyMin) {
        this.txMoneyMin = txMoneyMin;
    }

    public String getDailiRulePic() {
        return dailiRulePic;
    }

    public void setDailiRulePic(String dailiRulePic) {
        this.dailiRulePic = dailiRulePic;
    }

    public String getDailiPosters() {
        return dailiPosters;
    }

    public void setDailiPosters(String dailiPosters) {
        this.dailiPosters = dailiPosters;
    }

    public Integer getDailiPostersQrcodeLeft() {
        return dailiPostersQrcodeLeft;
    }

    public void setDailiPostersQrcodeLeft(Integer dailiPostersQrcodeLeft) {
        this.dailiPostersQrcodeLeft = dailiPostersQrcodeLeft;
    }

    public Integer getDailiPostersQrcodeTop() {
        return dailiPostersQrcodeTop;
    }

    public void setDailiPostersQrcodeTop(Integer dailiPostersQrcodeTop) {
        this.dailiPostersQrcodeTop = dailiPostersQrcodeTop;
    }

    public Double getDailiPostersQrcodeHeight() {
        return dailiPostersQrcodeHeight;
    }

    public void setDailiPostersQrcodeHeight(Double dailiPostersQrcodeHeight) {
        this.dailiPostersQrcodeHeight = dailiPostersQrcodeHeight;
    }

    public Double getDailiPostersQrcodeWidth() {
        return dailiPostersQrcodeWidth;
    }

    public void setDailiPostersQrcodeWidth(Double dailiPostersQrcodeWidth) {
        this.dailiPostersQrcodeWidth = dailiPostersQrcodeWidth;
    }

    public String getSmsApiKey() {
        return smsApiKey;
    }

    public void setSmsApiKey(String smsApiKey) {
        this.smsApiKey = smsApiKey;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public String getFateqqCodepayId() {
        return fateqqCodepayId;
    }

    public void setFateqqCodepayId(String fateqqCodepayId) {
        this.fateqqCodepayId = fateqqCodepayId;
    }

    public String getFateqqKey() {
        return fateqqKey;
    }

    public void setFateqqKey(String fateqqKey) {
        this.fateqqKey = fateqqKey;
    }

    public String getFateqqToken() {
        return fateqqToken;
    }

    public void setFateqqToken(String fateqqToken) {
        this.fateqqToken = fateqqToken;
    }

    public Double getCzMoneyMax() {
        return czMoneyMax;
    }

    public void setCzMoneyMax(Double czMoneyMax) {
        this.czMoneyMax = czMoneyMax;
    }

    public Double getCzMoneyMin() {
        return czMoneyMin;
    }

    public void setCzMoneyMin(Double czMoneyMin) {
        this.czMoneyMin = czMoneyMin;
    }

    public Integer getGameDataKeepDay() {
        return gameDataKeepDay;
    }

    public void setGameDataKeepDay(Integer gameDataKeepDay) {
        this.gameDataKeepDay = gameDataKeepDay;
    }

    public String getDailiUrlRegisteredTo() {
        return dailiUrlRegisteredTo;
    }

    public void setDailiUrlRegisteredTo(String dailiUrlRegisteredTo) {
        this.dailiUrlRegisteredTo = dailiUrlRegisteredTo;
    }

    public Integer getShowGameJieSuan() {
        return showGameJieSuan;
    }

    public void setShowGameJieSuan(Integer showGameJieSuan) {
        this.showGameJieSuan = showGameJieSuan;
    }

    public Integer getH5Moban() {
        return h5Moban;
    }

    public void setH5Moban(Integer h5Moban) {
        this.h5Moban = h5Moban;
    }

    public String getCsMemberId() {
        return csMemberId;
    }

    public void setCsMemberId(String csMemberId) {
        this.csMemberId = csMemberId;
    }

    public String getNoticeStr() {
        return noticeStr;
    }

    public void setNoticeStr(String noticeStr) {
        this.noticeStr = noticeStr;
    }

    public Integer getUndeadHideMoneyWS() {
        return undeadHideMoneyWS;
    }

    public void setUndeadHideMoneyWS(Integer undeadHideMoneyWS) {
        this.undeadHideMoneyWS = undeadHideMoneyWS;
    }

    public Double getOpenRedMoneyMaxScale() {
        return openRedMoneyMaxScale;
    }

    public void setOpenRedMoneyMaxScale(Double openRedMoneyMaxScale) {
        this.openRedMoneyMaxScale = openRedMoneyMaxScale;
    }

    public String getWxAppid() {
        return wxAppid;
    }

    public void setWxAppid(String wxAppid) {
        this.wxAppid = wxAppid;
    }

    public String getWxSecret() {
        return wxSecret;
    }

    public void setWxSecret(String wxSecret) {
        this.wxSecret = wxSecret;
    }

    public Integer getWxAutoLogin() {
        return wxAutoLogin;
    }

    public void setWxAutoLogin(Integer wxAutoLogin) {
        this.wxAutoLogin = wxAutoLogin;
    }

    public Integer getAddNewFriend() {
        return addNewFriend;
    }

    public void setAddNewFriend(Integer addNewFriend) {
        this.addNewFriend = addNewFriend;
    }

    public String getWxDomain() {
        return wxDomain;
    }

    public void setWxDomain(String wxDomain) {
        this.wxDomain = wxDomain;
    }

    public String getQqAppid() {
        return qqAppid;
    }

    public void setQqAppid(String qqAppid) {
        this.qqAppid = qqAppid;
    }

    public String getQqAppkey() {
        return qqAppkey;
    }

    public void setQqAppkey(String qqAppkey) {
        this.qqAppkey = qqAppkey;
    }

    public String getQqDomain() {
        return qqDomain;
    }

    public void setQqDomain(String qqDomain) {
        this.qqDomain = qqDomain;
    }

    public String getCreateRoomPriceConf() {
        return createRoomPriceConf;
    }

    public void setCreateRoomPriceConf(String createRoomPriceConf) {
        this.createRoomPriceConf = createRoomPriceConf;
    }

    public String getSite1Url() {
        return site1Url;
    }

    public void setSite1Url(String site1Url) {
        this.site1Url = site1Url;
    }

    public Double getTxFee() {
        return txFee;
    }

    public void setTxFee(Double txFee) {
        this.txFee = txFee;
    }

    public Integer getChatMsgUndoSec() {
        return chatMsgUndoSec;
    }

    public void setChatMsgUndoSec(Integer chatMsgUndoSec) {
        this.chatMsgUndoSec = chatMsgUndoSec;
    }

    public Integer getHongbaoExpireSec() {
        return hongbaoExpireSec;
    }

    public void setHongbaoExpireSec(Integer hongbaoExpireSec) {
        this.hongbaoExpireSec = hongbaoExpireSec;
    }

    public Integer getTransferExpireSec() {
        return transferExpireSec;
    }

    public void setTransferExpireSec(Integer transferExpireSec) {
        this.transferExpireSec = transferExpireSec;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public Integer getUseRegisterCode() {
        return useRegisterCode;
    }

    public void setUseRegisterCode(Integer useRegisterCode) {
        this.useRegisterCode = useRegisterCode;
    }

    public String getSuperUser() {
        return superUser;
    }

    public void setSuperUser(String superUser) {
        this.superUser = superUser;
    }

    public String getForbidRegister4Ip() {
        return forbidRegister4Ip;
    }

    public void setForbidRegister4Ip(String forbidRegister4Ip) {
        this.forbidRegister4Ip = forbidRegister4Ip;
    }

    public Integer getAddNewFriendAble() {
        return addNewFriendAble;
    }

    public void setAddNewFriendAble(Integer addNewFriendAble) {
        this.addNewFriendAble = addNewFriendAble;
    }

    public String getAddNewFriendAbleOthers() {
        return addNewFriendAbleOthers;
    }

    public void setAddNewFriendAbleOthers(String addNewFriendAbleOthers) {
        this.addNewFriendAbleOthers = addNewFriendAbleOthers;
    }

    public String getNewRegAddFriends() {
        return newRegAddFriends;
    }

    public void setNewRegAddFriends(String newRegAddFriends) {
        this.newRegAddFriends = newRegAddFriends;
    }

    public String getNewRegAddFriendsWelcomeWord() {
        return newRegAddFriendsWelcomeWord;
    }

    public void setNewRegAddFriendsWelcomeWord(String newRegAddFriendsWelcomeWord) {
        this.newRegAddFriendsWelcomeWord = newRegAddFriendsWelcomeWord;
    }

    public Integer getImFooterHotItemShow() {
        return imFooterHotItemShow;
    }

    public void setImFooterHotItemShow(Integer imFooterHotItemShow) {
        this.imFooterHotItemShow = imFooterHotItemShow;
    }

    public String getImFooterHotItemName() {
        return imFooterHotItemName;
    }

    public void setImFooterHotItemName(String imFooterHotItemName) {
        this.imFooterHotItemName = imFooterHotItemName;
    }

    public String getImFooterHotItemUrl() {
        return imFooterHotItemUrl;
    }

    public void setImFooterHotItemUrl(String imFooterHotItemUrl) {
        this.imFooterHotItemUrl = imFooterHotItemUrl;
    }

    public Integer getRoomMembersLimit() {
        return roomMembersLimit;
    }

    public void setRoomMembersLimit(Integer roomMembersLimit) {
        this.roomMembersLimit = roomMembersLimit;
    }

    public Integer getUserHongBaoMaxPrice() {
        return userHongBaoMaxPrice;
    }

    public void setUserHongBaoMaxPrice(Integer userHongBaoMaxPrice) {
        this.userHongBaoMaxPrice = userHongBaoMaxPrice;
    }

    public Integer getLookGroupMemberDetailForRole() {
        return lookGroupMemberDetailForRole;
    }

    public void setLookGroupMemberDetailForRole(Integer lookGroupMemberDetailForRole) {
        this.lookGroupMemberDetailForRole = lookGroupMemberDetailForRole;
    }

    public Integer getSendRedSm() {
        return sendRedSm;
    }

    public void setSendRedSm(Integer sendRedSm) {
        this.sendRedSm = sendRedSm;
    }

    public Integer getShiming() {
        return shiming;
    }

    public void setShiming(Integer shiming) {
        this.shiming = shiming;
    }

    public Integer getTransferSm() {
        return transferSm;
    }

    public void setTransferSm(Integer transferSm) {
        this.transferSm = transferSm;
    }

    public Integer getOpenRedSm() {
        return openRedSm;
    }

    public void setOpenRedSm(Integer openRedSm) {
        this.openRedSm = openRedSm;
    }

    public Integer getReceivetransferSm() {
        return receivetransferSm;
    }

    public void setReceivetransferSm(Integer receivetransferSm) {
        this.receivetransferSm = receivetransferSm;
    }

    public Integer getNewFriendAuditOverdue() {
        return newFriendAuditOverdue;
    }

    public void setNewFriendAuditOverdue(Integer newFriendAuditOverdue) {
        this.newFriendAuditOverdue = newFriendAuditOverdue;
    }

    public Integer getSendRederCanOpen4UserChat() {
        return sendRederCanOpen4UserChat;
    }

    public void setSendRederCanOpen4UserChat(Integer sendRederCanOpen4UserChat) {
        this.sendRederCanOpen4UserChat = sendRederCanOpen4UserChat;
    }

    public Integer getRegSms() {
        return regSms;
    }

    public void setRegSms(Integer regSms) {
        this.regSms = regSms;
    }

    public Integer getChatUrlTxtCanLink() {
        return chatUrlTxtCanLink;
    }

    public void setChatUrlTxtCanLink(Integer chatUrlTxtCanLink) {
        this.chatUrlTxtCanLink = chatUrlTxtCanLink;
    }

    public String getImFooterHotItemLogo() {
        return imFooterHotItemLogo;
    }

    public void setImFooterHotItemLogo(String imFooterHotItemLogo) {
        this.imFooterHotItemLogo = imFooterHotItemLogo;
    }

    public String getChatBackgroundImage() {
        return chatBackgroundImage;
    }

    public void setChatBackgroundImage(String chatBackgroundImage) {
        this.chatBackgroundImage = chatBackgroundImage;
    }

    public String getSmsLoktongPwd() {
        return smsLoktongPwd;
    }

    public void setSmsLoktongPwd(String smsLoktongPwd) {
        this.smsLoktongPwd = smsLoktongPwd;
    }

    public String getSmsLoktongTemplateid() {
        return smsLoktongTemplateid;
    }

    public void setSmsLoktongTemplateid(String smsLoktongTemplateid) {
        this.smsLoktongTemplateid = smsLoktongTemplateid;
    }

    public String getSmsLoktongToken() {
        return smsLoktongToken;
    }

    public void setSmsLoktongToken(String smsLoktongToken) {
        this.smsLoktongToken = smsLoktongToken;
    }

    public String getSmsLoktongUn() {
        return smsLoktongUn;
    }

    public void setSmsLoktongUn(String smsLoktongUn) {
        this.smsLoktongUn = smsLoktongUn;
    }

    public Integer getSmsPlatform() {
        return smsPlatform;
    }

    public void setSmsPlatform(Integer smsPlatform) {
        this.smsPlatform = smsPlatform;
    }

    public Integer getShowUserMsgReadStatus() {
        return showUserMsgReadStatus;
    }

    public void setShowUserMsgReadStatus(Integer showUserMsgReadStatus) {
        this.showUserMsgReadStatus = showUserMsgReadStatus;
    }

    public Integer getShowUserOnline() {
        return showUserOnline;
    }

    public void setShowUserOnline(Integer showUserOnline) {
        this.showUserOnline = showUserOnline;
    }

    public Integer getImFooterHotItemShowType() {
        return imFooterHotItemShowType;
    }

    public void setImFooterHotItemShowType(Integer imFooterHotItemShowType) {
        this.imFooterHotItemShowType = imFooterHotItemShowType;
    }

    public String getAndroidUpdDetails() {
        return androidUpdDetails;
    }

    public void setAndroidUpdDetails(String androidUpdDetails) {
        this.androidUpdDetails = androidUpdDetails;
    }

    public String getAndroidUrl() {
        return androidUrl;
    }

    public void setAndroidUrl(String androidUrl) {
        this.androidUrl = androidUrl;
    }

    public String getIosUpdDetails() {
        return iosUpdDetails;
    }

    public void setIosUpdDetails(String iosUpdDetails) {
        this.iosUpdDetails = iosUpdDetails;
    }

    public String getIosUrl() {
        return iosUrl;
    }

    public void setIosUrl(String iosUrl) {
        this.iosUrl = iosUrl;
    }

    public String getPcUpdDetails() {
        return pcUpdDetails;
    }

    public void setPcUpdDetails(String pcUpdDetails) {
        this.pcUpdDetails = pcUpdDetails;
    }

    public String getPcUrl() {
        return pcUrl;
    }

    public void setPcUrl(String pcUrl) {
        this.pcUrl = pcUrl;
    }

    public String getSysVersionAndroid() {
        return sysVersionAndroid;
    }

    public void setSysVersionAndroid(String sysVersionAndroid) {
        this.sysVersionAndroid = sysVersionAndroid;
    }

    public String getSysVersionIos() {
        return sysVersionIos;
    }

    public void setSysVersionIos(String sysVersionIos) {
        this.sysVersionIos = sysVersionIos;
    }

    public String getSysVersionPc() {
        return sysVersionPc;
    }

    public void setSysVersionPc(String sysVersionPc) {
        this.sysVersionPc = sysVersionPc;
    }

    public Integer getUseInviteCode() {
        return useInviteCode;
    }

    public void setUseInviteCode(Integer useInviteCode) {
        this.useInviteCode = useInviteCode;
    }

    public String getAppIdUni() {
        return appIdUni;
    }

    public void setAppIdUni(String appIdUni) {
        this.appIdUni = appIdUni;
    }

    public String getAppKeyUni() {
        return appKeyUni;
    }

    public void setAppKeyUni(String appKeyUni) {
        this.appKeyUni = appKeyUni;
    }

    public String getMasterSecretUni() {
        return masterSecretUni;
    }

    public void setMasterSecretUni(String masterSecretUni) {
        this.masterSecretUni = masterSecretUni;
    }

    public String getMySecretaryName() {
        return mySecretaryName;
    }

    public void setMySecretaryName(String mySecretaryName) {
        this.mySecretaryName = mySecretaryName;
    }

    public Integer getMemberIdLen() {
        return memberIdLen;
    }

    public void setMemberIdLen(Integer memberIdLen) {
        this.memberIdLen = memberIdLen;
    }

    public Integer getRoomIdLen() {
        return roomIdLen;
    }

    public void setRoomIdLen(Integer roomIdLen) {
        this.roomIdLen = roomIdLen;
    }

    public String getSignInCnf() {
        return signInCnf;
    }

    public void setSignInCnf(String signInCnf) {
        this.signInCnf = signInCnf;
    }

    public Double getSignIn1DayCoin() {
        return signIn1DayCoin;
    }

    public void setSignIn1DayCoin(Double signIn1DayCoin) {
        this.signIn1DayCoin = signIn1DayCoin;
    }

    public Integer getUseSignIn() {
        return useSignIn;
    }

    public void setUseSignIn(Integer useSignIn) {
        this.useSignIn = useSignIn;
    }

    public String getSignInBtnBgColorIndex() {
        return signInBtnBgColorIndex;
    }

    public void setSignInBtnBgColorIndex(String signInBtnBgColorIndex) {
        this.signInBtnBgColorIndex = signInBtnBgColorIndex;
    }

    public Integer getClientChatDataKeepDays() {
        return clientChatDataKeepDays;
    }

    public void setClientChatDataKeepDays(Integer clientChatDataKeepDays) {
        this.clientChatDataKeepDays = clientChatDataKeepDays;
    }

    public Integer getCloudChatDataKeepDays() {
        return cloudChatDataKeepDays;
    }

    public void setCloudChatDataKeepDays(Integer cloudChatDataKeepDays) {
        this.cloudChatDataKeepDays = cloudChatDataKeepDays;
    }

    public Integer getClientGroupChatMsgShowCount() {
        return clientGroupChatMsgShowCount;
    }

    public void setClientGroupChatMsgShowCount(Integer clientGroupChatMsgShowCount) {
        this.clientGroupChatMsgShowCount = clientGroupChatMsgShowCount;
    }

    public Integer getClientUserChatMsgShowCount() {
        return clientUserChatMsgShowCount;
    }

    public void setClientUserChatMsgShowCount(Integer clientUserChatMsgShowCount) {
        this.clientUserChatMsgShowCount = clientUserChatMsgShowCount;
    }

    public Integer getCloudGroupChatDataKeepDays() {
        return cloudGroupChatDataKeepDays;
    }

    public void setCloudGroupChatDataKeepDays(Integer cloudGroupChatDataKeepDays) {
        this.cloudGroupChatDataKeepDays = cloudGroupChatDataKeepDays;
    }

    public Integer getCloudUserChatDataKeepDays() {
        return cloudUserChatDataKeepDays;
    }

    public void setCloudUserChatDataKeepDays(Integer cloudUserChatDataKeepDays) {
        this.cloudUserChatDataKeepDays = cloudUserChatDataKeepDays;
    }

    public String getBankAccountrer() {
        return bankAccountrer;
    }

    public void setBankAccountrer(String bankAccountrer) {
        this.bankAccountrer = bankAccountrer;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
        WebConfig webConfig = (WebConfig) o;
        return Objects.equals(id, webConfig.id) && Objects.equals(createDate, webConfig.createDate) && Objects.equals(modifyDate, webConfig.modifyDate) && Objects.equals(email, webConfig.email) && Objects.equals(phone, webConfig.phone) && Objects.equals(qq, webConfig.qq) && Objects.equals(weblogo, webConfig.weblogo) && Objects.equals(websiteName, webConfig.websiteName) && Objects.equals(websiteUrl, webConfig.websiteUrl) && Objects.equals(wx, webConfig.wx) && Objects.equals(agentAddFen, webConfig.agentAddFen) && Objects.equals(agentBuy, webConfig.agentBuy) && Objects.equals(agentRedFanDian, webConfig.agentRedFanDian) && Objects.equals(agentSubFen, webConfig.agentSubFen) && Objects.equals(controlWinLose, webConfig.controlWinLose) && Objects.equals(loseRate, webConfig.loseRate) && Objects.equals(toSpeak, webConfig.toSpeak) && Objects.equals(transferMoney, webConfig.transferMoney) && Objects.equals(userRegisterGiveGold, webConfig.userRegisterGiveGold) && Objects.equals(winRate, webConfig.winRate) && Objects.equals(welcomeStr, webConfig.welcomeStr) && Objects.equals(wanfa, webConfig.wanfa) && Objects.equals(kefuStr, webConfig.kefuStr) && Objects.equals(txMoneyMax, webConfig.txMoneyMax) && Objects.equals(txMoneyMin, webConfig.txMoneyMin) && Objects.equals(dailiRulePic, webConfig.dailiRulePic) && Objects.equals(dailiPosters, webConfig.dailiPosters) && Objects.equals(dailiPostersQrcodeLeft, webConfig.dailiPostersQrcodeLeft) && Objects.equals(dailiPostersQrcodeTop, webConfig.dailiPostersQrcodeTop) && Objects.equals(dailiPostersQrcodeHeight, webConfig.dailiPostersQrcodeHeight) && Objects.equals(dailiPostersQrcodeWidth, webConfig.dailiPostersQrcodeWidth) && Objects.equals(smsApiKey, webConfig.smsApiKey) && Objects.equals(smsContent, webConfig.smsContent) && Objects.equals(fateqqCodepayId, webConfig.fateqqCodepayId) && Objects.equals(fateqqKey, webConfig.fateqqKey) && Objects.equals(fateqqToken, webConfig.fateqqToken) && Objects.equals(czMoneyMax, webConfig.czMoneyMax) && Objects.equals(czMoneyMin, webConfig.czMoneyMin) && Objects.equals(gameDataKeepDay, webConfig.gameDataKeepDay) && Objects.equals(dailiUrlRegisteredTo, webConfig.dailiUrlRegisteredTo) && Objects.equals(showGameJieSuan, webConfig.showGameJieSuan) && Objects.equals(h5Moban, webConfig.h5Moban) && Objects.equals(csMemberId, webConfig.csMemberId) && Objects.equals(noticeStr, webConfig.noticeStr) && Objects.equals(undeadHideMoneyWS, webConfig.undeadHideMoneyWS) && Objects.equals(openRedMoneyMaxScale, webConfig.openRedMoneyMaxScale) && Objects.equals(wxAppid, webConfig.wxAppid) && Objects.equals(wxSecret, webConfig.wxSecret) && Objects.equals(wxAutoLogin, webConfig.wxAutoLogin) && Objects.equals(addNewFriend, webConfig.addNewFriend) && Objects.equals(wxDomain, webConfig.wxDomain) && Objects.equals(qqAppid, webConfig.qqAppid) && Objects.equals(qqAppkey, webConfig.qqAppkey) && Objects.equals(qqDomain, webConfig.qqDomain) && Objects.equals(createRoomPriceConf, webConfig.createRoomPriceConf) && Objects.equals(site1Url, webConfig.site1Url) && Objects.equals(txFee, webConfig.txFee) && Objects.equals(chatMsgUndoSec, webConfig.chatMsgUndoSec) && Objects.equals(hongbaoExpireSec, webConfig.hongbaoExpireSec) && Objects.equals(transferExpireSec, webConfig.transferExpireSec) && Objects.equals(registerCode, webConfig.registerCode) && Objects.equals(useRegisterCode, webConfig.useRegisterCode) && Objects.equals(superUser, webConfig.superUser) && Objects.equals(forbidRegister4Ip, webConfig.forbidRegister4Ip) && Objects.equals(addNewFriendAble, webConfig.addNewFriendAble) && Objects.equals(addNewFriendAbleOthers, webConfig.addNewFriendAbleOthers) && Objects.equals(newRegAddFriends, webConfig.newRegAddFriends) && Objects.equals(newRegAddFriendsWelcomeWord, webConfig.newRegAddFriendsWelcomeWord) && Objects.equals(imFooterHotItemShow, webConfig.imFooterHotItemShow) && Objects.equals(imFooterHotItemName, webConfig.imFooterHotItemName) && Objects.equals(imFooterHotItemUrl, webConfig.imFooterHotItemUrl) && Objects.equals(roomMembersLimit, webConfig.roomMembersLimit) && Objects.equals(userHongBaoMaxPrice, webConfig.userHongBaoMaxPrice) && Objects.equals(lookGroupMemberDetailForRole, webConfig.lookGroupMemberDetailForRole) && Objects.equals(sendRedSm, webConfig.sendRedSm) && Objects.equals(shiming, webConfig.shiming) && Objects.equals(transferSm, webConfig.transferSm) && Objects.equals(openRedSm, webConfig.openRedSm) && Objects.equals(receivetransferSm, webConfig.receivetransferSm) && Objects.equals(newFriendAuditOverdue, webConfig.newFriendAuditOverdue) && Objects.equals(sendRederCanOpen4UserChat, webConfig.sendRederCanOpen4UserChat) && Objects.equals(regSms, webConfig.regSms) && Objects.equals(chatUrlTxtCanLink, webConfig.chatUrlTxtCanLink) && Objects.equals(imFooterHotItemLogo, webConfig.imFooterHotItemLogo) && Objects.equals(chatBackgroundImage, webConfig.chatBackgroundImage) && Objects.equals(smsLoktongPwd, webConfig.smsLoktongPwd) && Objects.equals(smsLoktongTemplateid, webConfig.smsLoktongTemplateid) && Objects.equals(smsLoktongToken, webConfig.smsLoktongToken) && Objects.equals(smsLoktongUn, webConfig.smsLoktongUn) && Objects.equals(smsPlatform, webConfig.smsPlatform) && Objects.equals(showUserMsgReadStatus, webConfig.showUserMsgReadStatus) && Objects.equals(showUserOnline, webConfig.showUserOnline) && Objects.equals(imFooterHotItemShowType, webConfig.imFooterHotItemShowType) && Objects.equals(androidUpdDetails, webConfig.androidUpdDetails) && Objects.equals(androidUrl, webConfig.androidUrl) && Objects.equals(iosUpdDetails, webConfig.iosUpdDetails) && Objects.equals(iosUrl, webConfig.iosUrl) && Objects.equals(pcUpdDetails, webConfig.pcUpdDetails) && Objects.equals(pcUrl, webConfig.pcUrl) && Objects.equals(sysVersionAndroid, webConfig.sysVersionAndroid) && Objects.equals(sysVersionIos, webConfig.sysVersionIos) && Objects.equals(sysVersionPc, webConfig.sysVersionPc) && Objects.equals(useInviteCode, webConfig.useInviteCode) && Objects.equals(appIdUni, webConfig.appIdUni) && Objects.equals(appKeyUni, webConfig.appKeyUni) && Objects.equals(masterSecretUni, webConfig.masterSecretUni) && Objects.equals(mySecretaryName, webConfig.mySecretaryName) && Objects.equals(memberIdLen, webConfig.memberIdLen) && Objects.equals(roomIdLen, webConfig.roomIdLen) && Objects.equals(signInCnf, webConfig.signInCnf) && Objects.equals(signIn1DayCoin, webConfig.signIn1DayCoin) && Objects.equals(useSignIn, webConfig.useSignIn) && Objects.equals(signInBtnBgColorIndex, webConfig.signInBtnBgColorIndex) && Objects.equals(clientChatDataKeepDays, webConfig.clientChatDataKeepDays) && Objects.equals(cloudChatDataKeepDays, webConfig.cloudChatDataKeepDays) && Objects.equals(clientGroupChatMsgShowCount, webConfig.clientGroupChatMsgShowCount) && Objects.equals(clientUserChatMsgShowCount, webConfig.clientUserChatMsgShowCount) && Objects.equals(cloudGroupChatDataKeepDays, webConfig.cloudGroupChatDataKeepDays) && Objects.equals(cloudUserChatDataKeepDays, webConfig.cloudUserChatDataKeepDays) && Objects.equals(bankAccountrer, webConfig.bankAccountrer) && Objects.equals(bankCardNum, webConfig.bankCardNum) && Objects.equals(bankName, webConfig.bankName) && Objects.equals(orgId, webConfig.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDate, modifyDate, email, phone, qq, weblogo, websiteName, websiteUrl, wx, agentAddFen, agentBuy, agentRedFanDian, agentSubFen, controlWinLose, loseRate, toSpeak, transferMoney, userRegisterGiveGold, winRate, welcomeStr, wanfa, kefuStr, txMoneyMax, txMoneyMin, dailiRulePic, dailiPosters, dailiPostersQrcodeLeft, dailiPostersQrcodeTop, dailiPostersQrcodeHeight, dailiPostersQrcodeWidth, smsApiKey, smsContent, fateqqCodepayId, fateqqKey, fateqqToken, czMoneyMax, czMoneyMin, gameDataKeepDay, dailiUrlRegisteredTo, showGameJieSuan, h5Moban, csMemberId, noticeStr, undeadHideMoneyWS, openRedMoneyMaxScale, wxAppid, wxSecret, wxAutoLogin, addNewFriend, wxDomain, qqAppid, qqAppkey, qqDomain, createRoomPriceConf, site1Url, txFee, chatMsgUndoSec, hongbaoExpireSec, transferExpireSec, registerCode, useRegisterCode, superUser, forbidRegister4Ip, addNewFriendAble, addNewFriendAbleOthers, newRegAddFriends, newRegAddFriendsWelcomeWord, imFooterHotItemShow, imFooterHotItemName, imFooterHotItemUrl, roomMembersLimit, userHongBaoMaxPrice, lookGroupMemberDetailForRole, sendRedSm, shiming, transferSm, openRedSm, receivetransferSm, newFriendAuditOverdue, sendRederCanOpen4UserChat, regSms, chatUrlTxtCanLink, imFooterHotItemLogo, chatBackgroundImage, smsLoktongPwd, smsLoktongTemplateid, smsLoktongToken, smsLoktongUn, smsPlatform, showUserMsgReadStatus, showUserOnline, imFooterHotItemShowType, androidUpdDetails, androidUrl, iosUpdDetails, iosUrl, pcUpdDetails, pcUrl, sysVersionAndroid, sysVersionIos, sysVersionPc, useInviteCode, appIdUni, appKeyUni, masterSecretUni, mySecretaryName, memberIdLen, roomIdLen, signInCnf, signIn1DayCoin, useSignIn, signInBtnBgColorIndex, clientChatDataKeepDays, cloudChatDataKeepDays, clientGroupChatMsgShowCount, clientUserChatMsgShowCount, cloudGroupChatDataKeepDays, cloudUserChatDataKeepDays, bankAccountrer, bankCardNum, bankName, orgId);
    }
}
