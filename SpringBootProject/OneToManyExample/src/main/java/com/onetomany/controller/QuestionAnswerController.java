package com.onetomany.controller;

import com.onetomany.entity.Answer;
import com.onetomany.entity.Question;
import com.onetomany.repository.AnswerRepository;
import com.onetomany.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/questions")
public class QuestionAnswerController {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping
    public ResponseEntity<String> saveQA(@RequestBody Question question)
    {
        try{
            if (question.getAnswers() != null) {
                for(Answer ans:question.getAnswers())
                {
                    answerRepository.save(ans);
                }
                questionRepository.save(question);

            }
            return new ResponseEntity<>("Question created successfully", HttpStatus.CREATED);

        }
        catch (Exception e)
        {
            return new ResponseEntity<>("Failed to create question", HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }
    @GetMapping("/{id}")
    public ResponseEntity<Question> getByID(@PathVariable("id")Long id)
    {
        Question quest=questionRepository.findById(id).orElse(null);
        if(quest!=null)
        return new ResponseEntity<>(quest,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateQuestion(@PathVariable("id")Long id,@RequestBody Question que)
    {
        Question quest=questionRepository.findById(id).orElse(null);
        if(quest!=null)
        {
            quest.setQuestion(que.getQuestion());
            quest.setAnswers(que.getAnswers());
            questionRepository.save(quest);
            return new ResponseEntity<>("Question updated successfully", HttpStatus.OK);

        }
        else
            return new ResponseEntity<>("Failed to create question", HttpStatus.INTERNAL_SERVER_ERROR);


    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")Long id)
    {
        try{
            questionRepository.deleteById(id);
            return new ResponseEntity<>("Question deleted successfully", HttpStatus.OK);

        }
        catch (Exception e)
        {
            return new ResponseEntity<>("Failed to delete question", HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }




}
