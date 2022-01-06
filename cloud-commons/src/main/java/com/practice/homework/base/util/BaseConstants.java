package com.practice.homework.base.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.Properties;

public class BaseConstants {
	private static final Properties props = new Properties();
	private static Logger logger = LoggerFactory.getLogger(BaseConstants.class);

	static {
		try {
			props.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base.properties"));
		}catch (Exception e){
			e.printStackTrace();
			logger.error(e.getMessage() + " : " + new Date(), e);
		}
	}

	public static final String SECRET_KEY = props.getProperty("secret.key");

	public static final Long EXPIRE_AUTH_SEC = Long.parseLong(props.getProperty("expire.auth.sec"));
}
