package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository empRepository;
    
    @Autowired
    private AddressRepository addRepository;
    
    @Transactional(rollbackFor = Exception.class)
    public void saveData() {
        Employee emp = new Employee();
        emp.setEmpId(6);
        emp.setEmpName("Pandukumar E");
        emp.setEmpAge(55);
        empRepository.save(emp);
        System.out.println("after saving employee");

        // This line will cause an ArithmeticException, triggering a rollback
        int i = 10 / 0;

        // This code will not be executed due to the exception above
        System.out.println("not coming");
        
        Address add = new Address();
        add.setAddId(1);
        add.setCity("Chennai");
        add.setCountry("India");
        add.setState("Tamil Nadu");
        add.setEmpId(6);
        addRepository.save(add);
    }
}
