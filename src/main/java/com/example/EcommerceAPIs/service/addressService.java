package com.example.EcommerceAPIs.service;

import com.example.EcommerceAPIs.dao.addressRepository;
import com.example.EcommerceAPIs.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class addressService {
    @Autowired
    addressRepository addressrepository;

    public Address address(Address address){
        return addressrepository.save(address);
    }
}
