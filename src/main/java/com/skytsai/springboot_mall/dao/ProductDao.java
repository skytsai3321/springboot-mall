package com.skytsai.springboot_mall.dao;

import com.skytsai.springboot_mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    
}
