package com.practice.homework.system.dictionary.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class Education extends BaseEntity {
	private static final long serialVersionUID = -6269287063260298552L;
	private Integer id;
	private String code;
	private String text;
}
