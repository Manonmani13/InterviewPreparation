package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dto.CustomerDTO;
import com.sample.dto.CustomerSaveDTO;
import com.sample.dto.CustomerUpdateDTO;
import com.sample.entity.Customer;
import com.sample.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceIMPL implements CustomerService
{
    @Autowired
    private CustomerRepository customerRepo;
    @Override
    public String addCustomer(CustomerSaveDTO customerSaveDTO)
    {
        Customer customer = new Customer(
                customerSaveDTO.getCustomername(),
                customerSaveDTO.getMobile(),
                customerSaveDTO.getCustomeraddress()
                
        );
        customerRepo.save(customer);
        return customer.getCustomerName();
    }
    @Override
    public List<CustomerDTO> getAllCustomer() {
       List<Customer> getCustomers = customerRepo.findAll();
       List<CustomerDTO> customerDTOList = new ArrayList<>();
       for(Customer a:getCustomers)
       {
           CustomerDTO customerDTO = new CustomerDTO(
                   a.getCustomerId(),
                   a.getCustomerName(),
                   a.getCustomeraddress(),
                   a.getMobile()
           );
           customerDTOList.add(customerDTO);
       }
       return  customerDTOList;
    }
    @Override
    public String updateCustomers(CustomerUpdateDTO customerUpdateDTO)
    {
        if (customerRepo.existsById(customerUpdateDTO.getCustomerid())) {
            Customer customer = customerRepo.getById(customerUpdateDTO.getCustomerid());
            customer.setCustomerName(customerUpdateDTO.getCustomername());
            customer.setCustomeraddress(customerUpdateDTO.getCustomeraddress());
            customer.setMobile(customerUpdateDTO.getMobile());
            customerRepo.save(customer);
        }
            else
            {
                System.out.println("Customer ID do not Exist");
            }
                return null;
        }
    @Override
    public boolean deleteCustomer(int id) {
        if(customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        }
        else
        {
            System.out.println("customer id not found");
        }
        return true;
    }
}