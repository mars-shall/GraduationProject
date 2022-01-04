package com.practice.homework.system.admin.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 2013725096388310337L;
	private Integer id;
	private Menu parent;
	private String menu;
	private String text;
	private String url;
	private String style;
	private Integer no;
}
