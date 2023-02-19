package com.example.EcommerceAPIs.service;

import com.example.EcommerceAPIs.dao.userRepository;
import com.example.EcommerceAPIs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    userRepository userepository;

    public User addUser(User user){
        return userepository.save(user);
    }

    public User getUser(int id){
        return userepository.findById(id).get();
    }
}
