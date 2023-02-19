package com.example.EcommerceAPIs.controller;

import com.example.EcommerceAPIs.model.User;
import com.example.EcommerceAPIs.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @Autowired
    userService service;

    @PostMapping("add-user")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }

}
