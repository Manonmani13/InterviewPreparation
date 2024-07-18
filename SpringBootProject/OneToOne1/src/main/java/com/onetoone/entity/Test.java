package com.onetoone.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;

	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Employee instructor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Test(Long id, String name, String email, Employee instructor) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.instructor = instructor;
	}

	public Test() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee getInstructor() {
		return instructor;
	}

	public void setInstructor(Employee instructor) {
		this.instructor = instructor;
	}

	

}
