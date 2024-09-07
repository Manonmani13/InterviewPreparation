package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository empRepository;
    

    public void saveData() {
        Employee emp = new Employee();
        emp.setEmpId(6);
        emp.setEmpName("Pandukumar E");
        emp.setEmpAge(55);
       empRepository.save(emp);
    }
}
