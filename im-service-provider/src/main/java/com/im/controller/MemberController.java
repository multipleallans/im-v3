package com.im.controller;


import com.alibaba.fastjson2.JSONObject;
import com.im.bean.MemberBean;
import com.im.bean.RoomBean;
import com.im.bean.store.ChatStoreComponent;
import com.im.constant.MemberConstant;
import com.im.entity.*;
import com.im.entity.Member.MEMBER_TYPE;
import com.im.mq.RabbitmqConfig;
import com.im.service.*;
import com.im.utils.*;

import com.im.utils.redis.RedisService;
import com.im.utils.web.BeanUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpStatus;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller("MemberJsonController")
@RequestMapping(value = {"/user/json", "visit"})
@AllArgsConstructor
@CrossOrigin
@Slf4j
public class MemberController {

    public static final String REDIS_WSS_KEY="websocket:userid:address";

    private Environment environment;

    private MemberService memberService;

    private IpListService ipListService;

    private RoomService roomService;

    private WebConfigService configService;

    private ChatStoreComponent chatStoreComponent;

    private RedisService redisService;

    private TrajectoryService trajectoryService;
    @RequestMapping(value = "/loginV2", method = {RequestMethod.POST, RequestMethod.OPTIONS})
    public void loginV2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        String addressIp = RabbitmqConfig.getLocalIP();
        String port = environment.getProperty("server.port");
        log.info("account:" + account + ";password:" + password);
        if (StringUtils.isEmpty(account) || StringUtils.isEmpty(password)) {
            ResponseUtils.json(response, 500, "账号或密码错误", null);
            return;
        }
        List<Member> list = memberService.getList(new String[]{"nickName", "password"}, new Object[]{account, MD5.MD5Encode(password)});

        if (null == list || list.isEmpty()) {
            list = memberService.getList(new String[]{"username", "password"}, new Object[]{account, MD5.MD5Encode(password)});
        }
//
//        if (null == list || list.isEmpty()) {
//            list = memberService.getList(new String[]{"telphone", "password"}, new Object[]{account, MD5.MD5Encode(password)});
//        }

        if (null == list || list.isEmpty()) {
            log.error("用户登陆失败,account:{};password:{}", account, password);
            ResponseUtils.json(response, 500, "手机/帐号或密码错误", null);
        } else {
            Member member = list.get(0);
            if (null != member.getStatus() && member.getStatus() == 1) {
                ResponseUtils.json(response, 500, "帐号禁用", null);
                return;
            }

            if (member.getMemberType() == MEMBER_TYPE.ROBOT) {
                ResponseUtils.json(response, 500, "该账号类型禁止登录", null);
                return;
            }


            boolean isEnabledRequest = ipListService.enableRequest(member, request);

            if (!isEnabledRequest) {
                log.error("拉黑用户禁止访问,member:{}; ip:{}", JSONObject.toJSONString(member), WebUtilsWeb.getIpAddrErrorLog(request));
                response.setStatus(HttpStatus.SC_BAD_GATEWAY);
                ResponseUtils.json(response, 502, "网络异常,请联系管理员", null);
                return;
            }

            request.getSession().setAttribute(MemberConstant.MEMBERIDSESSION, member.getId());
            String userIp = WebUtilsWeb.getIpAddr(request);
            MemberBean mb = new MemberBean();
            mb.setParent_uuid(member.getParent());
            mb.setMember_type(member.getMemberType());
            mb.setId(member.getId());
            mb.setUrl("http://" + configService.get().getWebsiteUrl() + "/user/json/i?u=" + member.getMemberId());
            if (StringUtils.isEmpty(member.getHeadpic())) {
                mb.setHeadpic("/img_sys/defaultHeadPic.jpg");
            } else {
                mb.setHeadpic(member.getHeadpic());
            }
            mb.setPreTxImg(member.getPreTxImg());
            mb.setSex(member.getSex());
            mb.setPreTxPay(member.getPreTxPay());
            mb.setLastLoginDate(member.getLastLoginDate());
            mb.setLastLoginIp(userIp);
            mb.setLosePriceSum(member.getLosePriceSum());
            mb.setMemberId(member.getMemberId());
            mb.setMoney(member.getMoney());
            mb.setUsername(member.getUsername());
            mb.setNickName(member.getNickName());
            mb.setOpenRedCount(member.getOpenRedCount());
            mb.setOpenRedPriceSum(member.getOpenRedPriceSum());
            mb.setParent(member.getParent());
            mb.setRechargePriceSum(member.getRechargePriceSum());
            mb.setRegistIp(member.getRegistIp());
            mb.setSendRedCount(member.getSendRedCount());
            mb.setSendRedPriceSum(member.getSendRedPriceSum());
            mb.setStatus(member.getStatus());
            mb.setTelphone(member.getTelphone());
            mb.setPreBank_addr(member.getPreBank_addr());
            mb.setPreBank_belonger(member.getPreBank_belonger());
            mb.setPreBank_code(member.getPreBank_code());
            mb.setPreBank_name(member.getPreBank_name());
            mb.setTxPriceSum(member.getTxPriceSum());
            mb.setTxMoneyIng(member.getTxMoneyIng());
            mb.setWinPriceSum(member.getWinPriceSum());
            mb.setTichenPriceSum(member.getTichenPriceSum());

            member.setLastLoginIp(userIp);
            member.setLastLoginDate(new Date());
            memberService.update(member);

            mb.setQrCodeImg(member.getQrCodeImg());


            String[] ps = new String[]{"friendid", "status"};
            Object[] vs = new Object[]{member.getId(), FriendsAdd.Status.wait};
            Long l = memberService.friendsAddCount(ps, vs);
            mb.setUnDoFriendAddCount(l);


            ps = new String[]{"room_owner_id", "status"};
            vs = new Object[]{member.getId(), RoomAdd.Status.wait};
            l = roomService.roomAddCount(ps, vs);
            mb.setUnDoRoomAddCount(l);


            MemberLoginLog loginLog = new MemberLoginLog();
            loginLog.setCreateDate(new Date());
            loginLog.setIp(userIp);
            loginLog.setIpAddr(WebUtilsWeb.getIpAddress(userIp));
            loginLog.setMid(member.getMemberId());
            loginLog.setMnickName(member.getNickName());
            loginLog.setMtel(member.getTelphone());
            memberService.saveLoginLog(loginLog);


            chatStoreComponent.putMemberBean(member.getId(), BeanUtils.memberToBeanSimple(member));

            trajectoryService.generate(mb, "登陆了游戏(H5)");
            /**写入redis*/
            redisService.hPut(REDIS_WSS_KEY, member.getId(), addressIp + port);
            log.info("------登录结束");
            Object independenceRoomUUID = request.getSession().getAttribute("IndependenceRoomUUID");
            if (null == independenceRoomUUID || StringUtils.isEmpty(independenceRoomUUID.toString())) {
                ResponseUtils.json(response, 200, mb, null);
            } else {
//                RoomBean rb = ChatStore.ROOMB_BEAN_MAP.get(independenceRoomUUID.toString());
                RoomBean rb = chatStoreComponent.getRoomBeanMap(independenceRoomUUID.toString());
                if (rb.getIndependence() == 1) {
                    ResponseUtils.json(response, 200, mb, "/#/group/chat/" + independenceRoomUUID);
                } else {
                    ResponseUtils.json(response, 200, mb, null);
                }
            }
        }

    }
}
