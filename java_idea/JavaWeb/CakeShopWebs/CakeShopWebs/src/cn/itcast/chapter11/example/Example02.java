package cn.itcast.chapter11.example;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

//从配置文件中获取数据库连接信息和数据源的初始化信息
public class Example02 {
    public static DataSource ds = null;
    static {
        // 新建一个配置文件对象
        Properties prop = new Properties();
        try {
            // 通过类加载器找到文件路径，读取配置文件
            InputStream in = new Example02().getClass().getClassLoader()
                    .getResourceAsStream("dbcpconfig.properties");
            // 把文件以输入流的形式加载到配置对象中
            prop.load(in);
            // 创建数据源对象
            ds = BasicDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        // 获取数据库连接对象
        Connection conn = ds.getConnection();
        //获取数据库连接信息
        DatabaseMetaData metaData = conn.getMetaData();
        //打印数据库连接信息
        System.out.println(metaData.getURL()
                +",UserName="+metaData.getUserName()
                +","+metaData.getDriverName());
    }
}
