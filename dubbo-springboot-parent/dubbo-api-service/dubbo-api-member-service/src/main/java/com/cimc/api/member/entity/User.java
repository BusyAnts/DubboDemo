/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.cimc.api.member.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Dubbo中实体类必须实现序列号接口
 *
 * @author chenz
 */
@Data
public class User implements Serializable {
	private String name;
	private Integer age;

}
