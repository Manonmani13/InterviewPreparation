package com.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Employee;
import com.ashokit.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeRepository employeeRepository=context.getBean(EmployeeRepository.class);
		System.out.println(employeeRepository.getClass().getName());
		Employee emp=new Employee();
		emp.setEmpAge(22);
		emp.setEmpName("Mano");
		emp.setEmpId(1);
		employeeRepository.save(emp);
		Employee e=new Employee();
		e.setEmpAge(27);
		e.setEmpName("Naveen");
		e.setEmpId(2);
		employeeRepository.save(e);

		Employee e1=new Employee();
		e1.setEmpAge(30);
		e1.setEmpName("Chandar");
		e1.setEmpId(3);
		employeeRepository.save(e1);
		Employee findUser=employeeRepository.findByEmpName("Mano");
		System.out.println(findUser);
		List<Employee> grater=employeeRepository.findByEmpAgeGreaterThan(25);
		System.out.println(grater);

		List<Employee> names=employeeRepository.findByEmpNameIn(Arrays.asList("Mano","Naveen"));
		
		System.out.println(names);
		Integer age=employeeRepository.findEmpAgeByEmpName("Mano");
		System.out.println(age);
		System.out.println(employeeRepository.getCount());
	}

}
