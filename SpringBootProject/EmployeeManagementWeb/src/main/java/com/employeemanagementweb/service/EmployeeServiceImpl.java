package com.employeemanagementweb.service;

import com.employeemanagementweb.entity.Employee;
import com.employeemanagementweb.repository.EmployeeRepository;
import org.hibernate.query.SortDirection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> emp= employeeRepository.findById(id);
        Employee e1=null;
        if(emp!=null)
            e1=emp.get();
        else
            throw new RuntimeException("Employee Not Found"+id);
        return e1;
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);

    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort= sortDirection.equalsIgnoreCase(SortDirection.ASCENDING.name())?Sort.by(sortField).ascending():
                Sort.by(sortField).descending();
        Pageable pageable= PageRequest.of(pageNo,pageSize,sort);
        return employeeRepository.findAll(pageable);

    }
}
