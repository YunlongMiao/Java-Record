import java.io.*;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream w1 = new  FileOutputStream("E:\\code\\java\\Experiment\\9//f1.txt");
         FileOutputStream w2 = new  FileOutputStream("E:\\code\\java\\Experiment\\9//f2.txt",true);
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<20 ; i++){
                int m = sc.nextInt();
                String s1 =String.valueOf(m)+"   ";    //将int型数据转换成String型
                byte[] c = s1.getBytes(); 
               if(i<10){
                    w1.write(c);       //写10个数到f1.txt中
                    w1.flush();
               }else{
                    w2.write(c);   //写10个数到f2.txt中
                    w2.flush();
            }
        }
         w1.close();
         FileInputStream r1 = new  FileInputStream("E:\\code\\java\\Experiment\\9//f1.txt");
         int len = -1;
         byte[] d = new byte[1024];
         while((len = r1.read(d))!=-1){
              w2.write(d);   //将f1.txt中的10个数读出来，然后写入f2.txt中
        }
         r1.close();
         w2.close();
    }
}

//"E:\code\java\Experiment\9"
