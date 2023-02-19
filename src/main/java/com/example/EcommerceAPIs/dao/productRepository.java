package com.example.EcommerceAPIs.dao;

import com.example.EcommerceAPIs.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//
public interface productRepository extends JpaRepository<Product,Integer> {
}
