package com.tmall.controller;

import com.tmall.model.PropertyValue;
import com.tmall.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class ProductValueController {

    @Autowired
    PropertyValueService propertyValueService;

    @RequestMapping("admin_productValue_edit")
    public String edit(int pid, Model model){
        List<PropertyValue> propertyValues = propertyValueService.listByPid(pid);
        model.addAttribute("pvs",propertyValues);
        return "admin/editPropertyValue";
    }

    @ResponseBody
    @RequestMapping("admin_propertyValue_update")
    public String update(PropertyValue propertyValue){
        if (propertyValueService.update(propertyValue)) {
            return "success";
        } else {
            return "fail";
        }
    }
}
