package com.bezkoder.spring.hibernate.manytomany.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bezkoder.spring.hibernate.manytomany.exception.ResourceNotFoundException;
import com.bezkoder.spring.hibernate.manytomany.model.Tag;
import com.bezkoder.spring.hibernate.manytomany.model.Tutorial;
import com.bezkoder.spring.hibernate.manytomany.repository.TagRepository;
import com.bezkoder.spring.hibernate.manytomany.repository.TutorialRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {

  @Autowired
  TutorialRepository tutorialRepository;
  @Autowired
  TagRepository tagRepository;

  @GetMapping("/tutorials")
  public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title) {
    List<Tutorial> tutorials = new ArrayList<Tutorial>();

    if (title == null)
      tutorialRepository.findAll().forEach(tutorials::add);
    else
      tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);

    if (tutorials.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    return new ResponseEntity<>(tutorials, HttpStatus.OK);
  }

  @GetMapping("/tutorials/{id}")
  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
    Tutorial tutorial = tutorialRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

    return new ResponseEntity<>(tutorial, HttpStatus.OK);
  }

  @PostMapping("/tutorials")
  public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
	  Tutorial post = new Tutorial();
      post.setTitle(tutorial.getTitle());
      post.setDescription(tutorial.getDescription());
      post.setPublished(tutorial.isPublished());

      Set<Tag> tags = new HashSet();
      for (Tag tagDto : tutorial.getTags()) {
          Tag tag = tagRepository.findByName(tagDto.getName());
          if (tag == null) {
              tag = new Tag();
              tag.setName(tagDto.getName());
              tagRepository.save(tag);
          }
          tags.add(tag);
      }

      post.setTags(tags);

      // Save the post and the tags
      tutorialRepository.save(post);

      return post;
  }

  @PutMapping("/tutorials/{id}")
  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
    Tutorial _tutorial = tutorialRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

    _tutorial.setTitle(tutorial.getTitle());
    _tutorial.setDescription(tutorial.getDescription());
    _tutorial.setPublished(tutorial.isPublished());
    
    return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
  }

  @DeleteMapping("/tutorials/{id}")
  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
    tutorialRepository.deleteById(id);
    
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @DeleteMapping("/tutorials")
  public ResponseEntity<HttpStatus> deleteAllTutorials() {
    tutorialRepository.deleteAll();
    
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @GetMapping("/tutorials/published")
  public ResponseEntity<List<Tutorial>> findByPublished() {
    List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

    if (tutorials.isEmpty()) {
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    return new ResponseEntity<>(tutorials, HttpStatus.OK);
  }
}
