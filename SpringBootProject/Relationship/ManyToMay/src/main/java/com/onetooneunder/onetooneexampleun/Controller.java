package com.onetooneunder.onetooneexampleun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class Controller {
    @Autowired
    private CustomerRepository studentService;

    @GetMapping
    public List<Customer> getAllStudents() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getStudentById(@PathVariable Long id) {
        Optional<Customer> student = studentService.findById(id);
        return student.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Customer createStudent(@RequestBody Customer student) {
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateStudent(@PathVariable Long id, @RequestBody Customer updatedStudent) {
        Optional<Customer> student = studentService.findById(id);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }
        else {
            student.get().setName(updatedStudent.getName());
            if(updatedStudent.getItem()!=null)
                student.get().setItem(updatedStudent.getItem());

            studentService.save(student.get());
        }
        return ResponseEntity.ok(student.get());
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
      studentService.deleteById(id);
    }
}
