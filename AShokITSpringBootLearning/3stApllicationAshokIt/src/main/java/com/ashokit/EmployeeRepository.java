package com.ashokit;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Serializable>{
	public Employee findByEmpName(String name);
		public List<Employee> findByEmpAgeGreaterThan(Integer age);
		public List<Employee> findByEmpNameIn(List<String> name);
		@Query("select empAge from Employee where empName=:name")
		public Integer findEmpAgeByEmpName(String name);
		@Query(value="select count(*) from employee;",nativeQuery = true)
		public Integer getCount();


}
