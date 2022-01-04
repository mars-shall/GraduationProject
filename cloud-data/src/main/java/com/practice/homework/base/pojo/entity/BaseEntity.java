package com.practice.homework.base.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 2476001684062913041L;

	private Integer status;
	@TableField(value = "creator")
	private String creator;
	@TableField(value = "createTime")
	private Date createTime;
	@TableField(value = "modifier")
	private String modifier;
	@TableField(value = "updateTime")
	private Date updateTime;
}
