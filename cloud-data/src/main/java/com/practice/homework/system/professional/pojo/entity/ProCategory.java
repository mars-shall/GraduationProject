package com.practice.homework.system.professional.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务类别实体信息</b>
 */
@Data
public class ProCategory extends BaseEntity {
	private static final long serialVersionUID = 3360095505608161612L;
	private Integer id;
	private String code;
	private String text;
}
