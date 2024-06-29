package com.mainproject.repository;

import com.mainproject.entity.PersonalReminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalReminderRepository extends JpaRepository<PersonalReminder,Long> {
}
