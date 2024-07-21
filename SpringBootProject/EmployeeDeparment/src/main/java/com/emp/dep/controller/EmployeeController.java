package com.emp.dep.controller;

import com.emp.dep.entiyt.Department;
import com.emp.dep.entiyt.Employee;
import com.emp.dep.entiyt.MessageResponse;
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
        MessageResponse response=new MessageResponse();
        response.setStatus("200");
        response.setMessage("Data retrieved successfully");
        List<Employee> employeeDtos = new ArrayList<>();

        Page<Employee> emp=repository.findAll(PageRequest.of(pageNo,pageSize).withSort(Sort.Direction.valueOf(order),field));
        if(emp!=null)
        {
            for(Employee employee:emp.getContent())
            {
                Employee employeeDto = new Employee();
                employeeDto.setId(employee.getId());
                employeeDto.setName(employee.getName());
                employeeDto.setSalary(employee.getSalary());

                Department departmentDto = new Department();

                if ( employee.getDepartment()!=null) {
                    departmentDto.setId(employee.getDepartment().getId());
                    departmentDto.setName(employee.getDepartment().getName());                employeeDto.setDepartment(departmentDto);
                    employeeDto.setDepartment(departmentDto);

                }
                employeeDtos.add(employee);
            }
        }
        response.setData(employeeDtos);
        return response;
    }

}
