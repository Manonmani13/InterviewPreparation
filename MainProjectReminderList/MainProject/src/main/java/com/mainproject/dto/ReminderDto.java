package com.mainproject.dto;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component

public class ReminderDto {
private String name;
	
	private LocalDate date;
	
	private String message;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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


	public ReminderDto(String name, LocalDate date, String message) {
		super();
		this.name = name;
		this.date = date;
		this.message = message;
	}

	public ReminderDto() {
		super();
	}
	
}
