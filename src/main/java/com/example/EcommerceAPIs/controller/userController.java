package com.example.EcommerceAPIs.controller;

import com.example.EcommerceAPIs.model.User;
import com.example.EcommerceAPIs.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

    @Autowired
    userService service;

    @PostMapping("add-user")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }
//
    @GetMapping("get-user")
    public User getUser(@RequestParam int id){
        return service.getUser(id);
    }

}
