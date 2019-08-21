package com.cimc.member.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author chenz
 */
public class AppMember {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		app.start();
		System.out.println("会员服务启动成功...");
		// 保持服务一直在运行
		System.in.read();
	}

}
