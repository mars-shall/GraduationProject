package com.practice.homework.base.system.admin.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * @Author
 * @Date 2022/1/4
 * @apiNote
 */
@Data
public class AdminVo extends BaseVO {
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
