package com.employeemanagementweb.service;

import com.employeemanagementweb.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
@Component
public interface EmployeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    Page<Employee> findPaginated(int pageNo,int pageSize,String sortField,String sortDirection);
}
