package com.im.service;

import com.im.bean.Pager;
import com.im.entity.FaxianSite;

import java.util.List;

public interface FaxianSiteService {  

	public abstract Pager findByPager(String[] properties, Object[] vals, Pager Pager ) throws Exception;
	public abstract void delete(FaxianSite o) throws Exception;
	public abstract void update(FaxianSite o) throws Exception;
	public abstract void save(FaxianSite o) throws Exception;
	public abstract FaxianSite get(String id) throws Exception;
	public abstract void delete(String[] ids) throws Exception;
	public abstract List<FaxianSite> getList(String[] ps, Object[] vs) throws Exception;
	public abstract void delete(String id) throws Exception;
    
}
