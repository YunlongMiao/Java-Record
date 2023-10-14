package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnection {
    //1、加载jdbc连接mysql的驱动
    public final static String driver = "com.mysql.jdbc.Driver";
    //2、连接mysql数据库的地址
    public final static String url = "jdbc:mysql://localhost:3306/canting?characterEncoding=utf8&verifyServerCertificate=false&useSSL=false"; //student代表的是库的名称
    //3、连接mysql的用户名
    public final static String user = "user01";
    //4、连接mysql的密码
    public final static String pwd = "123123";
    //static静态代码块加载jdbc的驱动
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //连接mysql的连接对象
    public static Connection getConn() {
        try {
            return DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //关闭连接，保证mysql资源的释放，能够充分使用资源
    public static void close(ResultSet rs,PreparedStatement ps,Connection conn) {
        try {
            if(rs != null) {
                rs.close();
            }
            if(ps != null) {
                ps.close();
            }
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //验证jdbc类的使用
    public static void main(String[] args) {
        System.out.println(getConn()); //  com.mysql.jdbc.JDBC4Connection@5c18298f
    }
}
