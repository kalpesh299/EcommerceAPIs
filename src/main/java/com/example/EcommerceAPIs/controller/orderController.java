package com.example.EcommerceAPIs.controller;

import com.example.EcommerceAPIs.dao.addressRepository;
import com.example.EcommerceAPIs.dao.orderRepository;
import com.example.EcommerceAPIs.dao.productRepository;
import com.example.EcommerceAPIs.dao.userRepository;
import com.example.EcommerceAPIs.model.Address;
import com.example.EcommerceAPIs.model.Order;
import com.example.EcommerceAPIs.model.Product;
import com.example.EcommerceAPIs.model.User;
import com.example.EcommerceAPIs.service.orderService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class orderController {
    @Autowired
    orderService orderservice;

    @Autowired
    userRepository userrepository;

    @Autowired
    productRepository productrepository;
    @Autowired
    addressRepository addressrepository;

    @PostMapping("order")
    public String order(@RequestBody String reuestorder){

        JSONObject json=new JSONObject(reuestorder);
        Order order=validateorder(json);
        orderservice.addorder(order);
   return "succsessfully done";
    }

    @GetMapping("get-order")
    public Order findOrder(@RequestParam int id){
        return orderservice.findOrder(id);
    }

    public Order validateorder(JSONObject json){
        Order order=new Order();
        order.setOrderId(json.getInt("orderId"));

        String userid=json.getString("userId");
        User user=userrepository.findById(Integer.valueOf(userid)).get();
        order.setUserId(user);

        String productid=json.getString("productId");
        Product product=productrepository.findById(Integer.valueOf(productid)).get();
        order.setProductId(product);

        String addressid= json.getString("adressId");
        Address address=addressrepository.findById(Integer.valueOf(addressid)).get();
        order.setAdressId(address);

        order.setQuantity(json.getInt("quantity"));

        return order;
    }
}
