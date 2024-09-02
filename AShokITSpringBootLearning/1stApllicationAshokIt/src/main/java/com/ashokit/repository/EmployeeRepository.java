package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Serializable>{

}
