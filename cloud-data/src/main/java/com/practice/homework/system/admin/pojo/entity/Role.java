package com.practice.homework.system.admin.pojo.entity;

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Role extends BaseEntity {
		private Long id;                       //主键
		private String code;                  //角色编码
		private String text;                  //角色信息
}
