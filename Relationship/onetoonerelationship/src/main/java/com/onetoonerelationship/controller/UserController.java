    package com.onetoonerelationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonerelationship.entity.Address;
import com.onetoonerelationship.entity.User;
import com.onetoonerelationship.repository.AddressRepository;
import com.onetoonerelationship.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

   
     @PostMapping("/saveUser")
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        // Logic to save the user
        return ResponseEntity.ok("User saved successfully");
    }
}
