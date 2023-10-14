package com.statement.start;

import java.sql.Connection;
import java.sql.Statement;

import entity.Book;
import util.DbUtil;

public class UpdateText {

	public static void update(Book b) throws Exception{
		String sql="update t_book set bookName='"+b.getBookName()+"',bookType='"+b.getBookType()+"' where id="+b.getId();
		DbUtil dbUtil=new DbUtil();
		Connection connection=dbUtil.getConnection();
		Statement statement=connection.createStatement();
		int num=statement.executeUpdate(sql);
		System.out.println("操作了"+num+"条数据");
		statement.close();
		dbUtil.closeConnection(connection);
	}
	
	public static void main(String[] args) {
		Book book=new Book();
		book.setId(10);
		book.setBookName("JDBC Java");
		book.setBookType("JDBC");
		try {
			UpdateText.update(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
