package com.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    @GetMapping("/get/{id}")
    public Optional<Student> getStudent(@PathVariable("id")Long id)
    {
        return studentRepository.findById(id);
    }
    @PutMapping("/update/{id}")
    public Student update(@PathVariable("id")Long id,@RequestBody Student student)
    {
        Optional<Student> stut=studentRepository.findById(id);
        stut.get().setEmail(student.getEmail());
        stut.get().setName(student.getName());
        stut.get().setPhoneNo(student.getPhoneNo());
         return   studentRepository.save(stut.get());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id)
    {
         studentRepository.deleteById(id);
    }
    @GetMapping("/pagination/{id}/{pS}/{field}")
    public Page<Student> getStudent(@PathVariable("id")int pageIndex, @PathVariable("pS")int pS, @PathVariable("field")String field)
    {
        return studentRepository.findAll(PageRequest.of(pageIndex,pS).withSort(Sort.by(Sort.Direction.DESC,(field))));
    }

}
