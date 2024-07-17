package com.simple.onetoonesample.controller;

import com.simple.onetoonesample.entity.Customer;
import com.simple.onetoonesample.entity.Product;
import com.simple.onetoonesample.repository.CustomerRepository;
import com.simple.onetoonesample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductContorller {

    @Autowired
    CustomerRepository repository;

    @PostMapping
    public Customer save(@RequestBody Customer customer)
    {
        return repository.save(customer);
    }
}
