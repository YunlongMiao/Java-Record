package com.test.model;

/**
 * @description: 配送单表
 * @author MiaoYunLong
 * @date 2023/6/26 23:31
 * @version 1.0
 */
public class ShipSheet {

    int orderNo = 0;                // 订单号
    String  receiver = null;         // 收件人
    String  Tele = null;             //收件人电话
    String  shipAddress = null;      // 配送地址
    Boolean ShipStatus = null;       // 配送状态


    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTele() {
        return Tele;
    }

    public void setTele(String tele) {
        Tele = tele;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public Boolean getShipStatus() {
        return ShipStatus;
    }

    public void setShipStatus(Boolean shipStatus) {
        ShipStatus = shipStatus;
    }
}
