/**
1、从键盘输入一个整形数n，如果输入正确的话，输出n的值，
如果输入错误的话输出“input error!”最后输出program end。
*/
import java.util.Scanner;
public class MainText8_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入55");
		int n=sc.nextInt();
		if(n==55)
			System.out.println("true!");
		else
			System.out.println("input error!");
		System.out.println("program end。");
	}
}