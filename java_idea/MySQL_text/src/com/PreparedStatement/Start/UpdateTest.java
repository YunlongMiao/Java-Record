package com.PreparedStatement.Start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import entity.Book;
import util.DbUtil;

public class UpdateTest {

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
	
	public static void main(String[] args) {
		Book book=new Book();
		book.setId(15);
		book.setBookName("Jdbc连接数据库并做操作");
		book.setBookType("JDBC操作");
		book.setAuthor("牛逼的人");
		book.setPrice(999.99);
		book.setId(13);
		try {
			UpdateTest.update(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
