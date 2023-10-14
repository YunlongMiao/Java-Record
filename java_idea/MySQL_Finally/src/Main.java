import java.sql.Connection;
import java.util.Scanner;

import com.test.jdbc.DBConnection;
import com.test.jdbc.UseProperitesManageConfig;
import com.test.dao.StudentDAO;
import com.test.model.*;
//import com.test.model.Menus;
//import com.test.model.Table;
//import com.test.model.vip;
//import com.test.model.Employee;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------欢迎使用餐馆订餐系统-------------------------");
        System.out.println("顾客点餐请输入1");
        System.out.println("管理人员请输入2");
        System.out.println("----------------------------------------------------------");


        System.out.print("请输入您的选择：");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("欢迎进入顾客点餐界面");
            UseProperitesManageConfig  Con_Sql = new UseProperitesManageConfig();
//            Con_Sql.Sql_Link(null,null,1);
            Con_Sql.Sql_Link(null,null,1);
//            i = Con_Sql.Sql_Link("root","141510",1);



            while(true){
                System.out.println("你可以查看下表内容：");
                System.out.println("1-菜单");
                System.out.println("2-所有餐桌状态");
                System.out.println("3-填写订单");
                System.out.println("4-退出");
                System.out.print("请输入您的选择：");
                int choice1 = sc.nextInt();
                switch (choice1) {
                    case 1:
                        StudentDAO s1 = new StudentDAO();
                        List<Menus> list1 = s1.getAll_menus();
                        for(Menus stus1 : list1)
                            System.out.println(stus1.getId()+"  "+stus1.getName()+" "+ stus1.getPrice());
                        System.out.println();
                        break;
                    case 2:
                        StudentDAO s2 = new StudentDAO();
                        List<Table> list2 = s2.getAll_table();
                        for(Table stus2 : list2)
                            System.out.println(stus2.getNumber()+" "+ stus2.getSta());
                        System.out.println();
                        break;
                    case 3:
                        StudentDAO s3 = new StudentDAO();
                        System.out.println("输入顾客姓名");
                        String stu1 = sc.next();
                        System.out.println("输入联系方式");
                        int stu2 = sc.nextInt();
                        System.out.println("输入餐桌号");
                        int stu3 = sc.nextInt();

                        s3.add_Ord(stu1,stu2,stu3);
                        System.out.println();
                        break;

                    default:
                        System.out.println("                    已退出，感谢您的使用                               ");
                        System.exit(0);
                        break;
                }
            }
        }







        else if(choice == 2){
            String name = null;
            String pass = null;
            System.out.println("欢迎进入管理界面，请输入用户名和密码");
            System.out.print("请输入您的用户名：");
            name = sc.next();
            System.out.print("请输入您的密码：");
            pass = sc.next();
            UseProperitesManageConfig  Con_Sql1 = new UseProperitesManageConfig();
            Con_Sql1.Sql_Link(name,pass,0);

            System.out.println("验证成功，你可进行以下操作");


            while(true){
                System.out.println("1-查看重点客户");
                System.out.println("2-更新餐桌状态");
                System.out.println("3-查看所有员工信息");
                System.out.println("4-查看员工个人工资信息");
                System.out.println("5-退出");
                System.out.print("请输入您的选择：");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        StudentDAO vip = new StudentDAO();
                        //查询一个列表回来
                        List<vip> list1 = vip.getAll_vip();
                        for(vip stus1 : list1)
                            System.out.println(stus1.getName()+" "+stus1.getPhone());
                        System.out.println();
                        break;
                    case 2:
                        StudentDAO s2 = new StudentDAO();
                        Table Tab = new Table();

                        System.out.println("输入餐桌号");
                        Tab.setNumber(sc.nextInt());
                        System.out.println("输入餐桌状态");
                        Tab.setSta(sc.nextInt());

                        s2.update_table(Tab);
                        System.out.println();
                        break;
                    case 3:
                        StudentDAO em = new StudentDAO();
                        //查询一个列表回来
                        List<Employee> list3 = em.getAll_Emp();
                        for(Employee stus3 : list3)
                            System.out.println(stus3.getId()+" "+stus3.getName()+" "+stus3.getSex()+" "+stus3.getAge()+" "+stus3.getSalary());
                        System.out.println();
                        break;

                    case 4:
                        StudentDAO em_salary = new StudentDAO();
                        System.out.println("输入需要查询工资的员工姓名");
                        String emname = sc.next();
                        Employee stu2 = em_salary.em_salary(emname);
                        System.out.println(stu2.getName()+" "+stu2.getSalary());
                        break;

                    default:
                        System.out.println("                    已退出，感谢您的使用                               ");
                        System.exit(0);

                }
            }

        }
    }
}


