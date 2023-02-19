package com.example.EcommerceAPIs.service;

import com.example.EcommerceAPIs.dao.productRepository;
import com.example.EcommerceAPIs.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService {
    @Autowired
    productRepository productrepository;

    public Product addProduct(Product product){
        return productrepository.save(product);
    }
}
