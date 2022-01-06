package com.practice.homework.system.admin.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 7208187721478109875L;
	private String id;                      //主键
	private String no;                      //工号
	private String name;                    //姓名
	private String cellphone;               //手机号码
	private String password;                //登录密码
	private String iden;                    //人员信息编码
	private String role;                    //人员角色编码
	private String pos;                     //职务信息编码
	private String educ;                    //学历信息编码
	private String prof;                    //专业信息
	private String grade;                   //职务等级
}
