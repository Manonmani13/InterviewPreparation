package com.sample.service;

import java.util.List;

import com.sample.entity.Student;

public interface StudentService {
	  public Student saveStudent(Student student);
	    public List<Student> getAllStudents();
}
