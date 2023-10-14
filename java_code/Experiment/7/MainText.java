/**
（1）为几何图形设计一个接口Geometry，包含计算面积的抽象方法getArea();
 （2）编写圆形类、矩形类实现Geometry接口，使用构造方法，对成员变量赋值，使用方法show显示图形的面积。
 （3）编写测试主类MainClass，输出圆形和矩形的面积。

*/
public class MainText{
	public static void main(String[] args){
		ShowKind showKind=new ShowKind();
		showKind.Show(new Circle());
		showKind.Show(new Rectangle());
	}
	
}
/*		
		Geometry Show;
		Show=new Circle();
		Show.getArea(1);
		Show=new Rectangle();
		Show.getArea(1);
		*/
		