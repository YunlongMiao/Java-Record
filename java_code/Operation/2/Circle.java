public class Circle{
	final double PI=3.1415;
	double r;
	Circle(double a){
		r=a;
	}
	void area(){
		double area;
		area=PI*r*r;
		System.out.println("圆的面积："+area);
	}
	void perimeter(){
		double perimeter;
		perimeter=PI*2*r;
		System.out.println("圆的周长："+perimeter);
	}
}