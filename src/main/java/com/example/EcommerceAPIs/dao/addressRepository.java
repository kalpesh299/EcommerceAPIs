package com.example.EcommerceAPIs.dao;

import com.example.EcommerceAPIs.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface addressRepository extends JpaRepository<Address,Integer> {
}
