package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.test.model.*;
import com.test.jdbc.UseProperitesManageConfig;
public class StudentDAO {


    //新增订单数据到数据库中
    public void add_Ord(String name, int phone, int zhuo) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into ord values(null,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setInt(1,3);
            ps.setString(1, name);
            ps.setInt(2, phone);
            ps.setInt(3, zhuo);
            //执行操作更改
            int num = ps.executeUpdate();
            System.out.println("操作了" + num + "条数据");
            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    //修改餐桌状态
    public boolean update_table(Table Tab) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "update tables set zt=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Tab.getSta());
            ps.setInt(2, Tab.getNumber());

            //执行操作更改
            boolean result = ps.executeUpdate() > 0;
            //关闭操作数据库
            UseProperitesManageConfig.close(null, ps, conn);
            return result;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }


    //查询员工工资
    public Employee em_salary(String name) {
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from em_salary where name=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            //执行操作更改
            ResultSet rs = ps.executeQuery();
            //创建一个员工对象返回
            Employee s = new Employee();
            while (rs.next()) {
                s.setName(rs.getString(1));
                s.setSalary(rs.getInt(2));
            }
            //关闭操作数据库
            UseProperitesManageConfig.close(rs, ps, conn);
            return s;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    //查询菜单
    public List<Menus> getAll_menus() {

        String[] str;
        str = new String[]{"select * from menus"};

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = str[0];
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<Menus> list = new ArrayList<Menus>();
            while (rs.next()) {
                Menus s = new Menus();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setPrice(rs.getInt(3));
                //把当前对象存储到list集合中
                list.add(s);
            }
            //关闭操作数据库
            UseProperitesManageConfig.close(rs, ps, conn);
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    //查询餐桌状态
    public List<Table> getAll_table() {



        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from tables";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<Table> list = new ArrayList<Table>();
            while (rs.next()) {
                Table s = new Table();
                s.setNumber(rs.getInt(2));
                s.setSta(rs.getInt(3));
                //把当前对象存储到list集合中
                list.add(s);
            }
            //关闭操作数据库
            UseProperitesManageConfig.close(rs, ps, conn);
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    //查询重点用户vip
    public List<vip> getAll_vip() {


        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from vip";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<vip> list = new ArrayList<vip>();
            while (rs.next()) {
                vip s1 = new vip();
                s1.setId(rs.getInt(1));
                s1.setName(rs.getString(2));
                s1.setPhone(rs.getString(3));
                //把当前对象存储到list集合中
                list.add(s1);
            }
            //关闭操作数据库
            UseProperitesManageConfig.close(rs, ps, conn);
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    //查询所有员工信息
    public List<Employee> getAll_Emp() {

//        String[] str;
//        str = new String[]{"select * from menus"};

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from em";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<Employee> list = new ArrayList<Employee>();
            while (rs.next()) {
                Employee s = new Employee();
                s.setId(rs.getString(1));
                s.setName(rs.getString(2));
                s.setSex(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setSalary(rs.getInt(5));
                //把当前对象存储到list集合中
                list.add(s);
            }
            //关闭操作数据库
            UseProperitesManageConfig.close(rs, ps, conn);
            return list;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}






