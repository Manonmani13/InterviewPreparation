package com.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData) {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        return empRepository.findAll();
    }
}