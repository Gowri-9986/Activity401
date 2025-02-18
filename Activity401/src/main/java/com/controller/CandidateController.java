package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.model.Candidate;
import com.model.Course;
import com.service.CandidateService;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/courses")
    public ResponseEntity<?> addCourse(@RequestBody Course course) {
        return candidateService.addCourse(course);
    }

    @GetMapping("/viewcourses")
    public ResponseEntity<?> getCourses() {
        return candidateService.getCourses();
    }

    @PostMapping("/candidates")
    public ResponseEntity<?> addCandidate(@RequestBody Candidate candidate) {
        return candidateService.addcandidate(candidate);
    }
    
    @GetMapping("/viewcandidates")
    public ResponseEntity<?> getCandidates() {
        return candidateService.getCandidates();
    }

    @PutMapping("/candidates")
    public ResponseEntity<?> updateCandidate(@RequestBody Candidate candidate) {
        return candidateService.updateCandidate(candidate);
    }
    
    @DeleteMapping("/candidates/{id}")
    public ResponseEntity<?> deleteCandidate(@PathVariable int id) {
        return candidateService.deleteCandidate(id);
    }

    @GetMapping("/candidate-course-details")
    public List<Object[]> getCandidateCourseDetails() {
        return candidateService.getCandidateCourseDetails();
    }
}