package com.onetomany.repository;

import com.onetomany.entity.Answer;
import com.onetomany.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
