package com.employeemanagement.service;

import com.employeemanagement.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String  sortField, String sortDirector);
}
