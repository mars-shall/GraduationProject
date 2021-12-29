package com.practice.homework.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value = "系统分页视图信息",description = "系统分页视图信息")
public class PageVO<E> implements Serializable {
	private static final long serialVersionUID = 805250031996401039L;

	@ApiModelProperty(value = "当前页码")
	private Integer pageNum;
	@ApiModelProperty(value = "每页显示数量")
	private Integer pageSize;
	@ApiModelProperty(value = "分页列表")
	private List<E> pageList;
	@ApiModelProperty(value = "总页数")
	private Integer totalNum;
	@ApiModelProperty(value = "总数量")
	private Long totalSize;

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if(pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		}
		else{
			this.pageNum = 1;
		}
		if(pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		}
		else{
			this.pageSize = 10;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getPageList() {
		return pageList;
	}

	public void setPageList(List<E> pageList) {
		this.pageList = pageList;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
}
