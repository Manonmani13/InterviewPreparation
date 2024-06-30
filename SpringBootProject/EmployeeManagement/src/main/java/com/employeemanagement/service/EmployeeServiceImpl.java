package com.employeemanagement.service;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
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
        this.employeeRepository.save(employee);

    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> op=employeeRepository.findById(id);
        Employee employee=null;
        if(op.isPresent())
        {
            employee= op.get();

        }
        else{
            throw  new RuntimeException("Employee is not found for id"+id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirector) {
        Sort sort=sortDirector.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortField).ascending():
                Sort.by(sortField).descending();
        Pageable pageable= PageRequest.of(pageNo-1,pageSize,sort);
        return employeeRepository.findAll(pageable);
    }
}
