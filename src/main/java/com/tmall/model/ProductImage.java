package com.tmall.model;


public class ProductImage {

  private int id;
  private int pid;
  private String type;
  private Product product;

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
