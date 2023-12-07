package com.im.service;

import com.im.entity.TempEt;

public interface TempEtService {  

	public abstract void save(TempEt o) throws Exception;
	public abstract void delete(TempEt o) throws Exception;
	public abstract void update(TempEt o) throws Exception;
	public abstract void delete(String hql) throws Exception;
	public abstract TempEt get(String id) throws Exception;
    
}
