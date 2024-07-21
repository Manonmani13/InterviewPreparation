package com.emp.dep.repository;

import com.emp.dep.entiyt.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
