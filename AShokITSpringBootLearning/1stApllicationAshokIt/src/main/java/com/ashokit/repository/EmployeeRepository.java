package com.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Serializable>{
	public Employee findByEmpName(String name);
		public List<Employee> findByEmpAgeGreaterThan(Integer age);
		public List<Employee> findByEmpNameIn(List<String> name);
		@Query("select empAge from Employee where empName=:name")
		public Integer findEmpAgeByEmpName(String name);
		@Query(value="select count(*) from employee;",nativeQuery = true)
		public Integer getCount();


}
