package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entity.Task;
import com.sample.repository.TaskRepository;

@RestController
@CrossOrigin
@RequestMapping("api/task")
public class TaskController {
	
	@Autowired
	TaskRepository repo;
	
	@GetMapping
	public List<Task> hellow()
	{
		return repo.findAll();
	}
	@PostMapping
	public Task createTask(@RequestBody Task task)
	{
		return repo.save(task);
	}

}
