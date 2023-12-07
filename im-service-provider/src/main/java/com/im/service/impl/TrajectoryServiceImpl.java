package com.im.service.impl;

import com.im.bean.MemberBean;
import com.im.bean.Pager;
import com.im.bean.Pager.OrderType;
import com.im.entity.Member.MEMBER_TYPE;
import com.im.entity.Trajectory;
import com.im.service.BaseService;
import com.im.service.TrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
@SuppressWarnings("all")
public class TrajectoryServiceImpl implements TrajectoryService {

	@Autowired
	private BaseService baseService;
	
	@Override
	@Transactional(readOnly = true)
	public Pager findByPager(String[] properties, Object[] vals, Pager Pager)
			throws Exception {
		return baseService.findByPager(Trajectory.class, properties, vals, Pager);
	}
   
	@Override
	@Transactional
	public void generate(MemberBean mb, String descri) throws Exception {
		if(mb.getMember_type()==MEMBER_TYPE.ROBOT||mb.getId().equals("0")) return;//机器人不   
		Long l = baseService.getTotalCount(Trajectory.class, new String[]{"member_uuid"}, new Object[]{mb.getId()});
		if(null!=l&&l>=200) {
			try {
				baseService.delete( 
							findByPager(new String[]{"member_uuid"}, new Object[]{mb.getId()},new Pager(1, 1, "createDate", OrderType.asc)).getList().get(0));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Trajectory obj = new Trajectory();
		obj.setCreateDate(now); 
		obj.setDateStr(sdf.format(now));
		obj.setDescri(descri);
		obj.setMember_id(mb.getMemberId());
		obj.setMember_uuid(mb.getId());
		baseService.save(obj);
	}   

	@Override
	@Transactional(readOnly = true)
	public List<Trajectory> getList(String[] ps, Object[] vs) throws Exception {
		return baseService.getList(Trajectory.class, ps, vs);
	}

}
