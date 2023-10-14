package com.test.jdbc;

//Properities连接示例
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class UseProperitesManageConfig {

    static String driverClass = null;
    static String url = null;
    static String username = null;
    static String password = null;
    public static void Sql_Link(String name,String pass, int uno) {
//    public static void Sql_Link( int uno) {
        //使用类的加载器
        //root   MySQL_Root.properities
        //user01
        String[] str;
        str = new String[] {"MySQL_Root.properities","Mysql_user01.properities"};

        InputStream in = UseProperitesManageConfig.class.getClassLoader().getResourceAsStream(str[uno]);
        //System.out.println(in); //表明以正确读取配置文件：java.io.BufferedInputStream@5577140b
        Properties pro = new Properties();

        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取集合中的键值对
        //注意，要加载MySQL驱动
        driverClass = pro.getProperty("driverClass");
        url = pro.getProperty("url");
        username = pro.getProperty("username");
        password = pro.getProperty("password");
        if(uno==0){
            username = name;
            password =pass;
        }
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //连接mysql的连接对象
    public static Connection getConn() {
        Connection con=null;
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 关闭连接，保证mysql资源的释放，能够充分使用资源
     * 链接对象：Connection
     * 遍历结果集：ResultSet
     * SQL执行参数化查询:PreparedStatement
     */
    public static void close(ResultSet rs, PreparedStatement ps,Connection conn) {
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




}
