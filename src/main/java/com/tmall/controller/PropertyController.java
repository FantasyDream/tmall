package com.tmall.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.model.Category;
import com.tmall.model.Property;
import com.tmall.service.CategoryService;
import com.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_property_add")
    public String insert(Property property, Model model){
        if(propertyService.insert(property)){
            return "redirect: admin_property_list?cid="+property.getCid();
        } else {
            model.addAttribute("msg","添加属性失败");
            return "error";
        }
    }

    @RequestMapping("/admin_property_list")
    public String list(Model model, @RequestParam(value = "start",defaultValue = "1") int start,
                       @RequestParam(value = "size",defaultValue = "5")int size,@RequestParam(value = "cid")int cid){
        PageHelper.startPage(start,size);
        List<Property> list = propertyService.list(cid);
        PageInfo<Property> page= new PageInfo<>(list);
        model.addAttribute("c",categoryService.get(cid));
        model.addAttribute("params","&cid="+cid);
        model.addAttribute("page",page);
        return "admin/listProperty";
    }

    @RequestMapping("/admin_property_delete")
    public String delete(int id,Model model){
        Property property = propertyService.get(id);
        int cid = property.getCid();
        if(propertyService.delete(id)){
            return "redirect: admin_property_list?cid="+cid;
        } else {
            model.addAttribute("msg","删除属性失败");
            return "error";
        }
    }

    @RequestMapping("/admin_property_update")
    public String update(Property property,Model model){
        if(propertyService.update(property)){
            property=propertyService.get(property.getId());
            return "redirect: admin_property_list?cid="+property.getCid();
        } else {
            model.addAttribute("msg","修改属性失败");
            return "error";
        }
    }

    @RequestMapping("/admin_property_edit")
    public String edit(int id,Model model){
        Property property = propertyService.get(id);
        model.addAttribute("p",property);
        return "admin/editProperty";
    }
}
