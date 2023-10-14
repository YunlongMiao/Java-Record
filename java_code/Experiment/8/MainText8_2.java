/*
2、模拟向货船上装载集装箱，每个集装箱有一定重量，
货船总重大于每个集装箱，装载若干集装箱后，如果货船超重，
那么货船认为这是一个异常，将拒绝装载集装箱，但无论是否发生异常，
货船都需要正点启航。

*/
import java.util.Scanner;
/*
class OverLodingException extends Exception{//自建异常类
	public void output{
		System.out.println("超载了，拒绝装载！");
	}
}
*/
public class MainText8_2{ 
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int curContent=0;//当前载重量
		int maxContent=100;//最大载重量
		int box;//集装箱重量
		try{
			while(true){
				System.out.printf("请输入装载箱重量：");
				box=in.nextInt();
				curContent=curContent+box; 
				if(curContent>maxContent)
				throw new OverLodingException(); 
				System.out.println("已经装载了"+curContent+"吨货物");
			}
		}catch (OverLodingException e)
		
		{
			e.output();
		}
		
		finally{
			System.out.println("启航出发！");
		}
	}
}