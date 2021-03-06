package com.practice.homework.system.dictionary.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 人员身份实体信息</b>
 */
@Data
public class Identity extends BaseEntity {
	private static final long serialVersionUID = 7229802796791467997L;
	private Integer id;
	private String code;
	private String text;
}
