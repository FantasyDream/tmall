package com.tmall.mapper;

import com.tmall.model.Order;

import java.util.List;

public interface OrderMapper {

    List<Order> listByUid(int uid);

    int insert(Order order);

    int total();

    int delete(int id);

    int update(Order order);

    Order get(int id);

    List<Order> list();


}
