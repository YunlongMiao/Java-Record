package cn.itcast.jdbc.utils;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

//创建数据源
public class C3p0Utils {
    private static DataSource ds;
    static {
        ds = new ComboPooledDataSource();
    }
    public static DataSource getDataSource() {
        return ds;
    }
}
