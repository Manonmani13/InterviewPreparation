package com.sample.service;

import java.util.List;

import com.sample.dto.CustomerDTO;
import com.sample.dto.CustomerSaveDTO;
import com.sample.dto.CustomerUpdateDTO;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);
    List<CustomerDTO> getAllCustomer();
    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);
    boolean deleteCustomer(int id);
}