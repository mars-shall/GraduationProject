package com.practice.homework.base.freemarker;


import java.io.Serializable;

public class Property implements Serializable {
	private static final long serialVersionUID = -7062047103875627720L;
	private String type;
	private String name;
	private String comment;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
