package com.mainproject.repository;

import java.time.LocalDate;
import java.util.List;

import com.mainproject.entity.Reminders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReminderRepository extends JpaRepository<Reminders, Long>{

	List<Reminders> findByDate(LocalDate today);
}
