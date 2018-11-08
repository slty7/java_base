package com.stly7.eland.anno.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

@JDBCConfig(database = "mysql", encoding = "UTF-8", 
ip = "192.168.56.101", loginName = "root", password = "123")
public class DBUtil {
	static{
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		// 通过反射
		JDBCConfig config = DBUtil.class.getAnnotation(JDBCConfig.class);
		
		String ip = config.ip();
		int port = config.port();
		String database = config.database();
		String encoding = config.encoding();
		String loginName = config.loginName();
		String password = config.password();
		// 数据库URL
		String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip,
				port, database, encoding);
		
		return DriverManager.getConnection(url, loginName, password);
	}
	
	@Test
	public static void main(String[] args) throws SQLException {
		System.out.println(getConnection());
	}
}
