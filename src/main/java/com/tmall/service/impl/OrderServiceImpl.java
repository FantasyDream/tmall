package com.tmall.service.impl;

import com.tmall.mapper.OrderMapper;
import com.tmall.model.Order;
import com.tmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> listByUid(int uid) {
        return orderMapper.listByUid(uid);
    }

    @Override
    public boolean insert(Order order) {
        try {
            orderMapper.insert(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public int total() {
        return orderMapper.total();
    }

    @Override
    public boolean delete(int id) {
        try {
            orderMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Order order) {
        try {
            orderMapper.update(order);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Order get(int id) {
        return orderMapper.get(id);
    }

    @Override
    public List<Order> list() {
        return orderMapper.list();
    }
}
