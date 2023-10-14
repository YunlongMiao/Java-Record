package com.test.model;

public class Press {
    private int pressID;
    private String pressTitle;
    private String address;
    private String contactPerson;
    private String telephone;
    private String email;


    public Press() {
    }


    /**
     * 获取
     * @return pressID
     */
    public int getPressID() {
        return pressID;
    }

    /**
     * 设置
     * @param pressID
     */
    public void setPressID(int pressID) {
        this.pressID = pressID;
    }

    /**
     * 获取
     * @return pressTitle
     */
    public String getPressTitle() {
        return pressTitle;
    }

    /**
     * 设置
     * @param pressTitle
     */
    public void setPressTitle(String pressTitle) {
        this.pressTitle = pressTitle;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return contactPerson
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * 设置
     * @param contactPerson
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
