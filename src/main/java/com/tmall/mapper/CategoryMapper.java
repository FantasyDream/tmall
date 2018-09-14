package com.tmall.mapper;

import com.tmall.model.Category;

import java.util.List;

public interface CategoryMapper {

    /**
     * 查找所有Category
     * @return category的list数组
     */
    List<Category> selectAll();


    /**
     * @param category
     * 要出入数据库的 category 对象
     *
     * @return int
     * 收到影响的行数
     */
    int insert(Category category);

    int total();

    int delete(int id);

    int update(Category category);

    Category get(int id);
}