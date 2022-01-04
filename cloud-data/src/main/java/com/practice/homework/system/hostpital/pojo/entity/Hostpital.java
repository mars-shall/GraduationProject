package com.practice.homework.system.hostpital.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import com.practice.homework.system.dictionary.pojo.entity.Area;
import lombok.Data;

@Data
public class Hostpital extends BaseEntity {
	private static final long serialVersionUID = 5916858605336243661L;
	private Integer id;
	private String name;
	private String parent;
	private String code;
	private String person;      //负责人
	private String address;
	private String provinces;
	private String cities;
	private String counties;
	private String townships;
	private String village;
	private String number;
	private String postal;
	private Area area;
	private String cellphone;
	private String email;
}
