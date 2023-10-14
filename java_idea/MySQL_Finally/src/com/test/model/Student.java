package com.test.model;

import java.sql.Date;
public class Student {
    //属性
    private int stuid;
    private String name;
    private int age;
    private String gender;
    private double height;
    private int classID;
    private Date createtime;
    //访问方法的生成，自己去一键生成
    public int getStuid() {
        return stuid;
    }
    public void setStuid(int stuid) {
        this.stuid = stuid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getClassID() {
        return classID;
    }
    public void setClassID(int classID) {
        this.classID = classID;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
