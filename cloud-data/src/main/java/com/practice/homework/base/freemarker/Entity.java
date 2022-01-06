package com.practice.homework.base.freemarker;

import java.io.Serializable;
import java.util.List;

public class Entity implements Serializable {
	private static final long serialVersionUID = 457861941673079031L;

	private String packageName;
	private String className;
	private List<Property> propertyList;

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Property> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}
}
