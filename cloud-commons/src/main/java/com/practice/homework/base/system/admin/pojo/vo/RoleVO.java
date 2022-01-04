package com.practice.homework.base.system.admin.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = 5381896217476161718L;
	private Integer id;
	private String code;
	private String text;
}
