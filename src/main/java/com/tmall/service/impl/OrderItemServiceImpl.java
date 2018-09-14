package com.tmall.service.impl;

import com.tmall.mapper.OrderItemMapper;
import com.tmall.model.OrderItem;
import com.tmall.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> listByPid(int pid) {
        return  orderItemMapper.listByPid(pid);
    }

    @Override
    public List<OrderItem> listByOid(int oid) {
        return orderItemMapper.listByOid(oid);
    }

    @Override
    public boolean insert(OrderItem orderItem) {
        try {
            orderItemMapper.insert(orderItem);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public int total() {
        return orderItemMapper.total();
    }

    @Override
    @Transactional(rollbackForClassName = "Exception",propagation = Propagation.REQUIRED)
    public boolean delete(int id) {
        try {
            orderItemMapper.delete(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(OrderItem orderItem) {
        try {
            orderItemMapper.update(orderItem);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public OrderItem get(int id) {
        return orderItemMapper.get(id);
    }

    @Override
    public List<OrderItem> list() {
        return orderItemMapper.list();
    }

    @Override
    public boolean deleteByOid(int oid) {
        try {
            orderItemMapper.deleteByOid(oid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
