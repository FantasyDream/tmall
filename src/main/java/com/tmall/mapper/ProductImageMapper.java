package com.tmall.mapper;

import com.tmall.model.ProductImage;

import java.util.List;

public interface ProductImageMapper {

    int insert(ProductImage productImage);

    int delete(int id);

    ProductImage get(int id);

    int update(ProductImage productImage);

    List<ProductImage> listByPid(int pid);

    List<ProductImage> list();

    int deleteByPid(int pid);

    List<ProductImage> listByPidAndTypeDetail(int pid);

    List<ProductImage> listByPidAndTypeSingle(int pid);
}
