package cn.itcast.session.entity;
public class Cake05 {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    public Cake05() {
    }
    public Cake05(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
