package com.example.EcommerceAPIs.service;

import com.example.EcommerceAPIs.dao.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    @Autowired
    orderRepository orderrepository;

}
