/*
2��ģ���������װ�ؼ�װ�䣬ÿ����װ����һ��������
�������ش���ÿ����װ�䣬װ�����ɼ�װ�������������أ�
��ô������Ϊ����һ���쳣�����ܾ�װ�ؼ�װ�䣬�������Ƿ����쳣��
��������Ҫ����������

*/
import java.util.Scanner;
/*
class OverLodingException extends Exception{//�Խ��쳣��
	public void output{
		System.out.println("�����ˣ��ܾ�װ�أ�");
	}
}
*/
public class MainText8_2{ 
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int curContent=0;//��ǰ������
		int maxContent=100;//���������
		int box;//��װ������
		try{
			while(true){
				System.out.printf("������װ����������");
				box=in.nextInt();
				curContent=curContent+box; 
				if(curContent>maxContent)
				throw new OverLodingException(); 
				System.out.println("�Ѿ�װ����"+curContent+"�ֻ���");
			}
		}catch (OverLodingException e)
		
		{
			e.output();
		}
		
		finally{
			System.out.println("����������");
		}
	}
}