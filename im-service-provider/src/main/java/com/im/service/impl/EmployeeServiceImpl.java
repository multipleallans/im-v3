package com.im.service.impl;

import com.im.bean.Pager;
import com.im.entity.Employee;
import com.im.service.BaseService;
import com.im.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@SuppressWarnings("all")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private BaseService baseService;
	
	@Override
	@Transactional(readOnly = true)
	public Pager findByPager(String[] properties, Object[] vals, Pager Pager)
			throws Exception {
		return baseService.findByPager(Employee.class, properties, vals, Pager);
	}

	@Override
	@Transactional
	public void delete(Employee o) throws Exception {
		baseService.delete(o);
	}

	@Override
	@Transactional
	public void update(Employee o) throws Exception {
		baseService.update(o);
	}

	@Override
	@Transactional
	public void save(Employee o) throws Exception {
		baseService.save(o);
	}

	@Override
	@Transactional(readOnly = true)
	public Employee get(String id) throws Exception {
		return (Employee) baseService.get(Employee.class, id);
	}

	@Override
	@Transactional
	public void delete(String[] ids) throws Exception {
		baseService.delete(Employee.class,ids);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Employee> getList(String[] ps, Object[] vs) throws Exception {
		return baseService.getList(Employee.class, ps, vs);
	}

//	@Override
//	@Transactional
//	public void update(String[] ps, Object[] vs, String where) throws Exception {
//		baseService.update(Employee.class, ps, vs, where);
//	}

	@Override
	@Transactional(readOnly = true)
	public Object sum(String hql) throws Exception {
		return baseService.sum(hql);
	}

	@Override
	@Transactional
	public void delete(String id) throws Exception {
		baseService.delete(Employee.class, id);
	}

	@Override
	@Transactional
	public Long count(String[] ps, Object[] vs) throws Exception {
		return baseService.getTotalCount(Employee.class, ps, vs);
	}

	@Override
	@Transactional
	public Employee get(String p, String v) throws Exception {
		return (Employee) baseService.get(Employee.class, p, v);
	}

	@Override
	public Employee getByMemberId(String memberId) throws Exception {
		return get("member_id",memberId);
	}


}
