package com.PreparedStatement.Start;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Book;

import util.DbUtil;

public class AddText {
	
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

	public static void main(String[] args) {
		try {
			Book book=new Book();
			book.setId(15);
			book.setBookName("JDBC书");
			book.setBookType("JDBC");
			book.setAuthor("作者");
			book.setPrice(32.05);
			AddText.add(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
