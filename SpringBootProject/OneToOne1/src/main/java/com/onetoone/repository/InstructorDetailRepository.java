package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.entity.Employee;

public interface InstructorDetailRepository extends JpaRepository<Employee, Long> {

}
