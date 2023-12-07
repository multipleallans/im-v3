package com.im.service;

import com.im.bean.Pager;
import com.im.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Pager findByPager(String[] properties, Object[] vals, Pager Pager) throws Exception;

    void delete(Employee o) throws Exception;

    void update(Employee o) throws Exception;


    void save(Employee o) throws Exception;

    Employee get(String id) throws Exception;

    void delete(String[] ids) throws Exception;

    List<Employee> getList(String[] ps, Object[] vs) throws Exception;

    Object sum(String hql) throws Exception;

    void delete(String id) throws Exception;

    Long count(String[] ps, Object[] vs) throws Exception;

    Employee get(String p, String v) throws Exception;

    Employee getByMemberId(String memberId) throws Exception;
}
