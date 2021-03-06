package com.tmall.controller;

import com.tmall.model.Category;
import com.tmall.model.Product;
import com.tmall.model.User;
import com.tmall.service.CategoryService;
import com.tmall.service.OrderService;
import com.tmall.service.UserService;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class ForeController {

    @Autowired
    UserService userService;

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    OrderService orderService;



    @RequestMapping("/forelogin")
    public String login(User user, HttpSession session){
        User user1 = userService.selectByUsername(user.getName());
        if (user1.getPassword().equals(user.getPassword())){
            session.setAttribute("user",user1);
            return "fore/home";
        } else {
            return "error";
        }
    }

    @RequestMapping("/foreregister")
    public String register(User user){
        if(userService.insert(user)){
            return "redirect: loginPage";
        } else {
            return "error";
        }
    }

    @RequestMapping("/forelogout")
    public String foreLogout(){
        return "fore/home";
    }

    @RequestMapping("/forebought")
    public String foreBought(){
        return "fore/bought";
    }

    @RequestMapping("/forecart")
    public String foreCart(){
        return "fore/cart";
    }

    @RequestMapping("/foresearch")
    public String foreSearch(String keyword){
        return "fore/searchResult";
    }

    @RequestMapping("/forecategory")
    public String foreCategory(int cid, Model model){
        Category category = categoryService.get(cid);
        model.addAttribute("c",category);
        return "fore/category";
    }
}
