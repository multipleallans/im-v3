package com.im.service;

import com.im.entity.Employee;

import java.util.List;

public interface EmployeeService {


    Employee get(String p, String v) throws Exception;
    Employee getByMemberId(String memberId) throws Exception;
}
