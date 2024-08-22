package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	 @Autowired
	    private EmployeeRepository employeeRepository;

	    @Autowired
	    private ProjectRepository projectRepository;
	    @PostMapping(value = "/createEmployee")
	    public String createEmployee(@RequestBody Project entity) {
	        System.out.println("\nCreate a new Employee." + "\n");

	        // create a new Employee
	       
	         projectRepository.save(entity);
	        System.out.println("\nSaved employee :: " + entity + "\n");

	        return "Employee saved!!!";
	    }
	    @PostMapping("/createProjectForEmployees")
	    public String createProjectForEmployee(@RequestBody Project entity) {
	        System.out.println("\nCreate new Project and      		add existing Employees into this Project." + "\n");

	        // get first Employee
	        int emplId = 7;
	        Employee employee1 = this.employeeRepository.getById(emplId);
	        System.out.println("\nEmployee details :: " + employee1.toString() + "\n");

	        // get first Employee
	        emplId = 9;
	        Employee employee2 = this.employeeRepository.getById(emplId);
	        System.out.println("\nEmployee details :: " + employee2.toString() + "\n");

	        // new Project
	        Project project = new Project(entity.getProjectName());

	        // create Employee set
	        Set<Employee> employees = new HashSet();
	        employees.add(employee1);
	        employees.add(employee2);

	        // assign Employee Set to Project
	        project.setEmployees(employees);

	        // save Project
	        project = projectRepository.save(project);
	        System.out.println("\nSaved Project :: " + project + "\n");

	        return "Project saved!!!";
	    }
}
