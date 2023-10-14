package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.test.model.*;
import com.test.jdbc.UseProperitesManageConfig;
public class SqlManager_Wu {


/**
 * @description:  新增出版社
 * @param:
 * @return:
 * @author
 * @date: 2023/6/26 22:54
 */
    public void add_press(int pressID, String pressTitle, String address, String contactPerson, String telephone, String email) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into press values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setInt(1,3);
            ps.setInt(1,pressID);
            ps.setString(2, pressTitle);
            ps.setString(3, address);
            ps.setString(4, contactPerson);
            ps.setString(5, telephone);
            ps.setString(6, email);
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
    /**
     * @description:  新增书籍
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:55
     */
    public void add_books(int bookID, String bookTitle, double price, String author) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into books values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setInt(1,3);
            ps.setInt(1,bookID);
            ps.setString(2, bookTitle);
            ps.setDouble(3, price);
            ps.setString(4, author);
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

    /**
     * @description:  新增配送公司
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:55
     */
    public void add_company(int pressID, String pressTitle, String address, String contactPerson, String telephone, String email) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into company values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //ps.setInt(1,3);
            ps.setInt(1,pressID);
            ps.setString(2, pressTitle);
            ps.setString(3, address);
            ps.setString(4, contactPerson);
            ps.setString(5, telephone);
            ps.setString(6, email);
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

    /**
     * @description: 删除配送公司
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:55
     */
    public void delete_company(String pressTitle) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "delete from company where companyTitle=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行操作更改
            ps.setString(1, pressTitle);
            int num = ps.executeUpdate();
            System.out.println("操作了" + num + "条数据");
            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /**
     * @description: 删除出版社
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:56
     */
    public void delete_press(String pressTitle) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "delete from press where pressTitle=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行操作更改
            ps.setString(1, pressTitle);
            int num = ps.executeUpdate();
            System.out.println("操作了" + num + "条数据");
            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @description: 删除书籍
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:56
     */
    public void delete_books(String bookTitle) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "delete from books where bookTitle=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行操作更改
            ps.setString(1, bookTitle);
            int num = ps.executeUpdate();
            System.out.println("操作了" + num + "条数据");
            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @description: 修改书籍信息
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:56
     */
    public boolean update_books(Books books) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "update books set price=? where bookTitle=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, books.getPrice());
            ps.setString(2, books.getBookTitle());

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

    /**
     * @description: 修改出版社信息
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:56
     */
    public boolean update_press(Press press) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "update press set address=?,contactPerson=?,telephone=?,email=? where pressTitle=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, press.getAddress());
            ps.setString(2, press.getContactPerson());
            ps.setString(3, press.getTelephone());
            ps.setString(4, press.getEmail());
            ps.setString(5, press.getPressTitle());

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

    /**
     * @description: 修改配送公司信息
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:57
     */
    public boolean update_company(Company company) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "update company set address=?,contactPerson=?,telephone=?,email=? where companyTitle=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, company.getAddress());
            ps.setString(2, company.getContactPerson());
            ps.setString(3, company.getTelephone());
            ps.setString(4, company.getEmail());
            ps.setString(5, company.getCompanyTitle());

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

    /**
     * @description: 查询配送公司信息
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:57
     */
    public List<Press> getAll_press() {

        String[] str;
        str = new String[]{"select * from press"};

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = str[0];
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<Press> list = new ArrayList<Press>();
            while (rs.next()) {
                Press s = new Press();
                s.setPressTitle(rs.getString(2));
                s.setAddress(rs.getString(3));
                s.setContactPerson(rs.getString(4));
                s.setTelephone(rs.getString(5));
                s.setEmail(rs.getString(6));
//                s.setId(rs.getInt(1));
//                s.setName(rs.getString(2));
//                s.setPrice(rs.getInt(3));
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


    /**
     * @description: 查询书籍信息
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:57
     */
    public List<Books> getAll_books() {


        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from books";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<Books> list = new ArrayList<Books>();
            while (rs.next()) {
                Books s = new Books();
                s.setBookID(rs.getInt(1));
                s.setBookTitle(rs.getString(2));
                s.setPrice(rs.getDouble(3));
                s.setAuthor(rs.getString(4));
//                s.setNumber(rs.getInt(2));
//                s.setSta(rs.getInt(3));
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
    /**
     * @description: 查询配送公司信息
     * @param:
     * @return:
     * @author
     * @date: 2023/6/26 22:57
     */
    public List<Company> getAll_company() {
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from company";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行查询结果集
            ResultSet rs = ps.executeQuery();
            //创建一个菜单对象返回
            List<Company> list = new ArrayList<Company>();
            while (rs.next()) {
                Company s = new Company();
                s.setCompanyID(rs.getInt(1));
                s.setCompanyTitle(rs.getString(2));
                s.setAddress(rs.getString(3));
                s.setContactPerson(rs.getString(4));
                s.setTelephone(rs.getString(5));
                s.setEmail(rs.getString(6));
//                s.setNumber(rs.getInt(2));
//                s.setSta(rs.getInt(3));
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






