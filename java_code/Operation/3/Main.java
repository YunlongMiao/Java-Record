import java.util.Scanner;
public class Main{
	public static void main(String args[]){

		Circle circle=new Circle();
		Scanner sd =new Scanner(System.in);
		
		circle.getR();
		circle.perimeter();
		double area=circle.area();

		System.out.println("������Բ���ĸߣ�");
		double h=sd.nextDouble();
		double volume=area*h;
		System.out.println("Բ�������"+volume);
	}
}