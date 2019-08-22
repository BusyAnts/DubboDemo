package com.cimc.order.service;

import com.cimc.member.service.MemberService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 订单服务调用会员服务
 *
 * @author chenz
 */
public class OrderToMember {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		app.start();
		MemberService memberService = app.getBean(MemberService.class);
		String resultUser = memberService.getUser(1L);
		System.out.println("订单服务调用会员服务返回结果:" + resultUser);
	}
}
