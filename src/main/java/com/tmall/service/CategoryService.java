package com.tmall.service;

import com.tmall.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> selectAll();

    boolean insert(Category category);

    int total();

    boolean update(Category category);

    boolean delete(int id);

    Category get(int id);
}
