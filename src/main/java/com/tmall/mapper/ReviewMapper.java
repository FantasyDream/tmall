package com.tmall.mapper;

import com.tmall.model.Review;

import java.util.List;

public interface ReviewMapper {

    int insert(Review review);

    int delete(int id);

    Review get(int id);

    int update(Review review);

    List<Review> listByUid(int uid);

    List<Review> listByPid(int pid);

}
