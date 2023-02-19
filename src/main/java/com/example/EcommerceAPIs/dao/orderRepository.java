package com.example.EcommerceAPIs.dao;

import com.example.EcommerceAPIs.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order,Integer> {
}
