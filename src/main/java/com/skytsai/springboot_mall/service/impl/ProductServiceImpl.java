package com.skytsai.springboot_mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.skytsai.springboot_mall.model.Product;
import com.skytsai.springboot_mall.dao.ProductDao;
import com.skytsai.springboot_mall.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao producetDao;

    @Override
    public Product getProductById(Integer productId) {

        return producetDao.getProductById(productId);
    
    }
} 