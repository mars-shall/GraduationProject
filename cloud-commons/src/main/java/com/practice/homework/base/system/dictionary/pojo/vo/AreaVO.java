package com.practice.homework.base.system.dictionary.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class AreaVO extends BaseVO {
	private static final long serialVersionUID = 3945728722993461962L;
	private Integer id;
	private AreaVO parent;
	private String code;
	private String text;
}
