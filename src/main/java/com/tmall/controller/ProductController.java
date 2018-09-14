package com.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.model.Product;
import com.tmall.service.CategoryService;
import com.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_product_list")
    public String listByCid(Model model, @RequestParam(value = "start",defaultValue = "1") int start,
                            @RequestParam(value = "size",defaultValue = "5")int size,
                            @RequestParam(value = "cid")int cid){
        PageHelper.startPage(start,size);
        List<Product> list = productService.listByCid(cid);
        PageInfo<Product> page = new PageInfo<>(list);
        model.addAttribute("c",categoryService.get(cid));
        model.addAttribute("page",page);
        model.addAttribute("params","&cid="+cid);
        return "admin/listProduct";
    }

    @RequestMapping("/admin_product_add")
    public String insert(Model model,Product product){
        if (productService.insert(product)){
            return "redirect: admin_product_list?cid="+product.getCid();
        } else {
            model.addAttribute("msg","插入产品失败");
            return "error";
        }
    }

    @RequestMapping("/admin_product_delete")
    public String delete(Model model,int id){
        Product product = productService.get(id);
        if (productService.delete(id)){
            return "redirect: admin_product_list?cid="+product.getCid();
        } else {
            model.addAttribute("msg","删除产品失败");
            return "error";
        }
    }

    @RequestMapping("/admin_product_update")
    public String update(Model model,Product product){
        if (productService.update(product)){
            return "redirect: admin_product_list?cid="+product.getCid();
        } else {
            model.addAttribute("msg","更新产品失败");
            return "error";
        }
    }

    @RequestMapping("/admin_product_edit")
    public String edit(int id,Model model){
        model.addAttribute("p",productService.get(id));
        return "/admin/editProduct";
    }
}
