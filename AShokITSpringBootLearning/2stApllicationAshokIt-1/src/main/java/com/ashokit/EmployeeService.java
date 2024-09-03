package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private AddressRepository addRepository;
	
	
	public void saveData()
	{
		Employee emp=new Employee();
		emp.setEmpId(4);
		emp.setEmpName("Pandukumar");
		emp.setEmpAge(55);
		empRepository.save(emp);
		Address add=new Address();
		add.setAddId(1);
		add.setCity("Chennai");
		add.setCountry("India");
		add.setState("Tamil Nadu");
		add.setEmpId(4);
		addRepository.save(add);
	}

}
