package com.manytomany;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Employee {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  
	private int empId;
	
	private String name;
	
	private String skills;
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinTable(name = "EMPLOYEE_PROJECT_MAPPING", joinColumns = @JoinColumn(name = "emp_id"), 
	     inverseJoinColumns = @JoinColumn(name = "project_id"))
	private Set<Project> projects;

	    public Employee() {
	    }

	    public Employee(String name,  String technicalSkill) {
	        this.name = name;
	        this.skills = technicalSkill;
	    }

	    
	    public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	   public Set<Project> getProjects() { return projects; }
	    public void setProjects(Set<Project> projects) { this.projects = projects; }

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

	   
}
