package com.im.service.impl;


import com.im.entity.Employee;
import com.im.entity.IpListEntity;
import com.im.entity.Member;
import com.im.service.EmployeeService;
import com.im.service.IpListService;
import com.im.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Slf4j
@Service
public class IpListServiceImpl implements IpListService {

    private final EmployeeService employeeService;

    @Override
    public boolean enableRequest(Member member,HttpServletRequest request){
        if (member == null) {
            return false;
        }
        try {
            Employee employee = employeeService.getByMemberId(member.getMemberId());
            if (employee == null) {
                // 普通用户看黑名单
                return !this.isInBlackIps(member.getMemberId(),request);
            }else {
                // 特权用户看白名单
//                return this.isInWhiteIp(member.getMemberId(),request);
                return true;
            }
        }catch (Exception e) {
            log.error(",member:{}", JSONObject.toJSONString(member),e);
            return  true;
        }

    }
}
