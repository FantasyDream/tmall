package com.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.model.Category;
import com.tmall.service.CategoryService;
import com.tmall.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author FantasyDream
 */
@Controller
@RequestMapping("")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping("/admin_category_list")
    public String selectAll(Model model, @RequestParam(value = "start",defaultValue = "0") int start, @RequestParam(value = "size",defaultValue = "5")int size){
        PageHelper.startPage(start,size);
        List<Category> cs = categoryService.selectAll();
        PageInfo<Category> page = new PageInfo<>(cs);
        model.addAttribute("page",page);
        return "/admin/listCategory";
    }

    @RequestMapping("/admin_category_add")
    public String insert(Model model, HttpSession session,Category category, MultipartFile image) throws IOException {
        categoryService.insert(category);
        File upload = new File(session.getServletContext().getRealPath("img/category"));
        File file = new File(upload,category.getId()+".jpg");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        image.transferTo(file);
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img,"jpg",file);
        return "redirect:admin_category_list";
    }

    @RequestMapping("/admin_category_edit")
    public String edit(int id,Model model){
        Category c = categoryService.get(id);
        model.addAttribute("c",c);
        return "/admin/editCategory";
    }


    @RequestMapping("/admin_category_update")
    public String update(Category c,HttpSession session,MultipartFile image) throws IOException {
        categoryService.update(c);
        if (null!=image && !image.isEmpty()){
            File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
            File file = new File(imageFolder,c.getId()+".jpg");
            image.transferTo(file);
            BufferedImage img = ImageUtil.change2jpg(file);
            ImageIO.write(img,"jpg",file);
        }
        return "redirect:admin_category_list";
    }

    @RequestMapping("/admin_category_delete")
    public String delete(HttpSession session,int id){
        categoryService.delete(id);
        File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
        File file = new File(imageFolder,id+".jpg");
        file.delete();
        return "redirect:admin_category_list";
    }
}
