package com.practice.homework.base.system.professional.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * 专业技术职务信息表
 */
@Data
public class ProfessionVO extends BaseVO {
	private static final long serialVersionUID = -4842483339208906786L;
	private Integer id;
	private ProCategoryVO category;
	private ProGradeVO grade;
	private String code;
	private String name;
}
