package com.example.EcommerceAPIs.controller;

import com.example.EcommerceAPIs.model.Product;
import com.example.EcommerceAPIs.service.productService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    productService productservice;

    @PostMapping("add-product")
    public Product addProduct(@RequestBody Product product){
        return productservice.addProduct(product);
    }
    
    @GetMapping("get-products")
    public List<Product> getProducts(@Nullable @RequestParam String category){
        return productservice.getProducts(category);
    }

    @DeleteMapping("delete-product")
    public String deleteProduct(@RequestParam Integer id){
        productservice.deleteProduct(id);
        return "deleted successfully";
    }
}
