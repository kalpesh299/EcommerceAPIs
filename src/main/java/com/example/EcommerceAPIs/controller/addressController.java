package com.example.EcommerceAPIs.controller;

import com.example.EcommerceAPIs.dao.userRepository;
import com.example.EcommerceAPIs.model.Address;
import com.example.EcommerceAPIs.model.User;
import com.example.EcommerceAPIs.service.addressService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addressController {

    @Autowired
    addressService addressservice;

    @Autowired
    userRepository userrepository;

    @PostMapping("address")
    public Address address(@RequestBody String address){
        JSONObject json=new JSONObject(address);
        Address add=validataddress(json);
       return addressservice.address(add);
    }

    public Address validataddress(JSONObject json){
        Address address=new Address();
        address.setAdressId(json.getInt("adressId"));
        address.setAddress(json.getString("address"));
        address.setLandMark(json.getString("landMark"));
        address.setPhoneNumer(json.getString("phoneNumer"));
        address.setZipCode(json.getString("zipCode"));
        address.setState(json.getString("state"));
        String userid=json.getString("userId");
        User user=userrepository.findById(Integer.valueOf(userid)).get();
        address.setUserId(user);
        return address;
    }

}
