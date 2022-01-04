package com.practice.homework.system.professional.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class ProGrade extends BaseEntity {
	private static final long serialVersionUID = -8698126882863934465L;
	private Integer id;
	private String code;
	private String text;
}
