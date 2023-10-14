public class Java1 {
    public static void main(String[] args){
    K k;
    k=new G(123456,128.5,149);
    System.out.println("平均成绩："+ k.total());
    k=new H(120,15000);
    System.out.println("房屋总价："+k.total());

    }
}
