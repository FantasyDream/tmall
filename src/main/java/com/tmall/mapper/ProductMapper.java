package com.tmall.mapper;

import com.tmall.model.Product;

import java.util.List;

public interface ProductMapper {

    List<Product> selectAll();

    int insert(Product product);

    int total();

    int delete(int id);

    int update(Product product);

    Product get(int id);

    List<Product> listByCid(int cid);

    List<Product> listByKeyWord(String keyWord);
}