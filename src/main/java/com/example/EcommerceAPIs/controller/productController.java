package com.example.EcommerceAPIs.controller;

import com.example.EcommerceAPIs.model.Product;
import com.example.EcommerceAPIs.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @Autowired
    productService productservice;

    @PostMapping("add-product")
    public Product addProduct(@RequestBody Product product){
        return productservice.addProduct(product);
    }
}
