package com.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepository;
	@Autowired
	private AddressRepository addRepository;
	
//	@Transactional(rollbackOn = Exception.class)
	public void saveData()
	{
		Employee emp=new Employee();
		emp.setEmpId(5);
		emp.setEmpName("Pandukumar");
		emp.setEmpAge(55);
		empRepository.save(emp);
		int i=10/0;
		Address add=new Address();
		add.setAddId(1);
		add.setCity("Chennai");
		add.setCountry("India");
		add.setState("Tamil Nadu");
		add.setEmpId(5);
		addRepository.save(add);
	}

}
