package com.im.dao.impl;

import com.im.dao.BaseDAO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
@SuppressWarnings("all")
@Transactional
@Slf4j
public class BaseDAOImpl implements BaseDAO {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public BaseDAOImpl() {
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    public Object get(Class entityClass, String propertyName, Object value) {
        Assert.hasText(propertyName, "propertyName must not be empty");
        Assert.notNull(value, "value is required");
        String hql = (new StringBuilder("from ")).append(entityClass.getName())
                .append(" as model where model.").append(propertyName)
                .append(" = '"+value+"'").toString();
        return getSession().createQuery(hql)
                .uniqueResult();
//        return getSession().createQuery(hql).setParameter(0, value)
//                .uniqueResult();
    }
}
