package com.tmall.service;

import com.tmall.model.Review;

import java.util.List;

public interface ReviewService {

    boolean insert(Review review);

    boolean delete(int id);

    Review get(int id);

    boolean update(Review review);

    List<Review> listByUid(int uid);

    List<Review> listByPid(int pid);
}
