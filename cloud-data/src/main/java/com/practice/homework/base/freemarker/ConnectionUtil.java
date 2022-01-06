package com.practice.homework.base.freemarker;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author
 * @Date 2022/1/5
 * @apiNote
 */
public class ConnectionUtil {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/graduation_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
	private static String username = "root";
	private static String password = "wang152920";
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	static {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = threadLocal.get();
		if(connection == null){
			try {
				connection = DriverManager.getConnection(url,username,password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}
