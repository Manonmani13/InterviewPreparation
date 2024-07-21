package com.emp.dep.controller;

import com.emp.dep.entiyt.Department;
import com.emp.dep.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository repository;

    @PostMapping("/saveDepartment")
    public Department  saveDepartment(@RequestBody Department department)
    {
        return repository.save(department);
    }

}
