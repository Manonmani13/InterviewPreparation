package com.curd.controller;

import com.curd.entity.Student;
import com.curd.exception.ResourceNotFound;
import com.curd.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v2/students")
public class StudentController {
    @Autowired
    StudentRepository repo;

    @GetMapping
    public List<Student> findAllStudent()
    {
        return repo.findAll();
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student)
    {
        Student stu=repo.save(student);
        return stu;
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> getById(@PathVariable  Long id)
    {
        Student stu=repo.findById(id).orElseThrow(()->new ResourceNotFound("There is no Id Found"));
        return ResponseEntity.ok(stu);
    }
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable  Long id,@RequestBody Student student)
    {
        Student stu=repo.findById(id).orElseThrow(()->new ResourceNotFound("There is no Id Found"));
        stu.setName(student.getName());
        stu.setPhoneNo(student.getPhoneNo());
        stu.setQualification(student.getQualification());
        repo.save(stu);
        return ResponseEntity.ok(stu);
    }


}
