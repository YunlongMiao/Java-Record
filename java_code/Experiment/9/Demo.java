import java.io.*;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream w1 = new  FileOutputStream("E:\\code\\java\\Experiment\\9//f1.txt");
         FileOutputStream w2 = new  FileOutputStream("E:\\code\\java\\Experiment\\9//f2.txt",true);
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<20 ; i++){
                int m = sc.nextInt();
                String s1 =String.valueOf(m)+"   ";    //��int������ת����String��
                byte[] c = s1.getBytes(); 
               if(i<10){
                    w1.write(c);       //д10������f1.txt��
                    w1.flush();
               }else{
                    w2.write(c);   //д10������f2.txt��
                    w2.flush();
            }
        }
         w1.close();
         FileInputStream r1 = new  FileInputStream("E:\\code\\java\\Experiment\\9//f1.txt");
         int len = -1;
         byte[] d = new byte[1024];
         while((len = r1.read(d))!=-1){
              w2.write(d);   //��f1.txt�е�10������������Ȼ��д��f2.txt��
        }
         r1.close();
         w2.close();
    }
}

//"E:\code\java\Experiment\9"
