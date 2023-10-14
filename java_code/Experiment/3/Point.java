import java.util.Scanner;
public class Point{
	double x;
	double y;
	static int countp;

	void output1(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入点的坐标:");
		x = sc.nextDouble(); 
		y = sc.nextDouble();
		System.out.println("点的坐标:"+'('+x+','+y+')');
	}
	static void output2(){
		System.out.println("键盘输入点的个数为："+countp);
	}
	
}