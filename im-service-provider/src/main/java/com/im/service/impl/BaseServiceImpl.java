package com.im.service.impl;

import com.im.dao.BaseDAO;
import com.im.service.BaseService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Service
@SuppressWarnings("all")
@Transactional
@Lazy
public class BaseServiceImpl<T, PK extends Serializable> implements
		BaseService<T, PK> {

	@Resource
	public BaseDAO<T, PK> baseDao;

	public T get(Class entityClass, String propertyName, Object value)
			throws Exception {
		Object t = this.baseDao.get(entityClass, propertyName, value);
		return (T) t;
	}
}