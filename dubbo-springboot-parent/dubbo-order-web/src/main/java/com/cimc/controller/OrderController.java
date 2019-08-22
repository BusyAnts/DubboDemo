package com.cimc.controller;

import com.cimc.api.member.entity.User;
import com.cimc.api.member.service.IMemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenz
 * @create 2019-08-23 1:16
 */
@RestController
public class OrderController {
    @Reference
    private IMemberService memberService;

    @RequestMapping("/orderToMember")
    public String orderToMember() {
        User user = memberService.getMember("James");
        return user.toString();
    }
}
