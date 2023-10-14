package com.test.model;

public class Books {
    private int bookID;
    private String bookTitle;
    private double price;
    private String author;


    public Books() {
    }

    /**
     * 获取
     * @return bookID
     */
    public int getBookID() {
        return bookID;
    }

    /**
     * 设置
     * @param bookID
     */
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    /**
     * 获取
     * @return bookTitle
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * 设置
     * @param bookTitle
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
