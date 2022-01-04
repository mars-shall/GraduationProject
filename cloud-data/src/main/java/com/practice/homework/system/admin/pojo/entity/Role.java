package com.practice.homework.system.admin.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class Role extends BaseEntity {
	private static final long serialVersionUID = 5381896217476161718L;
	private Integer id;
	private String code;
	private String text;
}
