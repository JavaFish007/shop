package com.xmg.shop.service.impl;

import com.xmg.shop.domain.Product;
import com.xmg.shop.mapper.ProductMapper;
import com.xmg.shop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
@Service("productService")
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductMapper productMapper;

    public Product get() {
        Product product = productMapper.selectByPrimaryKey(1L);
        return product;
    }

    @Override
    public List<Product> listAll() {
        return productMapper.selectAll();
    }


}
