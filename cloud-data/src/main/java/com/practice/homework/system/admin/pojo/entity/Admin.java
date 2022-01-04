package com.practice.homework.system.admin.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * @Author
 * @Date 2022/1/4
 * @apiNote
 */
@Data
public class Admin extends BaseEntity {
	private static final long serialVersionUID = -7029188511855488108L;
	private String id;
	private String no;
	private String name;
	private String cellphone;
	private String password;
	private String code;
	private String role;
	private String poscode;
	private String educode;
	private String procode;
	private String grade;
}
