import java.util.Scanner;
public class Point{
	double x;
	double y;
	static int countp;

	void output1(){
		Scanner sc = new Scanner(System.in); 
		System.out.println("������������:");
		x = sc.nextDouble(); 
		y = sc.nextDouble();
		System.out.println("�������:"+'('+x+','+y+')');
	}
	static void output2(){
		System.out.println("���������ĸ���Ϊ��"+countp);
	}
	
}