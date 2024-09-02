package com.ashokit;

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
		
	}

}
