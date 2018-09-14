package com.tmall.controller;

import com.tmall.model.Category;
import com.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PageController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/")
    public String home(Model model){
        List<Category> cs = categoryService.selectAll();
        model.addAttribute("cs",cs);
        return "/fore/home";
    }

    @RequestMapping("loginPage")
    public String loginPage(){
        return "/fore/login";
    }

    @RequestMapping("registerPage")
    public String registerPage(){
        return "/fore/register";
    }


}
