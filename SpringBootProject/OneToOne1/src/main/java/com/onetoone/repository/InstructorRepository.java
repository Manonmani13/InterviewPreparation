package com.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetoone.entity.Test;

public interface InstructorRepository extends JpaRepository<Test, Long> {

}
