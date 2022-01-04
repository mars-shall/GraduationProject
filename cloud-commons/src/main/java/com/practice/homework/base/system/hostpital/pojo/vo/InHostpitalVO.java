package com.practice.homework.base.system.hostpital.pojo.vo;

import com.practice.homework.base.pojo.vo.BaseVO;
import lombok.Data;

@Data
public class InHostpitalVO extends BaseVO {
	private static final long serialVersionUID = 5916858605336243661L;
	private Integer id;
	private String name;
	private String parent;
	private String code;
	private String person;
	private String address;
	private String provinces;
	private String cities;
	private String counties;
	private String townships;
	private String village;
	private String number;
	private String postal;
	private String area;
	private String cellphone;
	private String email;
}
