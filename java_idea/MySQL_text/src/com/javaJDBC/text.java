package com.javaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class text {
	
	//mysql驱动名
	private static String driverName="com.mysql.jdbc.Driver";
	//url的格式:jdbc:mysql://IP地址:端口号/数据库名称？额外参数
	private static String url="jdbc:mysql://localhost:3306/db1?verifyServerCertificate=false&useSSL=false";
	//用户名
	private static String userName="root";
	//密码
	private static String password="141510";

	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName(driverName);
			System.out.println("数据库驱动加载成功！");
			try {
				con=DriverManager.getConnection(url, userName, password);
				System.out.println("数据库连接成功！");
				System.out.println("数据库操作。。。");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("数据库连接失败！");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库驱动加载失败！");
		} finally {
			try {
				con.close();
				System.out.println("数据库连接关闭成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("数据库连接关闭失败！");
			}
			
		}
	}
}