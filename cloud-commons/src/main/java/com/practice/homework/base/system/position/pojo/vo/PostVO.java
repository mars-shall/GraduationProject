package com.practice.homework.base.system.position.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * 人员职务信息表
 */
@Data
public class PostVO extends BaseVO {
	private static final long serialVersionUID = 1495473029701063026L;
	private Integer id;
	private String code;
	private String text;
}
