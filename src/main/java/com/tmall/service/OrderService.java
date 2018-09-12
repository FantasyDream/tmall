package com.tmall.service;

import com.tmall.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> listByUid(int uid);

    boolean insert(Order order);

    int total();

    boolean delete(int id);

    boolean update(Order order);

    Order get(int id);

    List<Order> list();
}
