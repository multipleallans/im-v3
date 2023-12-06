package com.im.dao;


import com.im.utils.Pager;

import java.io.Serializable;
import java.util.List;

/**
 * DAO接口规范
 * @author 开云团队
 *
 * @param <T>
 * @param <PK>
 */
@SuppressWarnings("all")
public abstract interface BaseDAO<T, PK extends Serializable> {
	public abstract T get(Class entityClass, String propertyName,Object value)  throws Exception;

}