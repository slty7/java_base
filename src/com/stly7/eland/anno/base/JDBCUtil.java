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
	// ��̬�����һ�����ڼ�������
	static{
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			// ��Ϊ�ҵ����mariadb���ݿ�����
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
