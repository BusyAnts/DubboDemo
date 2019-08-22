package com.cimc.api.member.service.impl;

import com.cimc.api.member.entity.User;
import com.cimc.api.member.service.IMemberService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 会员服务接口实现
 *
 * @author chenz
 */
@Service
public class MemberServiceImpl implements IMemberService {

	@Override
	public User getMember(String name) {
		User userEntity = new User();
		userEntity.setName(name);
		userEntity.setAge(20);
		System.out.println("会员服务被调用");
		return userEntity;
	}

}
