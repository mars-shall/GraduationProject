package com.practice.homework.system.dictionary.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class Area extends BaseEntity {
	private static final long serialVersionUID = 3945728722993461962L;
	private Integer id;
	private Area parent;
	private String code;
	private String text;
}
