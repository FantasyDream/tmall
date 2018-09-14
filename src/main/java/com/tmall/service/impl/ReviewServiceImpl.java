package com.tmall.service.impl;

import com.tmall.mapper.ReviewMapper;
import com.tmall.model.Review;
import com.tmall.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public boolean insert(Review review) {
        try {
            reviewMapper.insert(review);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            reviewMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Review get(int id) {
        return reviewMapper.get(id);
    }

    @Override
    public boolean update(Review review) {
        try {
            reviewMapper.update(review);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Review> listByUid(int uid) {
        return reviewMapper.listByUid(uid);
    }

    @Override
    public List<Review> listByPid(int pid) {
        return reviewMapper.listByPid(pid);
    }
}
