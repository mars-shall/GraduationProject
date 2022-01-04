package com.practice.homework.base.system.professional.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class ProGradeVO extends BaseVO {
	private static final long serialVersionUID = -8698126882863934465L;
	private Integer id;
	private String code;
	private String text;
}
