public class Circle {
    final double PI=3.14159;
    double raduis;
    Point point = new Point();
    void display(double s){
        double �ܳ�,���;
        raduis=s;
        �ܳ�=2*PI*raduis;
        ���=raduis*raduis*PI;
        point.point(3.2,2.3);
        System.out.println("�ܳ���"+�ܳ�);
        System.out.println("�����"+���);
    }

}
