import java.util.Scanner;
import java.io.*;
public class A {
	public static void main(String[] args) {
		double radius;
		Scanner r = new Scanner(System.in);
		radius = r.nextDouble();
		Circle c = new Circle(radius); // ����Բ�����
		String fileName = "E:\\code\\java\\Operation\\9\\fx1.txt";
		FileOutputStream out;  //�����ļ��ֽ����������out
		double b = c.Area();   //Բ�����
		String b1 = String.valueOf(b) ;  //double����ת��Ϊ�ַ���
		byte[] b2 = b1.getBytes();   //String����ת��Ϊ�ֽ�����
		double d = c.length();  //Բ���ܳ�
		String d1 = String.valueOf(d) ;
		byte[] d2 = d1.getBytes();
		try {
			out = new FileOutputStream(fileName,true); //�ֽ����������out���ļ���������
			//trueָ�����ļ�ĩβд�����ݣ���ˢ���ļ�
			out.write(b2);    //д��������ļ���
			out.write(d2);    //д���ܳ����ļ���
			out.flush();
			out.close();
		} catch (Exception e) {
				e.getMessage();
			}
	}
}
//"E:\code\java\Operation\9"
