package com.im.util;

import com.im.business.bean.AccessRecordBean;
import com.im.business.bean.MemberBean;
import com.im.business.bean.RoomBean;
import com.im.domain.entity.AccessRecord;
import com.im.domain.entity.Member;
import com.im.domain.entity.Room;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class BeanUtils {

	public static AccessRecordBean accessRecordToBean(AccessRecord e) {
		if(null==e) return null;
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM月dd日");
		Date now = new Date();
		Date yestoday = new Date();
		yestoday.setDate(yestoday.getDate()-1);
		
		AccessRecordBean o = new AccessRecordBean();
		o.setArid(e.getId());
		o.setContent("");
		o.setId(e.getEntityId());
		o.setTypeid(e.getTypeId());
		o.setImg(e.getImg());
		o.setTitle(e.getTitle());
		Date d = e.getCreateDate();
		if (null != d) {
			if (d.getYear() == now.getYear() && d.getMonth() == now.getMonth() && d.getDate() == now.getDate()) {
				o.setCreateDate(sdf1.format(d));
			} else if (d.getDate() == yestoday.getDate()) {
				o.setCreateDate("昨天");
			} else {
				o.setCreateDate(sdf2.format(d));
			}
			o.setCreateDateTime(d.getTime());
		}
		o.setContent("");
		o.setSubname(e.getSubName());
		
//		if(SessionStore.isMemberOnline(e.getEntityid())) {
//			o.setOnline(1);
//		}
		
		
		return o;
	}
	
	 
	public static MemberBean memberToBeanSimple(Member e) {
		if(null==e) return null;
		MemberBean mb = new MemberBean();
		mb.setMemberType(e.getMemberType());
		mb.setId(e.getId());
		if(StringUtils.isEmpty(e.getHeadpic())) {
			mb.setHeadpic("/img_sys/defaultHeadPic.jpg");
		} else {
			mb.setHeadpic(e.getHeadpic());
		}
		mb.setMemberId(e.getMemberId());
		mb.setUsername(e.getUsername());
		mb.setNickName(e.getNickName());
		mb.setStatus(e.getStatus());
		mb.setSex(e.getSex());
		mb.setTelphone(e.getTelphone());
		mb.setMoney(e.getMoney()); 
		mb.setParent_uuid(e.getParent());
		mb.setOne_level_count(e.getOneLevelCount());
		mb.setLastLoginDate(e.getLastLoginDate());
		mb.setShimingStatus(e.getShimingStatus());
		return mb;
	}
	
	
	public static RoomBean roomToBeanSimple(Room room) {
		if(null==room) return null;
		
		
		
		RoomBean b = new RoomBean();
		if(StringUtils.isEmpty(room.getHeadImg())) {
			b.setImg("/img_sys/group.png");
		} else {
			b.setImg(room.getHeadImg());
		}
		
		if(!StringUtils.isEmpty(room.getProps())) {
			  
			Map prosMap = JsonUtil.getMapFromJson(room.getProps());
			if(prosMap.containsKey("STOPSPEAK")) {
				b.setStopSpeak(Integer.valueOf(prosMap.get("STOPSPEAK").toString()));
			} else {
				b.setStopSpeak(0);
			}
			
		} else {
			b.setStopSpeak(0);
		}
		b.setUseCustomHeadpic(room.getUseCustomHeadpic());
		b.setMemberMgr_ids(room.getMemberMgrIds());
		b.setYaoqingAble(room.getYaoqingAble());
		b.setYaoqingAuditAble(room.getYaoqingAuditAble());
		b.setMember_ids(room.getMemberIds());
		b.setStopspeak_member_ids(room.getStopspeakMemberIds());
		b.setId(room.getId());
		b.setRobotRule(room.getRobotRule());
		b.setGameStatus(room.getGameStatus());
		b.setRulePic(room.getRulePic()); 
		b.setName(room.getName());
		b.setRoomid(room.getRoomId());
		b.setRoomUUID(room.getId());
		b.setSubname(room.getSubname());
		b.setDescri(room.getDescri());
		b.setProperties(room.getProps());
//		b.setOpenFeeAdd(room.getOpenFeeAdd());
//		b.setSendFeeAdd(room.getSendFeeAdd());
//		b.setWinFeeAdd(room.getWinFeeAdd()); 
//		b.setUnDead(room.getUnDead()); 
//		b.setGameType(room.getGameType().name());
		b.setStatus(room.getStatus());
		b.setPsw(room.getPsw());
		b.setControlGame(room.getControlGame());
		b.setControlModel(room.getControlModel());
		b.setPlayerSendWinRate_s1(room.getPlayerSendWinRateS1());
		b.setPlayerOpenWinRate_s1(room.getPlayerOpenWinRateS1());
		b.setOwner(room.getOwner());
		b.setOwner_UUID(room.getOwnerUUID());
		b.setLimitNum(room.getLimitNum());
		b.setFixedRobotIds(room.getFixedRobotIds());
		b.setEndDate(room.getEndDate()); 
		b.setIndependence(room.getIndependence());
		b.setMaxRobotCount(room.getMaxRobotCount());
		b.setOpenRedDelayStart(room.getOpenRedDelayStart());
		b.setOpenRedDelayEnd(room.getOpenRedDelayEnd());
		b.setAgentRedFanDian(room.getAgentRedFanDian());
		return b;
	}
 

	
	public static Room roomBeanTransferToRoomSimple(RoomBean rb) {
		Room room = new Room();
		room.setHeadImg(rb.getImg());
		room.setRoomId(rb.getRoomUUID());
		room.setId(rb.getId());
		room.setDescri(rb.getDescri());
		room.setControlGame(rb.getControlGame());
		room.setControlModel(rb.getControlModel());
		room.setAgentRedFanDian(rb.getAgentRedFanDian());
		room.setDomain(rb.getDomain());
		room.setEndDate(rb.getEndDate());
		room.setMemberIds(rb.getMember_ids());
		room.setMemberMgrIds(rb.getMemberMgr_ids());
		room.setLimitNum(rb.getLimitNum());
		room.setName(rb.getName());
		room.setOwner(rb.getOwner());
		room.setOwnerUUID(rb.getOwner_UUID());
		room.setLimitNum(rb.getLimitNum());
		room.setStatus(rb.getStatus());
		room.setYaoqingAble(rb.getYaoqingAble());
		room.setYaoqingAuditAble(rb.getYaoqingAuditAble());
		room.setUseCustomHeadpic(rb.getUseCustomHeadpic());
		room.setStopspeakMemberIds(rb.getStopspeak_member_ids());
		room.setSubname(rb.getSubname());
		room.setUnDead(rb.getUnDead());
		room.setPsw(rb.getPsw());
		return room;
	}

}
