package com.im.service;

import com.im.bean.MemberBean;
import com.im.bean.Pager;
import com.im.entity.Trajectory;

import java.util.List;

public interface TrajectoryService {  

	public abstract Pager findByPager(String[] properties, Object[] vals, Pager Pager ) throws Exception;
	public abstract void generate(MemberBean mb,String descri) throws Exception;
	public abstract List<Trajectory> getList(String[] ps, Object[] vs) throws Exception;
}
