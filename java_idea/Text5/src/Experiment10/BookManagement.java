package Experiment10;

import TextDesign.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) throws IOException {
        String fileName = "Student.txt";

        while(true) {
            System.out.println("----------------欢迎来到图书借阅管理系统------------------------");
            System.out.println("------              1. 借阅                      -----");
            System.out.println("------              2. 管理员设置                          -----");
            System.out.println("------              3. 查看借阅信息                          -----");
            System.out.println("------              4. 归还图书                          -----");
            System.out.println("------              5. 退出                              -----");
            System.out.println("------              ps:输入其他数字自动退出                    -----");
            System.out.println("--------------------------------------------------------------");
            System.out.print("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    //查看所有学生
                    BookLand();
                    System.out.println();
                    break;
                case "2":
                    //添加学生
                    Set(fileName);
                    System.out.println();
                    break;
                case "3":
                    AllLook(fileName);
                    System.out.println();
                    break;
                case "4":
                    Return(fileName);
                    System.out.println();
                    break;
                case "5":

                default:

                    System.out.println("                    已退出，感谢您的使用                               ");
                    System.exit(0);
                    break;
            }
        }
    }


    //IO输入流：读文件
    public static void readData(String fileName, ArrayList<Book> array) throws IOException {
        //创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        while((line = br.readLine()) != null){
            String[] datas = line.split(",");
            Book s = new Book(datas[0],datas[1],datas[2],datas[3]);
            array.add(s);
        }
        br.close();
    }

    //IO输出流：写文件
    public static void writeData(String fileName, ArrayList<Book> array) throws IOException {
        //创建输入缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));//文件写入

        for(int x = 0; x < array.size(); x++)
        {
            Book s = array.get(x);
            StringBuilder sb = new StringBuilder();//对字符串进行修改
            sb.append(s.getId());
            sb.append(',');
            sb.append(s.getName());
            sb.append(',');
            sb.append(s.getAge());
            sb.append(',');
            sb.append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }



    public static void BookLand(){
        System.out.print("请选择你所借阅的类型：");
        System.out.print("1.图书");
        System.out.print("2.期刊");
        System.out.print("3.返回");
        System.out.print("请输入1或2或3进行选择");
        Scanner in = new Scanner(System.in);
        String choose ="";
        choose = in.nextLine();
        switch(choose) {
            case 1:
            case 2:
            case 3:
        }

    }

    public static void Book(String fileName) throws IOException {
        ArrayList<Book> array = new ArrayList<Book>();
        readData(fileName,array);
        Scanner in = new Scanner(System.in);
        String id ="";

        while(true) {
            System.out.print("输入需要借阅的图书代号：");
            id = in.nextLine();
            int x;
            boolean flag = false;
            for(x = 0; x < array.size(); x++ )
            {
                Book s = array.get(x);
                if(id.equals(s.getName())) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("该图书已借出，请重新输入");
            }
            else{
                break;
            }

        }
        System.out.print("输入姓名：");
        String name = in.nextLine();
        System.out.print("输入年龄：");
        String age = in.nextLine();
        System.out.print("输入地址：");
        String address = in.nextLine();

        //创建学生对象
        Student s = new Student(id,name,age,address);
        array.add(s);
        writeData(fileName, array);         //信息写入文档
        System.out.println("添加学生成功");
    }

}
