package com.im.service;

import com.im.bean.Pager;
import com.im.entity.Kefu;

import java.util.List;

public interface KefuService {  

	public abstract Pager findByPager(String[] properties, Object[] vals, Pager Pager ) throws Exception;
	public abstract void delete(Kefu o) throws Exception;
	public abstract void update(Kefu o) throws Exception;
	public abstract void save(Kefu o) throws Exception;
	public abstract Kefu get(String id) throws Exception;
	public abstract void delete(String[] ids) throws Exception;
	public abstract List<Kefu> getList(String[] ps, Object[] vs) throws Exception;
	public abstract void delete(String id) throws Exception;
    
}
