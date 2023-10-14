import java.util.Scanner;
public class Circle{
	final double PI=3.1415;
	double R;
	
	void getR(){
		System.out.println("请输入圆的半径");
		Scanner rs=new Scanner(System.in);
		R=rs.nextDouble();
	}
	
	void perimeter(){
		System.out.println("周长："+2*PI*R);
	}
	double area(){
		double arrea=PI*R*R;
		System.out.println("面积："+arrea);
		return arrea;
	}
	
}