package com.practice.homework.system.hostpital.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class Department extends BaseEntity {
	private static final long serialVersionUID = 5675242275184306009L;
	private Integer id;
	private Hostpital hospital;
	private Department parent;
	private String code;
	private String name;
}
