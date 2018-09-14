package com.tmall.service.impl;

import com.tmall.mapper.CategoryMapper;
import com.tmall.model.Category;
import com.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> selectAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public boolean insert(Category category) {
        try{
            categoryMapper.insert(category);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public int total() {
        return categoryMapper.total();
    }

    @Override
    public boolean update(Category category) {
        try {
            categoryMapper.update(category);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            categoryMapper.delete(id);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }
}
