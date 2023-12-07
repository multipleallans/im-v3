package com.im.service;

import com.im.bean.Pager;
import com.im.entity.Bank;

import java.util.List;

public interface BankService {  

	public abstract Pager findByPager(String[] properties, Object[] vals, Pager Pager ) throws Exception;
	public abstract void delete(Bank o) throws Exception;
	public abstract void update(Bank o) throws Exception;
	public abstract void save(Bank o) throws Exception;
	public abstract Bank get(String id) throws Exception;
	public abstract void delete(String[] ids) throws Exception;
	public abstract List<Bank> getList(String[] ps, Object[] vs) throws Exception;
	public abstract Object sum(String hql) throws Exception;
	public abstract void delete(String id) throws Exception;
    
}
