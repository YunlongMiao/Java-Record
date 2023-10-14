package com.javaJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.PreparedStatement.Start.AddText;
import com.PreparedStatement.Start.DeleteTest;
import com.PreparedStatement.Start.UpdateTest;
import entity.Book;
import util.DbUtil;
public class SqlConnect {

    /*
    * 添加表内容
    */
    public static void add(Book b) throws Exception{
        String sql="insert into book values(?,?,?,?,?)";
        DbUtil dbUtil=new DbUtil();
        Connection connection=dbUtil.getConnection();
        PreparedStatement pstmt=connection.prepareStatement(sql);
        pstmt.setInt(1,b.getId());
        pstmt.setString(2, b.getBookName());
        pstmt.setString(3, b.getBookType());
        pstmt.setString(4, b.getAuthor());
        pstmt.setDouble(5, b.getPrice());
        int num=pstmt.executeUpdate();
        System.out.println("操作了"+num+"条数据");
        pstmt.close();
        dbUtil.closeConnection(connection);
    }

    public static void AddDate(int id, String name, String Type, String author, double price){
        try {
            Book book=new Book();
            book.setId(id);
            book.setBookName(name);
            book.setBookType(Type);
            book.setAuthor(author);
            book.setPrice(price);
            AddText.add(book);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    /*
    删除操作
     */
    public static void delete(Integer id) throws Exception{
        String sql="delete from book where id=?";
        DbUtil dbUtil=new DbUtil();
        Connection connection=dbUtil.getConnection();
        PreparedStatement pstmt=connection.prepareStatement(sql);
        pstmt.setInt(1, id);
        int num=pstmt.executeUpdate();
        System.out.println("操作了"+num+"条数据");
        pstmt.close();
        dbUtil.closeConnection(connection);
    }

    public static void DeleteDate(int id){
        try {
            DeleteTest.delete(id);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    public static void update(Book b) throws Exception{
        String sql="update book set bookName=?,bookType=?,author=?,price=? where id=?";
        DbUtil dbUtil=new DbUtil();
        Connection connection=dbUtil.getConnection();
        PreparedStatement pstmt=connection.prepareStatement(sql);
        pstmt.setString(1, b.getBookName());
        pstmt.setString(2, b.getBookType());
        pstmt.setString(3, b.getAuthor());
        pstmt.setDouble(4, b.getPrice());
        pstmt.setInt(5, b.getId());
        int num=pstmt.executeUpdate();
        System.out.println("操作了"+num+"条数据");
        pstmt.close();
        dbUtil.closeConnection(connection);
    }


    public static void UpdateDate(int id, String name, String Type, String author, double price){
        Book book=new Book();
        book.setBookName(name);
        book.setBookType(Type);
        book.setAuthor(author);
        book.setPrice(price);
        book.setId(id);
        try {
            UpdateTest.update(book);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        AddDate(1,"战争与和平","文学","列夫托尔斯泰",168.99);
//        DeleteDate(13);
        UpdateDate(15,"火箭少女","搞笑","迭名",25.6);

    }

}
