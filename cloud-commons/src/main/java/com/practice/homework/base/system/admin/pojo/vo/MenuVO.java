package com.practice.homework.base.system.admin.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class MenuVO extends BaseVO {
	private static final long serialVersionUID = 2013725096388310337L;
	private Integer id;
	private String parent;
	private String menu;
	private String text;
	private String url;
	private String style;
	private Integer no;
}
