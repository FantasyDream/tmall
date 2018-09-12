package com.tmall.service.impl;

import com.tmall.mapper.ProductImageMapper;
import com.tmall.model.ProductImage;
import com.tmall.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImageServiceImpl implements ProductImageService {

    @Autowired
    ProductImageMapper productImageMapper;

    @Override
    public boolean insert(ProductImage productImage) {
        try {
            productImageMapper.insert(productImage);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            productImageMapper.delete(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public ProductImage get(int id) {
        return productImageMapper.get(id);
    }

    @Override
    public boolean update(ProductImage productImage) {
        try {
            productImageMapper.update(productImage);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<ProductImage> listByPid(int pid) {
        return productImageMapper.listByPid(pid);
    }

    @Override
    public List<ProductImage> list() {
        return productImageMapper.list();
    }

    @Override
    public boolean deleteByPid(int pid) {
        try {
            productImageMapper.deleteByPid(pid);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<ProductImage> listByPidAndTypeDetail(int pid) {
        return productImageMapper.listByPidAndTypeDetail(pid);
    }

    @Override
    public List<ProductImage> listByPidAndTypeSingle(int pid) {
        return productImageMapper.listByPidAndTypeSingle(pid);
    }
}
