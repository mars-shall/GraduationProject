package com.practice.homework.system.professional.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * 专业技术职务信息表
 */
@Data
public class Profession extends BaseEntity {
	private static final long serialVersionUID = -4842483339208906786L;
	private Integer id;
	private ProCategory category;
	private ProGrade grade;
	private String code;
	private String name;
}
