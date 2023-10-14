import java.util.Scanner;
public class Main{
	public static void main(String args[]){

		Circle circle=new Circle();
		Scanner sd =new Scanner(System.in);
		
		circle.getR();
		circle.perimeter();
		double area=circle.area();

		System.out.println("请输入圆柱的高：");
		double h=sd.nextDouble();
		double volume=area*h;
		System.out.println("圆柱体积："+volume);
	}
}