package com.simple.onetoonesample.repository;

import com.simple.onetoonesample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Customer,Long> {
}
