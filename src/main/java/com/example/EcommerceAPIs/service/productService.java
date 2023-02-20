package com.example.EcommerceAPIs.service;

import com.example.EcommerceAPIs.dao.productRepository;
import com.example.EcommerceAPIs.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {
    @Autowired
    productRepository productrepository;

    public Product addProduct(Product product){
        return productrepository.save(product);
    }


    public List<Product> getProducts(String category){
        List<Product>products=productrepository.findAll();
        List<Product>filterdproducts=new ArrayList<>();
        if(category!=null){
            for(Product product:products){
                if(product.getCategory().equals(category)){
                    filterdproducts.add(product);
                }
            }
            return filterdproducts;
        }


        return products;
    }
    public void deleteProduct(Integer id){
         productrepository.deleteById(id);
    }
}
