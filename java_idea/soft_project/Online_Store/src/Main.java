import java.util.Scanner;

import com.test.Miao;
import com.test.jdbc.UseProperitesManageConfig;
import com.test.wu;

import static java.lang.System.exit;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------------------------");
        System.out.println("-----------------欢迎使用网上书店-------------------------");
        System.out.println("1-管理人员登录");
        System.out.println("2-顾客登录");

        int choice1 = sc.nextInt();

        switch (choice1) {
            case 1:
                //用户登录
                UseProperitesManageConfig.Sql_Link(null, null, 1);
                //UseProperitesManageConfig.Sql_Link("root", "141510", 0);  //其他用户登录，标识符为0

                while(true){
                    System.out.println("1-吴献礼");
                    System.out.println("2-苗云龙");
                    System.out.println("键入其他，退出");

                    int choice1_1 = sc.nextInt();
                    switch(choice1_1) {
                        case 1: //吴献礼

                            Boolean Status = true;
                            while(Status){
                                System.out.println("你可以查看下表内容：");
                                System.out.println("1-出版社管理");
                                System.out.println("2-书籍管理");
                                System.out.println("3-运输公司管理");
                                System.out.println("4-返回上一级");

                                int choice1_1_1 = sc.nextInt();

                                switch(choice1_1_1){

                                    case 1:
                                        wu.Public_Manager();
                                        break;

                                    case 2:
                                        wu.Book_Manager();
                                        break;

                                    case 3:
                                        wu.Transportation_Manager();
                                        break;

                                    default:
                                        System.out.println("非命令选项，返回上一级");
                                        Status = false;
                                        break;
                                }
                            }break;

                        case 2: //苗云龙
                            Boolean Status1 = true;
                            while(Status1){
                                System.out.println("你可以查看下表内容：");
                                System.out.println("1-图书配送管理");
                                System.out.println("2-图书采购管理");
                                System.out.println("3-图书库存管理");
                                System.out.println("4-返回上一级");

                                int choice1_1_2 = sc.nextInt();

                                switch(choice1_1_2){

                                    case 1:
                                        Miao.Distribution_Management();
                                        break;

                                    case 2:
                                        Miao.Purchasing_Management();
                                        break;

                                    case 3:
                                        Miao.Inventory_Management();
                                        break;


                                    default:
                                        System.out.println("非命令选项，返回上一级");
                                        Status1 = false;
                                        break;
                                }
                            }break;



                        default:
                            exit(0);
                            break;

                    }

                }




        }





    }
}




