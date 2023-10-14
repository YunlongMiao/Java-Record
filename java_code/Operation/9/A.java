import java.util.Scanner;
import java.io.*;
public class A {
	public static void main(String[] args) {
		double radius;
		Scanner r = new Scanner(System.in);
		radius = r.nextDouble();
		Circle c = new Circle(radius); // 创建圆类对象
		String fileName = "E:\\code\\java\\Operation\\9\\fx1.txt";
		FileOutputStream out;  //创建文件字节输出流对象out
		double b = c.Area();   //圆的面积
		String b1 = String.valueOf(b) ;  //double类型转换为字符串
		byte[] b2 = b1.getBytes();   //String类型转换为字节数组
		double d = c.length();  //圆的周长
		String d1 = String.valueOf(d) ;
		byte[] d2 = d1.getBytes();
		try {
			out = new FileOutputStream(fileName,true); //字节输出流对象out与文件建立关联
			//true指定在文件末尾写入内容，不刷新文件
			out.write(b2);    //写入面积到文件中
			out.write(d2);    //写入周长到文件中
			out.flush();
			out.close();
		} catch (Exception e) {
				e.getMessage();
			}
	}
}
//"E:\code\java\Operation\9"
