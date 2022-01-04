package com.practice.homework.base.system.hostpital.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class DepartmentVO extends BaseVO {
	private static final long serialVersionUID = 5675242275184306009L;
	private Integer id;
	private String hospital;
	private String parent;
	private String code;
	private String name;
}
