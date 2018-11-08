package com.stly7.eland.anno.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	static final String MARIADB_IP = "192.168.56.101";
	static final int MARIADB_PORT = 3306;
	static final String MARIADB_DATABASE = "mysql";
	static final String MARIADB_ENCODING = "UTF-8";
	static final String LOGIN_NAME = "root";
	static final String PASSWORD = "123";
	// 静态代码块一般用于加载驱动
	static{
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			// 因为我导入的mariadb数据库驱动
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", 
				MARIADB_IP, MARIADB_PORT, MARIADB_DATABASE, MARIADB_ENCODING);
		return DriverManager.getConnection(url, LOGIN_NAME, PASSWORD);
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}
