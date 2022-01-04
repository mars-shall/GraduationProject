package com.practice.homework.base.system.dictionary.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = 5470377107885702956L;
	private Integer id;
	private String parent;
	private String code;
	private String text;
}
