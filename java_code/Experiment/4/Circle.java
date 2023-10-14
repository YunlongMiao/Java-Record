public class Circle {
    final double PI=3.14159;
    double raduis;
    Point point = new Point();
    void display(double s){
        double 周长,面积;
        raduis=s;
        周长=2*PI*raduis;
        面积=raduis*raduis*PI;
        point.point(3.2,2.3);
        System.out.println("周长："+周长);
        System.out.println("面积："+面积);
    }

}
