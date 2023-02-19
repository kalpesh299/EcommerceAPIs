package com.example.EcommerceAPIs.service;

import com.example.EcommerceAPIs.dao.orderRepository;
import com.example.EcommerceAPIs.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    @Autowired
    orderRepository orderrepository;

    public Order addorder(Order order){
      return  orderrepository.save(order);
    }

    public Order findOrder(int id){
        return orderrepository.findById(id).get();
    }

}
