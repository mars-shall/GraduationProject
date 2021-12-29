package com.practice.homework.base.pojo.enums;

public enum ResponseCode {
	RESPONSE_SUCCESS(2000,"系统响应业务成功"),
	RESPONSE_UNAYTH(3000,"用户未认证"),
	RESPONSE_ERROR(4000,"系统业务逻辑出处理错误"),
	RESOPNSE_EXCEPTION(5000,"系统异常");
	private Integer code;
	private String remark;

	ResponseCode(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
