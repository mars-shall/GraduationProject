package com.practice.homework.base.pojo.enums;


public enum StatusCode {
	STATUS_DISABLE("0","禁用"),
	STATUS_ENABLE("1","启用");
	private String code;
	private String mark;

	StatusCode(String code, String mark) {
		this.code = code;
		this.mark = mark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
}
