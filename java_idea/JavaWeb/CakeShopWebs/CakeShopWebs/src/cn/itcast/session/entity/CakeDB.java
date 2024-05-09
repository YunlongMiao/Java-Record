package cn.itcast.session.entity;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class CakeDB {
    private static Map<String, Cake> cake = new LinkedHashMap<String, Cake>();
    static {
        cake.put("1", new Cake("1", "A�൰��"));
        cake.put("2", new Cake("2", "B�൰��"));
        cake.put("3", new Cake("3", "C�൰��"));
        cake.put("4", new Cake("4", "D�൰��"));
        cake.put("5", new Cake("5", "E�൰��"));
    }
    // ������еĵ���
    public static Collection<Cake> getAll() {
        return cake.values();
    }
    // ����ָ����id�񵰸�
    public static Cake getCake(String id) {
        return cake.get(id);
    }
}
