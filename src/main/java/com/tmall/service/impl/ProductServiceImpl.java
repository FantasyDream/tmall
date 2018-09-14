package com.tmall.service.impl;

import com.tmall.mapper.ProductMapper;
import com.tmall.model.Product;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> selectAll() {
        return productMapper.selectAll();
    }

    @Override
    public boolean insert(Product product) {
        try {
            productMapper.insert(product);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public int total() {
        return productMapper.total();
    }

    @Override
    public boolean delete(int id) {
        try {
            productMapper.delete(id);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Product product) {
        try{
            productMapper.update(product);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Product get(int id) {
        return productMapper.get(id);
    }

    @Override
    public List<Product> listByCid(int cid) {
        return productMapper.listByCid(cid);
    }
}
