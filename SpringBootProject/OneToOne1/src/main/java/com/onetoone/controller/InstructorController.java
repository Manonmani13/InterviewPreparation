package com.onetoone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.entity.Test;
import com.onetoone.repository.InstructorRepository;

@RestController
public class InstructorController {
	@Autowired
	InstructorRepository repository;
	
	@PostMapping("/saveInstructor")
	public Test saveInstructor(@RequestBody Test instructor)
	{
		return repository.save(instructor);
		
	}
	@GetMapping("/getInstructor/{id}")
	public Optional<Test> getInstructor(@PathVariable("id") Long id)
	{
		return repository.findById(id);
		
	}
	@PutMapping("/update/{id}")
	public Test update(@PathVariable("id") Long id,@RequestBody Test instructor)
	{
		Optional<Test> inst=repository.findById(id);
		if(inst.get().getInstructor()!=null &&instructor.getInstructor()!=null )
		{
			inst.get().getInstructor().
			setYoutubeChannel(instructor.getInstructor().getYoutubeChannel());
		}
		inst.get().setEmail(instructor.getEmail());
		inst.get().setName(instructor.getName());
		return repository.save(instructor);
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id)
	{
		Optional<Test> inst=repository.findById(id);
		repository.deleteById(id);
		return "OK";
		
	}
	
}
