package com.tmall.service;

import com.tmall.model.ProductImage;

import java.util.List;

public interface ProductImageService {
    boolean insert(ProductImage productImage);

    boolean delete(int id);

    ProductImage get(int id);

    boolean update(ProductImage productImage);

    List<ProductImage> listByPid(int pid);

    List<ProductImage> list();

    boolean deleteByPid(int pid);

    List<ProductImage> listByPidAndTypeDetail(int pid);

    List<ProductImage> listByPidAndTypeSingle(int pid);

}
