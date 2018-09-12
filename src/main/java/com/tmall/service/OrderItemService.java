package com.tmall.service;

import com.tmall.model.OrderItem;

import java.util.List;

public interface OrderItemService {

    List<OrderItem> listByPid(int pid);

    List<OrderItem> listByOid(int oid);

    boolean insert(OrderItem orderItem);

    int total();

    boolean delete(int id);

    boolean update(OrderItem orderItem);

    OrderItem get(int id);

    List<OrderItem> list();

    boolean deleteByOid(int oid);

}
