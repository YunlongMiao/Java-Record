package com.statement.start;

import java.sql.Connection;
import java.sql.Statement;

import entity.Book;

import util.DbUtil;

public class DeleteText {

	public static void delete(Integer id) throws Exception{
		String sql="delete from t_book where id="+id;
		DbUtil dbUtil=new DbUtil();
		Connection connection=dbUtil.getConnection();
		Statement statement=connection.createStatement();
		int num=statement.executeUpdate(sql);
		System.out.println("操作了"+num+"条数据");
		statement.close();
		dbUtil.closeConnection(connection);
	}
	
	public static void main(String[] args) {
		try {
			DeleteText.delete(11);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
