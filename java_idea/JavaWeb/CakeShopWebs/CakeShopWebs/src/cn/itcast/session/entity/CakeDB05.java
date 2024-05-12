package cn.itcast.session.entity;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class CakeDB05 {
    private static Map<String, Cake05> cake = new LinkedHashMap<String, Cake05>();
    static {
        cake.put("1", new Cake05("1", "A类蛋糕"));
        cake.put("2", new Cake05("2", "B类蛋糕"));
        cake.put("3", new Cake05("3", "C类蛋糕"));
        cake.put("4", new Cake05("4", "D类蛋糕"));
        cake.put("5", new Cake05("5", "E类蛋糕"));
    }
    // 获得所有的蛋糕
    public static Collection<Cake05> getAll() {
        return cake.values();
    }
    // 根据指定的id获蛋糕
    public static Cake05 getCake(String id) {
        return cake.get(id);
    }
}
