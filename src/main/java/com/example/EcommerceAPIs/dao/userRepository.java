package com.example.EcommerceAPIs.dao;

import com.example.EcommerceAPIs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Integer> {
}
