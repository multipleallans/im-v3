package com.im.service.impl;


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
	@Transactional
	public Employee get(String p, String v) throws Exception {
		return (Employee) baseService.get(Employee.class, p, v);
	}

	@Override
	public Employee getByMemberId(String memberId) throws Exception {
		return get("member_id",memberId);
	}
}
