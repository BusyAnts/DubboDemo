package com.cimc.member.service.impl;

import com.cimc.member.service.MemberService;

/**
 * @author chenz
 * @create 2019-08-21 19:17
 */
public class MemServiceImpl implements MemberService {
    public String getUser(Long userId) {
        System.out.println("订单服务调用会员服务:userId" + userId);
        return "james";
    }
}
