import java.util.Scanner;
public class Main{
	public static void main(String args[]){

		Point point=new Point();
		Scanner cs = new Scanner(System.in); 
		System.out.println("�������ĸ�����"); 
		int i = cs.nextInt();
		for(int s=0;s<i; s++){
			point.output1();
			Point.countp++;
		}
		Point.output2();

	}
}