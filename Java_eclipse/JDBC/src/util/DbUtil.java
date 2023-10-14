package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {

	//mysql������
	private static String driverName="com.mysql.jdbc.Driver";
	//url�ĸ�ʽ:jdbc:mysql://IP��ַ:�˿ں�/���ݿ����ƣ��������
	private static String url="jdbc:mysql://localhost:3306/db1?verifyServerCertificate=false&useSSL=false";
	//�û���
	private static String userName="root";
	//����
	private static String password="141510";
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getConnection()throws Exception{
		Class.forName(driverName);
		Connection connection=DriverManager.getConnection(url, userName, password);
		return connection;
	}
	
	/**
	 * �ر�����
	 * @param con
	 * @throws SQLException
	 */
	public void closeConnection(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}
	}
}
