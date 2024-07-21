package com.emp.dep.repository;

import com.emp.dep.entiyt.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
