package com.manytomany;

import java.util.Set;

import jakarta.persistence.*;
@Entity
public class Project {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  
	private int id;
	
	private String projectName;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinTable(name = "EMPLOYEE_PROJECT_MAPPING", joinColumns = @JoinColumn(name = "project_id"), 
	     inverseJoinColumns = @JoinColumn(name = "emp_id"))
	private Set<Employee> employees;

	   public Project() {}

	    public Project(String projectName) {
	        this.projectName = projectName;
	    }

	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public String getProjectName() { return projectName; }
	    public void setProjectName(String projectName) { this.projectName = projectName; }

	   
	    public Set<Employee> getEmployees() { return employees; }
	    public void setEmployees(Set<Employee> employees) { this.employees = employees; }
}
