package com.test;

import com.test.dao.SqlManager_Wu;
import com.test.model.Books;
import com.test.model.Company;
import com.test.model.Press;

import java.util.List;
import java.util.Scanner;

/**
 * @description: 吴献礼负责部分，功能模块封装
 * @author 吴献礼
 * @date 2023/6/26 22:09
 * @version 1.0
 */
public class wu {


    /**
     * @description: 出版社管理
     * @param: null
     * @return: null
     * @author  吴献礼
     * @date: 2023/6/26 22:05
     */
    public static void Public_Manager(){

        Scanner sc = new Scanner(System.in);

        System.out.println("1-查看出版社信息");
        System.out.println("2.增加出版社信息");
        System.out.println("3.删除出版社信息");
        System.out.println("4.修改出版社信息");
        System.out.print("请输入您的选择：");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                SqlManager_Wu s1 = new SqlManager_Wu();
                List<Press> list1 = s1.getAll_press();
                for (Press stus1 : list1)
                    System.out.println("出版社名：" + stus1.getPressTitle() + "  出版社地址：" + stus1.getAddress() + "  出版社负责人：" + stus1.getContactPerson() + "  联系电话：" + stus1.getTelephone() + "  邮箱地址：" + stus1.getEmail());
                System.out.println();
                break;
            case 2:
                SqlManager_Wu s5 = new SqlManager_Wu();
                System.out.println("输入出版社编号：");
                int pressID = sc.nextInt();
                System.out.println("输入出版社名称：");
                String pressTitle = sc.next();
                System.out.println("输入出版社地址：");
                String address = sc.next();
                System.out.println("输入出版社负责人：");
                String contactPerson = sc.next();
                System.out.println("输入出版社联系方式：");
                String telephone = sc.next();
                System.out.println("输入出版社邮箱地址：");
                String email = sc.next();

                s5.add_press(pressID, pressTitle, address, contactPerson, telephone, email);
                System.out.println();
                break;
            case 3:
                SqlManager_Wu s9 = new SqlManager_Wu();
                System.out.println("输入删除的出版社名称：");
                String pressTitle1 = sc.next();
                s9.delete_press(pressTitle1);
                break;
            case 4:
                SqlManager_Wu s11 = new SqlManager_Wu();
                Press press1 = new Press();

                System.out.println("输入出版社名称：");
                press1.setPressTitle(sc.next());
                System.out.println("输入修改后的地址：");
                press1.setAddress(sc.next());
                System.out.println("输入修改后的负责人：");
                press1.setContactPerson(sc.next());
                System.out.println("输入修改后的联系方式：");
                press1.setTelephone(sc.next());
                System.out.println("输入修改后的邮箱地址：");
                press1.setEmail(sc.next());

                s11.update_press(press1);
                System.out.println();
                break;
            default:
                break;
        }

    }


/**
 * @description:  书籍管理
 * @param: null
 * @return:
 * @author  吴献礼
 * @date: 2023/6/26 22:13
 */
    public static void Book_Manager(){

        Scanner sc = new Scanner(System.in);

        System.out.println("1-查看书籍信息");
        System.out.println("2.增加书籍信息");
        System.out.println("3.删除书籍信息");
        System.out.println("4.修改书籍信息");
        System.out.print("请输入您的选择：");
        int choice2 = sc.nextInt();
        switch (choice2) {
            case 1:
                SqlManager_Wu s2 = new SqlManager_Wu();
                List<Books> list2 = s2.getAll_books();
                for (Books stus2 : list2)
                    System.out.println("编号：" + stus2.getBookID() + "书名：" + stus2.getBookTitle() + "价格：" + stus2.getPrice() + "作者：" + stus2.getAuthor());
                System.out.println();
                break;
            case 2:
                SqlManager_Wu s3 = new SqlManager_Wu();
                System.out.println("输入书籍编号：");
                int bookID = sc.nextInt();
                System.out.println("输入书籍名称：");
                String bookTitle = sc.next();
                System.out.println("输入价格：");
                double price = sc.nextDouble();
                System.out.println("输入作者：");
                String author = sc.next();
                s3.add_books(bookID, bookTitle, price, author);
                System.out.println();
                break;
            case 3:
                SqlManager_Wu s8 = new SqlManager_Wu();
                System.out.println("输入删除的书籍名称：");
                String bookTitle1 = sc.next();
                s8.delete_books(bookTitle1);
                break;
            case 4:
                SqlManager_Wu s10 = new SqlManager_Wu();
                Books books1 = new Books();

                System.out.println("输入书名：");
                books1.setBookTitle(sc.next());
                System.out.println("输入修改后的价格：");
                books1.setPrice(sc.nextDouble());

                s10.update_books(books1);
                System.out.println();
                break;
        }

    }


/**
 * @description: 运输公司管理
 * @param: null
 * @return:
 * @author   吴献礼
 * @date: 2023/6/26 22:15
 */
    public static void Transportation_Manager(){

        Scanner sc = new Scanner(System.in);

        System.out.println("1-查看配送公司信息");
        System.out.println("2.增加配送公司信息");
        System.out.println("3.删除配送公司信息");
        System.out.println("4.修改配送公司信息");
        System.out.print("请输入您的选择：");
        int choice2 = sc.nextInt();
        switch (choice2) {
            case 1:
                SqlManager_Wu s4 = new SqlManager_Wu();
                List<Company> list4 = s4.getAll_company();
                for (Company stus4 : list4)
                    System.out.println("编号：" + stus4.getCompanyID() + "  运输公司名：" + stus4.getCompanyTitle() + "  地址：" + stus4.getAddress() + "  运输公司负责人：" + stus4.getContactPerson() + "  联系方式：" + stus4.getTelephone() + "  邮箱地址：" + stus4.getEmail());
                System.out.println();
                break;
            case 2:
                SqlManager_Wu s6 = new SqlManager_Wu();
                System.out.println("输入配送公司编号：");
                int companyID = sc.nextInt();
                System.out.println("输入配送公司名称：");
                String companyTitle = sc.next();
                System.out.println("输入配送公司地址：");
                String companyAddress = sc.next();
                System.out.println("输入配送公司负责人：");
                String companyContactPerson = sc.next();
                System.out.println("输入配送公司联系方式：");
                String companyTelephone = sc.next();
                System.out.println("输入配送公司邮箱地址：");
                String companyEmail = sc.next();
                s6.add_company(companyID, companyTitle, companyAddress, companyContactPerson, companyTelephone, companyEmail);
                System.out.println();
                break;
            case 3:
                SqlManager_Wu s7 = new SqlManager_Wu();
                System.out.println("输入删除的公司名称：");
                String companyTitle1 = sc.next();
                s7.delete_company(companyTitle1);
            case 4:
                SqlManager_Wu s12 = new SqlManager_Wu();
                Company company1 = new Company();

                System.out.println("输入运输公司名称：");
                company1.setCompanyTitle(sc.next());
                System.out.println("输入修改后的地址：");
                company1.setAddress(sc.next());
                System.out.println("输入修改后的负责人：");
                company1.setContactPerson(sc.next());
                System.out.println("输入修改后的联系方式：");
                company1.setTelephone(sc.next());
                System.out.println("输入修改后的邮箱地址：");
                company1.setEmail(sc.next());

                s12.update_company(company1);
                System.out.println();
                break;
        }

    }


}
