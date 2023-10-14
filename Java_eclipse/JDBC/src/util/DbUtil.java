package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {

	//mysql驱动名
	private static String driverName="com.mysql.jdbc.Driver";
	//url的格式:jdbc:mysql://IP地址:端口号/数据库名称？额外参数
	private static String url="jdbc:mysql://localhost:3306/db1?verifyServerCertificate=false&useSSL=false";
	//用户名
	private static String userName="root";
	//密码
	private static String password="141510";
	
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection()throws Exception{
		Class.forName(driverName);
		Connection connection=DriverManager.getConnection(url, userName, password);
		return connection;
	}
	
	/**
	 * 关闭连接
	 * @param con
	 * @throws SQLException
	 */
	public void closeConnection(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}
	}
}
