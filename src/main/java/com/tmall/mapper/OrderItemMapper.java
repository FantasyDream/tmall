package com.tmall.mapper;

import com.tmall.model.OrderItem;

import java.util.List;

public interface OrderItemMapper {

    List<OrderItem> listByPid(int pid);

    List<OrderItem> listByOid(int oid);

    int insert(OrderItem orderItem);

    int total();

    int delete(int id);

    int update(OrderItem orderItem);

    OrderItem get(int id);

    List<OrderItem> list();

    boolean deleteByOid(int oid);
}
