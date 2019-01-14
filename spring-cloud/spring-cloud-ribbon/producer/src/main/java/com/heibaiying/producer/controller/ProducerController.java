package com.heibaiying.producer.controller;


import com.heibaiying.common.api.IProductService;
import com.heibaiying.common.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : heibaiying
 */
@RestController
public class ProducerController {

    @Autowired
    private IProductService productService;

    @RequestMapping("products")
    public List<Product> productList() {
        return productService.queryAllProducts();
    }

    @RequestMapping("product/{id}")
    public Product productDetail(@PathVariable int id) {
        return productService.queryProductById(id);
    }
}
