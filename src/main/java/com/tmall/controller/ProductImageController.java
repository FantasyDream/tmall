package com.tmall.controller;

import com.tmall.model.ProductImage;
import com.tmall.service.ProductImageService;
import com.tmall.service.ProductService;
import com.tmall.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class ProductImageController {

    @Autowired
    ProductImageService productImageService;

    @Autowired
    ProductService productService;

    @RequestMapping("admin_productImage_list")
    public String listByPid(int pid, Model model) {
        List<ProductImage> pisSingle = productImageService.listByPidAndTypeSingle(pid);
        List<ProductImage> pisDetail = productImageService.listByPidAndTypeDetail(pid);
        model.addAttribute("p", productService.get(pid));
        model.addAttribute("pisSingle", pisSingle);
        model.addAttribute("pisDetail", pisDetail);
        return "admin/listProductImage";
    }

    @RequestMapping("admin_productImage_add")
    public String insert(ProductImage productImage, Model model, MultipartFile image, HttpSession session) {
        if (productImageService.insert(productImage)) {
            File upload = null;
            String type = "type_single";
            if (productImage.getType().equals(type)){
                upload = new File(session.getServletContext().getRealPath("img/productSingle"));
            } else {
                upload = new File(session.getServletContext().getRealPath("img/productDetail"));
            }
            File file = new File(upload,productImage.getId()+".jpg");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            try {
                image.transferTo(file);
                BufferedImage img = ImageUtil.change2jpg(file);
                ImageIO.write(img, "jpg", file);
            } catch (IOException e){
                e.printStackTrace();
                return "error";
            }
            return "redirect: admin_productImage_list?pid="+productImage.getPid();
        } else {
            model.addAttribute("msg", "添加图片失败");
            return "error";
        }
    }

    @RequestMapping("admin_productImage_delete")
    public String delete(int id, Model model) {
        ProductImage productImage = productImageService.get(id);
        if (productImageService.delete(id)) {
            return "redirect: admin_productImage_list?pid="+productImage.getPid();
        } else {
            model.addAttribute("msg", "删除图片失败");
            return "error";
        }
    }

    @RequestMapping("admin_productImage_update")
    public String update(ProductImage productImage, Model model) {
        if (productImageService.update(productImage)) {
            return "redirect: admin_productImage_list";
        } else {
            model.addAttribute("msg", "添加图片失败");
            return "error";
        }
    }
}
