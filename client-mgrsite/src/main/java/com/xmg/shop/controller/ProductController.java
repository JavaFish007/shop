package com.xmg.shop.controller;

import com.xmg.shop.domain.Product;
import com.xmg.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**前端后台产品控制器
 * Created by Administrator on 2017/8/11 0011.
 */
@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @RequestMapping("product")
    @ResponseBody
    public Product getProduct(){
        return productService.get();
    }

    @RequestMapping("listall")
    @ResponseBody
    public List<Product> listAll(){
        return productService.listAll();
    }

}
