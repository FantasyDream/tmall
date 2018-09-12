package com.tmall.mapper;

import com.tmall.model.Category;

import java.util.List;

public interface CategoryMapper {

    /**
     * 查找所有Category
     * @return category的list数组
     */
    List<Category> selectAll();

    int insert(Category category);

    int total();

    int delete(int id);

    int update(Category category);

    Category get(int id);
}