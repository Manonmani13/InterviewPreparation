    package com.onetoonerelationship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonerelationship.entity.Address;
import com.onetoonerelationship.entity.User;
import com.onetoonerelationship.repository.AddressRepository;
import com.onetoonerelationship.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AddressRepository addressRepository;

   
    @PostMapping("saveUser")

    public User saveuser(@RequestBody User user)
    {
        return userRepository.save(user);
    }
    @PostMapping("/save")  // Matches POST requests to /api/saveUser
    public String saveUser() {
        // Your logic here
        return "User saved!";
    }
}
