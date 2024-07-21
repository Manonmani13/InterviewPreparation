package com.emp.dep.controller;

import com.emp.dep.entiyt.*;
import com.emp.dep.repository.EmployeeRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee emp)
    {
        return repository.save(emp);
    }
    @GetMapping("/getEmployee")
    public List<Employee> saveEmployee()
    {
        return repository.findAll();
    }
    @GetMapping("/paginationwithfilters/{pageNo}/{pageSize}/{order}/{field}")
    public MessageResponse getEmp(@PathVariable int pageNo,
                                  @PathVariable int pageSize,
                                  @PathVariable String order,
                                  @PathVariable String field) {
        MessageResponse response = new MessageResponse();
        response.setStatus("200");
        response.setMessage("Data retrieved successfully");

        // Adjust pageNo for 0-based index
        int adjustedPageNo = pageNo - 1;

        Page<Employee> emp = repository.findAll(PageRequest.of(adjustedPageNo, pageSize, Sort.Direction.valueOf(order), field));

        List<EmployeeResponse> employeeDtos = new ArrayList<>();

        for (Employee employee : emp.getContent()) {
            EmployeeResponse employeeDto = new EmployeeResponse();
            employeeDto.setId(employee.getId());
            employeeDto.setName(employee.getName());
            employeeDto.setSalary(employee.getSalary());

            DepartmentResponse departmentDto = new DepartmentResponse();
            if (employee.getDepartment() != null) {
                departmentDto.setId(employee.getDepartment().getId());
                departmentDto.setName(employee.getDepartment().getName());
                employeeDto.setDepartment(departmentDto);
            }

            employeeDtos.add(employeeDto);
        }

        response.setData(employeeDtos);
        return response;
    }

}
