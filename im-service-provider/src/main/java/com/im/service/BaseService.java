package com.im.service;


import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("all")
public abstract interface BaseService<T, PK extends Serializable> {
  public abstract T get(Class entityClass, String propertyName, Object value) throws Exception;

}