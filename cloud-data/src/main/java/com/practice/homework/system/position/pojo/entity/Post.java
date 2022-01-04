package com.practice.homework.system.position.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * 人员职务信息表
 */
@Data
public class Post extends BaseEntity {
	private static final long serialVersionUID = 1495473029701063026L;
	private Integer id;
	private String code;
	private String text;
}
