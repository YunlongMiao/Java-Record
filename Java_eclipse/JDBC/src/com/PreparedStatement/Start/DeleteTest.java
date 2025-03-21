package com.PreparedStatement.Start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import entity.Book;

import util.DbUtil;

public class DeleteTest {

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
	
	public static void main(String[] args) {
		try {
			DeleteTest.delete(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
