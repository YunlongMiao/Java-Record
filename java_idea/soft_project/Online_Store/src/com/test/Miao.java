package com.test;

import com.test.dao.SqlManager_Miao;
import com.test.dao.SqlManager_Wu;
import com.test.model.Inventory;
import com.test.model.Press;
import com.test.model.Purchase;
import com.test.model.ShipSheet;

import java.util.List;
import java.util.Scanner;

/**
 * @description: 实现模块：图书配送管理，图书采购管理，图书库存管理
 * @author MiaoYunLong
 * @date 2023/6/26 22:33
 * @version 1.0
 */
public class Miao {

    /**
     * @description:  图书配送管理
     * @param: null
     * @return:
     * @author MiaoYunLong
     * @date: 2023/6/26 22:35
     */
    public static void  Distribution_Management() {

        Boolean Status = true;
        Scanner sc = new Scanner(System.in);

        while(Status){
            System.out.println("**************图书配送管理*****************");
            System.out.println("1-添加配送信息");
            System.out.println("2-查询配送列表");
            System.out.println("3-配送完成记录");
            System.out.println("4-查询所有配送列表");
            System.out.println("5-返回上一级");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: //int orderNo, String  receiver, String  Tele,  String shipAddress  订单号,收件人,收件人电话,配送地址,配送状态
                    SqlManager_Miao s1 = new SqlManager_Miao();

                    System.out.println("正在添加配送信息\n订单号");
                    int orderNo = sc.nextInt();
                    System.out.println("收件人姓名");
                    String receiver = sc.next();
                    System.out.println("收件人电话");
                    String Tele = sc.next();
                    System.out.println("配送地址");
                    String shipAddress = sc.next();
                    //数据库写入
                    s1.Add_Distribution(orderNo, receiver, Tele, shipAddress);
                    System.out.println("订单号：" + orderNo + "  收件人姓名：" + receiver + "  收件人电话：" + Tele + "  配送地址：" + shipAddress);
                    System.out.println();
                    break;

                case 2:
                    SqlManager_Miao s2 = new SqlManager_Miao();

                    List<ShipSheet> list1 = s2.QueryShippingList();
                    for(ShipSheet stus1 : list1)
                        System.out.println("订单号：" + stus1.getOrderNo() + "  收件人姓名：" + stus1.getReceiver() + "  收件人电话：" + stus1.getTele() + "  配送地址：" + stus1.getShipAddress());
                    System.out.println();
                    break;

                case 3:
                    SqlManager_Miao s3 = new SqlManager_Miao();

                    System.out.println("输入已完成配送的订单号");
                    int orderNum = sc.nextInt();
                    s3.DeliveryCompleted(orderNum);
                    break;

                case 4:
                    SqlManager_Miao s4 = new SqlManager_Miao();

                    List<ShipSheet> list2 = s4.QueryAllShippingList();
                    for(ShipSheet stus2 : list2)
                        System.out.println("订单号：" + stus2.getOrderNo() + "  收件人姓名：" + stus2.getReceiver() + "  收件人电话：" + stus2.getTele() + "  配送地址：" + stus2.getShipAddress() + " 配送状态: " + stus2.getShipStatus() );
                    System.out.println();
                    break;


                default:
                    Status = false;
                    break;

            }
        }
    }


/**
 * @description:  图书采购管理
 * @param: null
 * @return:
 * @author MiaoYunLong
 * @date: 2023/6/26 22:48
 */
    public static void  Purchasing_Management(){

        Boolean Status = true;
        Scanner sc = new Scanner(System.in);


        while(Status){
            System.out.println("**************图书采购管理*****************");
            System.out.println("1-添加采购信息");
            System.out.println("2-查询采购列表");
            System.out.println("3-采购完成记录");
            System.out.println("4-返回上一级");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: //int orderNo, String  receiver, String  Tele,  String shipAddress  订单号,收件人,收件人电话,配送地址,配送状态
                    SqlManager_Miao s1 = new SqlManager_Miao();

                    System.out.println("正在添加采购信息\n书籍版号");
                    String ISBN = sc.next();
                    System.out.println("书名");
                    String BookName = sc.next();
                    System.out.println("采购数量");
                    int PurchaseNum = sc.nextInt();
                    //数据库写入
                    s1.AddPurchaseInformation(ISBN, BookName ,PurchaseNum);
                    System.out.println("书籍版号：" + ISBN + "  书名：" + BookName + "  采购数量：" + PurchaseNum);
                    System.out.println();
                    break;

                case 2:
                    SqlManager_Miao s2 = new SqlManager_Miao();

                    List<Purchase> list1 = s2.QueryPurchaseList();
                    for(Purchase stus1 : list1)
                        System.out.println("书籍版号：" + stus1.getISBN() + "  书籍名称：" + stus1.getBookName() + "  采购数量：" + stus1.getPurchaseNum());
                    System.out.println();
                    break;

                case 3:
                    SqlManager_Miao s3 = new SqlManager_Miao();

                    System.out.println("输入已完成配送的订单号");
                    ISBN = sc.next();
                    s3.PurchaseCompletionRecord(ISBN);
                    break;


                default:
                    Status = false;
                    break;

            }
        }


    }


    public static void  Inventory_Management() {

        Boolean Status = true;
        Scanner sc = new Scanner(System.in);

        while(Status){
            System.out.println("**************图书库存管理*****************");
            System.out.println("1-新增图书条目");
            System.out.println("2-图书入库");
            System.out.println("3-图书出库");
            System.out.println("4-图书条目删除");
            System.out.println("5-查询现有图书列表");
            System.out.println("6-返回上一级");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: //int orderNo, String  receiver, String  Tele,  String shipAddress  订单号,收件人,收件人电话,配送地址,配送状态
                    SqlManager_Miao s1 = new SqlManager_Miao();

                    System.out.println("新增图书条目");
                    System.out.println("图书版号");
                    String ISBN = sc.next();
                    System.out.println("书名");
                    String BookName = sc.next();

                    //数据库写入
                    s1.NewBookEntry(ISBN, BookName);
                    System.out.println("书籍版号：" + ISBN + "  书名：" + BookName);
                    System.out.println();
                    break;

                case 2:
                    SqlManager_Miao s2 = new SqlManager_Miao();

                    System.out.println("图书入库");
                    System.out.println("图书版号");
                    ISBN = sc.next();
                    System.out.println("入库数量");
                    int storeNo = sc.nextInt();

//                    List<Inventory> list1 = s2.BookNumberRevision(true, ISBN, storeNo);
                    s2.BookNumberRevision(true, ISBN, storeNo);
//                    for(Inventory stus1 : list1)
//                        System.out.println("书籍版号：" + stus1.getISBN() + "  书籍名称：" + stus1.getBookName() + "  现有数量：" + stus1.getStoreNo());
//                    System.out.println();
                    break;

                case 3:
                    SqlManager_Miao s3 = new SqlManager_Miao();

                    System.out.println("图书出库");
                    System.out.println("图书版号");
                    ISBN = sc.next();
                    System.out.println("出库数量");
                    storeNo = sc.nextInt();

                    s3.BookNumberRevision(false, ISBN, storeNo);
//                    List<Inventory> list2 = s3.BookNumberRevision(false, ISBN, storeNo);
//                    for(Inventory stus1 : list2)
//                        System.out.println("书籍版号：" + stus1.getISBN() + "  书籍名称：" + stus1.getBookName() + "  现有数量：" + stus1.getStoreNo());
//                    System.out.println();
                    break;

                case 4:
                    SqlManager_Miao s4 = new SqlManager_Miao();

                    System.out.println("输入要删除图书条目的版号");
                    ISBN = sc.next();
                    s4.DeletionOfBookEntry(ISBN);
                    break;


                case 5:
                    SqlManager_Miao s5 = new SqlManager_Miao();

                    List<Inventory> list3 = s5.QueryListOfAllBooks();
                    for(Inventory stus2 : list3)
                        System.out.println("版号：" + stus2.getISBN() + "  书名：" + stus2.getBookName() + "  库存数量：" + stus2.getStoreNo() + "  上次修改时间：" + stus2.getStoreDate() );
                    break;

                default:
                    Status = false;
                    break;
            }

        }

    }



}
