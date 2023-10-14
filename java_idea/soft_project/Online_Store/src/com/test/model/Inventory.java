package com.test.model;
/**
 * @description: 库存表
 * @author MiaoYunLong
 * @date 2023/6/26 23:01
 * @version 1.0
 */
public class Inventory {
    String ISBN = null;
    String BookName = null;
    int storeNo = 0;
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

    public int getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(int storeNo) {
        this.storeNo = storeNo;
    }

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }
}
