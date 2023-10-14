package com.test.model;

/**
 * @description: 图书采购表
 * @author MiaoYunLong
 * @date 2023/6/26 23:22
 * @version 1.0
 */
public class Purchase {

    String ISBN = null;
    String BookName = null;
    int PurchaseNum = 0;    //采购数量
    Boolean PurchaseStatus = null;
    String storeDate = null;




    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPurchaseNum() {
        return PurchaseNum;
    }

    public void setPurchaseNum(int purchaseNum) {
        PurchaseNum = purchaseNum;
    }

    public Boolean getPurchaseStatus() {
        return PurchaseStatus;
    }

    public void setPurchaseStatus(Boolean purchaseStatus) {
        PurchaseStatus = purchaseStatus;
    }

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }
}
