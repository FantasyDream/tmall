package com.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.model.Order;
import com.tmall.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class OrderController {
    
    @Autowired
    OrderService orderService;

    @RequestMapping("admin_order_list")
    public String list(Model model, @RequestParam(value = "start",defaultValue = "0") int start, @RequestParam(value = "size",defaultValue = "5")int size){
        PageHelper.startPage(start,size);
        List<Order> orders = orderService.list();
        PageInfo<Order> page = new PageInfo<>(orders);
        model.addAttribute("page",page);
        return "admin/listOrder";
    }

    @RequestMapping("admin_order_delivery")
    public String delivery(int id){
        return "";
    }


}