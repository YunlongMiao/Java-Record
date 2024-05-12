package cn.itcast.chapter11.example;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
//使用C3P0数据库连接池，从配置文件中获取Connection对象
public class Example04 {
    public static DataSource ds = null;
    // 初始化C3P0数据库连接池
    static {
        // 使用c3p0-config.xml配置文件中的named-config节点中name属性的值
        ComboPooledDataSource cpds = new ComboPooledDataSource("itcast");
        ds = cpds;
    }
    public static void main(String[] args) throws SQLException {
        System.out.println(ds.getConnection());
    }
}
