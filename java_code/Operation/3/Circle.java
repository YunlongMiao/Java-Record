import java.util.Scanner;
public class Circle{
	final double PI=3.1415;
	double R;
	
	void getR(){
		System.out.println("������Բ�İ뾶");
		Scanner rs=new Scanner(System.in);
		R=rs.nextDouble();
	}
	
	void perimeter(){
		System.out.println("�ܳ���"+2*PI*R);
	}
	double area(){
		double arrea=PI*R*R;
		System.out.println("�����"+arrea);
		return arrea;
	}
	
}