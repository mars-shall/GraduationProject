package com.practice.homework.system.dictionary.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = 5470377107885702956L;
	private Integer id;
	private DataCode parent;
	private String code;
	private String text;
}
