package com.tmall.model;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

public class Product {

    private int id;
    private String name;
    private String subTitle;
    private double originalPrice;
    private double promotePrice;
    private int stock;
    private int cid;
    private java.sql.Timestamp createDate;
    private Category category;
    private List<ProductImage> singleProductImages;
    private List<ProductImage> detailProductImages;

    public List<ProductImage> getDetailProductImages() {
        return detailProductImages;
    }

    public void setDetailProductImages(List<ProductImage> detailProductImages) {
        this.detailProductImages = detailProductImages;
    }

    public List<ProductImage> getSingleProductImages() {
        return singleProductImages;
    }

    public void setSingleProductImages(List<ProductImage> singleProductImages) {
        this.singleProductImages = singleProductImages;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }


    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }


    public double getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(double promotePrice) {
        this.promotePrice = promotePrice;
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }


    public String getCreateDate() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(createDate);
    }

    public void setCreateDate(String createDate) {
        this.createDate = Timestamp.valueOf(createDate);
    }

}
