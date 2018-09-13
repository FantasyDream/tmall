package com.tmall.model;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

public class Order {

    private int id;
    private String orderCode;
    private String address;
    private String post;
    private String receiver;
    private String mobile;
    private String userMessage;
    private java.sql.Timestamp createDate;
    private java.sql.Timestamp payDate;
    private java.sql.Timestamp deliveryDate;
    private java.sql.Timestamp confirmDate;
    private int uid;
    private User user;
    private String status;
    private List<OrderItem> orderItems;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItemList) {
        this.orderItems = orderItemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }


    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }


    public String getCreateDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createDate);
    }

    public void setCreateDate(String createDate) {
        this.createDate = Timestamp.valueOf(createDate);
    }


    public String getPayDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(payDate);
    }

    public void setPayDate(String payDate) {
        this.payDate = Timestamp.valueOf(payDate);
    }


    public String getDeliveryDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(deliveryDate);
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = Timestamp.valueOf(deliveryDate);
    }


    public String getConfirmDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(confirmDate);
    }

    public void setConfirmDate(String confirmDate) {
        this.confirmDate = Timestamp.valueOf(confirmDate);
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
