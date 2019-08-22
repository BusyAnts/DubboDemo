package com.cimc.api.member.service;


import com.cimc.api.member.entity.User;

/**
 * 会员服务接口
 * 实体类和定义接口信息存放在接口项目
 * 码实现存放在接口实现类里面
 *
 * @author chenz
 */
public interface IMemberService {


    /**
     * 获取会员信息
     *
     * @param name
     * @return
     */
    User getMember(String name);

}
