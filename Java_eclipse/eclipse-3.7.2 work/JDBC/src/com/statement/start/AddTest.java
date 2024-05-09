package com.statement.start;

import java.sql.Connection;
import java.sql.Statement;

import entity.Book;
import util.DbUtil;

public class AddTest {

	public static void add(Book b) throws Exception{
		String sql="insert into t_book values(null,'"+b.getBookName()+"','"+b.getBookType()+"','"+b.getAuthor()+"',"+b.getPrice()+")";
		DbUtil dbUtil=new DbUtil();
		Connection connection=dbUtil.getConnection();
		Statement statement=connection.createStatement();
		int num=statement.executeUpdate(sql);
		System.out.println("������"+num+"������");
		statement.close();
		dbUtil.closeConnection(connection);
	}

	
	public static void main(String[] args) {
		try {
			Book book=new Book();
			book.setBookName("JDBC��");
			book.setBookType("JDBC");
			book.setAuthor("����");
			book.setPrice(32.05);
			AddTest.add(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
