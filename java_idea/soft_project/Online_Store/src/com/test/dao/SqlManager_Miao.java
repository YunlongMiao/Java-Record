package com.test.dao;

import com.test.jdbc.UseProperitesManageConfig;
import com.test.model.Inventory;
import com.test.model.Purchase;
import com.test.model.ShipSheet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlManager_Miao {

    /**
     * @description:  添加配送信息
     * @param: 订单号,收件人,收件人电话,配送地址,配送状态
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/26 23:36
     */
    public void Add_Distribution(int orderNo, String  receiver, String  Tele,  String shipAddress){

        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into ShipSheet values(?,?,?,?,?)";
        try {
            PreparedStatement ps = null;
            if (conn != null) {
                System.out.println("数据库连接成功");
                ps = conn.prepareStatement(sql);
                //表赋值
                ps.setInt(1, orderNo);
                ps.setString(2, receiver);
                ps.setString(3, Tele);
                ps.setString(4, shipAddress);
                ps.setBoolean(5, false);
                //执行操作更改
                int num = ps.executeUpdate();
                System.out.println("操作了" + num + "条数据");

            }else System.out.println("sql is null");

            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * @description:  查询配送列表
     * @param: null
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/27 11:28
     */
    public List<ShipSheet> QueryShippingList(){

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from ShipSheet where ShipStatus=false";
        try {
            PreparedStatement ps = null;
            if (conn != null) {
                ps = conn.prepareStatement(sql);

                //执行查询结果集
                ResultSet rs = ps.executeQuery();
                //创建一个菜单对象返回
                List<ShipSheet> list = new ArrayList<ShipSheet>();
                while (rs.next()) {
                    ShipSheet s = new ShipSheet();

                    s.setOrderNo(rs.getInt(1));
                    s.setReceiver(rs.getString(2));
                    s.setTele(rs.getString(3));
                    s.setShipAddress(rs.getString(4));

                    //把当前对象存储到list集合中
                    list.add(s);
                }
                //关闭操作数据库
                UseProperitesManageConfig.close(rs, ps, conn);
                System.out.println("查询配送列表成功");
                return list;

            }else System.out.println("sql is null");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

/**
 * @description:  配送完成记录
 * @param: null
 * @return:
 * @author MiaoYunLong
 * @date: 2023/6/27 11:59
 */
    public Boolean DeliveryCompleted(int orderNo){
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "update ShipSheet set ShipStatus=true where orderNo=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1,orderNo);

            //执行操作更改
            boolean result = ps.executeUpdate() > 0;
            System.out.println("配送状态已修改");
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
     * @description:  查询所有配送列表
     * @param: null
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/27 12:29
     */
    public List<ShipSheet> QueryAllShippingList(){

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from ShipSheet";
        try {
            PreparedStatement ps = null;
            if (conn != null) {
                ps = conn.prepareStatement(sql);

                //执行查询结果集
                ResultSet rs = ps.executeQuery();
                //创建一个菜单对象返回
                List<ShipSheet> list = new ArrayList<ShipSheet>();
                while (rs.next()) {
                    ShipSheet s = new ShipSheet();

                    s.setOrderNo(rs.getInt(1));
                    s.setReceiver(rs.getString(2));
                    s.setTele(rs.getString(3));
                    s.setShipAddress(rs.getString(4));
                    s.setShipStatus(rs.getBoolean(5));
                    //把当前对象存储到list集合中
                    list.add(s);
                }
                //关闭操作数据库
                UseProperitesManageConfig.close(rs, ps, conn);
                System.out.println("查询所有配送列表成功");
                return list;

            }else System.out.println("sql is null");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }
    
    
    /** 
     * @description: 添加采购信息
     * @param: null 
     * @return:  
     * @author MiaoYunLong
     * @date: 2023/6/27 14:19
     */ 
    public void AddPurchaseInformation(String ISBN ,String BookName ,int PurchaseNum){
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into purchase values(null,?,?,?,?,?)";
        try {
            PreparedStatement ps = null;
            if (conn != null) {

                //获取实时时间
                java.util.Date date = new java.util.Date();
                Timestamp timeStamp = new Timestamp(date.getTime());

                ps = conn.prepareStatement(sql);
                //表赋值
                ps.setString(1, ISBN);
                ps.setString(2, BookName);
                ps.setInt(3, PurchaseNum);
                ps.setBoolean(4, false);    //默认未完成采购
//                ps.setDate(6,timeStamp);  //年月日
                ps.setTimestamp(5, timeStamp);  //写入实时时间，年月日时分秒

                //执行操作更改
                int num = ps.executeUpdate();
                System.out.println("操作了" + num + "条数据");


            }else System.out.println("sql is null");

            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * @description:  查询采购列表
     * @param: null
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/27 15:03
     */

    public List<Purchase> QueryPurchaseList(){

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from purchase where PurchaseStatus=false";
        try {
            PreparedStatement ps = null;
            if (conn != null) {
                ps = conn.prepareStatement(sql);

                //执行查询结果集
                ResultSet rs = ps.executeQuery();
                //创建一个菜单对象返回
                List<Purchase> list = new ArrayList<Purchase>();
                while (rs.next()) {
                    Purchase s = new Purchase();

                    s.setISBN(rs.getString(2));
                    s.setBookName(rs.getString(3));
                    s.setPurchaseNum(rs.getInt(4));

                    //把当前对象存储到list集合中
                    list.add(s);
                }
                //关闭操作数据库
                UseProperitesManageConfig.close(rs, ps, conn);

                return list;

            }else System.out.println("sql is null");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    
    /** 
     * @description: 采购完成记录
     * @param: null 
     * @return:  
     * @author MiaoYunLong
     * @date: 2023/6/27 15:12
     */
    public Boolean PurchaseCompletionRecord(String ISBN) {
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "update purchase set PurchaseStatus=true where ISBN=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1,ISBN);

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
     * @description: 新增图书条目
     * @param: null 
     * @return:  
     * @author MiaoYunLong
     * @date: 2023/6/27 15:27
     */ 
    
    public void NewBookEntry(String ISBN ,String BookName){
        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "insert into inventory values(null,?,?,?,?)";
        try {
            PreparedStatement ps = null;
            if (conn != null) {

                //获取实时时间
                java.util.Date date = new java.util.Date();
                Timestamp timeStamp = new Timestamp(date.getTime());

                ps = conn.prepareStatement(sql);
                //表赋值
                ps.setString(1, ISBN);
                ps.setString(2, BookName);
                ps.setInt(3,0);
//                ps.setDate(6,timeStamp);  //年月日
                ps.setTimestamp(4, timeStamp);  //写入实时时间，年月日时分秒

                //执行操作更改
                int num = ps.executeUpdate();
                System.out.println("操作了" + num + "条数据");


            }else System.out.println("sql is null");

            //关闭数据库
            UseProperitesManageConfig.close(null, ps, conn);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /**
     * @description: 图书数目修改
     * @param: null
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/27 15:41
     */
//    public List<Inventory> BookNumberRevision(Boolean Status, String ISBN, int Number){
    public void BookNumberRevision(Boolean Status, String ISBN, int Number){

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = null;
        if(Status)
            sql = "update inventory set storeNo=storeNo+? where ISBN=?";
        else sql = "update inventory set storeNo=storeNo-? where ISBN=?";
        try {
            PreparedStatement ps = null;
            if (conn != null) {
                ps = conn.prepareStatement(sql);


                ps.setInt(1,Number);
                ps.setString(2,ISBN);
                //执行操作更改
                boolean result = ps.executeUpdate() > 0;    //executeUpdate

                ResultSet rs = null;
//
//                //执行查询结果集
//                rs = ps.executeQuery();
//                //创建一个菜单对象返回
//                List<Inventory> list = new ArrayList<Inventory>();
//                while (rs.next()) {
//                    Inventory s = new Inventory();
//
//                    s.setISBN(rs.getString(2));
//                    s.setBookName(rs.getString(3));
//                    s.setStoreNo(rs.getInt(4));
//
//                    //把当前对象存储到list集合中
//                    list.add(s);
//                }


                //关闭操作数据库
                UseProperitesManageConfig.close(rs, ps, conn);

//                return list;

            }else System.out.println("sql is null");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        return null;
    }


    /**
     * @description:  图书条目删除
     * @param: null
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/27 16:02
     */
    public void DeletionOfBookEntry(String ISBN){

        //执行增删改查的sql语句
        //1、连接mysql
        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "delete from inventory where ISBN=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            //执行操作更改
            ps.setString(1, ISBN);
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
     * @description: 查询所有图书列表  Query a list of all books
     * @param: null 
     * @return:  
     * @author MiaoYunLong
     * @date: 2023/6/27 16:11
     */

    public List<Inventory> QueryListOfAllBooks() {

        Connection conn = UseProperitesManageConfig.getConn();
        //2、预编译sql执行
        String sql = "select * from inventory";
        try {
            PreparedStatement ps = null;
            if (conn != null) {
                ps = conn.prepareStatement(sql);

                //执行查询结果集
                ResultSet rs = ps.executeQuery();
                //创建一个菜单对象返回
                List<Inventory> list = new ArrayList<Inventory>();
                while (rs.next()) {
                    Inventory s = new Inventory();

                    s.setISBN(rs.getString(2));
                    s.setBookName(rs.getString(3));
                    s.setStoreNo(rs.getInt(4));
                    s.setStoreDate(rs.getString(5));
                    //把当前对象存储到list集合中
                    list.add(s);
                }
                //关闭操作数据库
                UseProperitesManageConfig.close(rs, ps, conn);
                return list;

            } else System.out.println("sql is null");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
