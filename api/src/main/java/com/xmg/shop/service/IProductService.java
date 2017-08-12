package com.xmg.shop.service;

import com.xmg.shop.domain.Product;

import java.util.List;

/**
 * Created by Administrator on 2017/8/11 0011.
 */
public interface IProductService {

    Product get();

    List<Product> listAll();
}
