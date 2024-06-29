package com.mainproject.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Reminders {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private LocalDate date;
	
	private String message;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Reminders() {
		super();
	}

	public Reminders(Long id, String name, LocalDate date, String message) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.message = message;
	}
	
}
