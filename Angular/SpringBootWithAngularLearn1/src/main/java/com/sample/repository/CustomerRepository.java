package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
