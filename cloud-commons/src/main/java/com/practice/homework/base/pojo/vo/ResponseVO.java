package com.practice.homework.base.pojo.vo;

import com.practice.homework.base.pojo.enums.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "系统响应视图信息",description = "系统响应视图信息")
public class ResponseVO implements Serializable {

	private static final long serialVersionUID = -4383446549487257087L;
	@ApiModelProperty(value = "响应编码")
	private Integer code;
	@ApiModelProperty(value = "响应信息")
	private String message;
	@ApiModelProperty(value = "响应数据")
	private Object data;

	public ResponseVO(Integer code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static ResponseVO getSuccess(String message) {
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS.getCode(), message, "");
	}
	public static ResponseVO getSuccess(Object Data) {
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS.getCode(),ResponseCode.RESPONSE_SUCCESS.getRemark(),Data);
	}

	public static ResponseVO getUnauth(){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS.getCode(),ResponseCode.RESPONSE_SUCCESS.getRemark(),"");
	}

	public static ResponseVO getError(String message){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS.getCode(),message,"");
	}

	public static ResponseVO getException(Exception e){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS.getCode(),e.getMessage(), "");
	}
}
