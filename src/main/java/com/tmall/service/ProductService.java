package com.tmall.service;

import com.tmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> selectAll();

    boolean insert(Product product);

    int total();

    boolean delete(int id);

    boolean update(Product product);

    Product get(int id);

    List<Product> listByCid(int cid);
}
