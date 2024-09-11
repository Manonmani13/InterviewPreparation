package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.entity.Task;

public interface TaskRepository  extends JpaRepository<Task, Long>{

}
