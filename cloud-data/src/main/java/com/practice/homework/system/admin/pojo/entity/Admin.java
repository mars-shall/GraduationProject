package com.practice.homework.system.admin.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import com.practice.homework.system.dictionary.pojo.entity.Education;
import com.practice.homework.system.dictionary.pojo.entity.Identity;
import com.practice.homework.system.position.pojo.entity.Position;
import com.practice.homework.system.professional.pojo.entity.ProGrade;
import com.practice.homework.system.professional.pojo.entity.Profession;
import lombok.Data;

@Data
public class Admin extends BaseEntity {
	private static final long serialVersionUID = -7029188511855488108L;
	private String id;
	private String no;
	private String name;
	private String cellphone;
	private String password;
	private Identity iden;          //人员系统信息
	private Role role;                  //角色信息
	private Position pos;              //人员职务信息
	private Education educ;             //人员学历信息
	private Profession prof;      //人员专业职务信息
	private ProGrade grade;        //人员专业职务等级信息
}
