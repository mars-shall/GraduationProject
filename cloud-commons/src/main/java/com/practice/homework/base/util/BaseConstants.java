package com.practice.homework.base.util;

import java.util.Properties;

public class BaseConstants {
	private static final Properties props = new Properties();

	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	public static final String SWAGGER_TITLE = props.getProperty("swagger.title");

	public static final String SWAGGER_DESCRIPTION = props.getProperty("swagger.description");

	public static final String SWAGGER_VERSION = props.getProperty("swagger.version");

	public static final String SWAGGER_CONTACT_NAME= props.getProperty("swagger.contact.name");

	public static final String SWAGGER_CONTACT_URL = props.getProperty("swagger.contact.url");

	public static final String SWAGGER_CONTACT_EMAIL = props.getProperty("swagger.contact.email");

	public static final String SWAGGER_BASE_PACKAGE = props.getProperty("swagger.base.package");

}
