package com.test.model;

public class Company {
    private int companyID;
    private String companyTitle;
    private String address;
    private String contactPerson;
    private String telephone;
    private String email;

    public Company() {
    }

    /**
     * 获取
     * @return companyID
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * 设置
     * @param companyID
     */
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    /**
     * 获取
     * @return companyTitle
     */
    public String getCompanyTitle() {
        return companyTitle;
    }

    /**
     * 设置
     * @param companyTitle
     */
    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
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
