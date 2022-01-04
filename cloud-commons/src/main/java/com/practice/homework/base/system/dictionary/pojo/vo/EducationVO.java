package com.practice.homework.base.system.dictionary.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class EducationVO extends BaseVO {
	private static final long serialVersionUID = -6269287063260298552L;
	private Integer id;
	private String code;
	private String text;
}
