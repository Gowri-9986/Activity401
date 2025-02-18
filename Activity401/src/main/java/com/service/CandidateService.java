package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.Candidatedao;
import com.dao.Coursedao;
import com.model.Candidate;
import com.model.Course;

@Service
public class CandidateService {
	
	@Autowired
	Candidatedao candidDAO;
	
	@Autowired
	Coursedao courseDAO;
	
	public ResponseEntity<?> addCourse(Course course){
		courseDAO.save(course);
		return new ResponseEntity<String>("Course records added",HttpStatus.ACCEPTED);
	}
	public ResponseEntity<?> getCourses()
	{
		List<Course> courseList = courseDAO.findAll();
		return new ResponseEntity<List<Course>>(courseList,HttpStatus.OK);
	}
		
	public ResponseEntity<?> addcandidate(Candidate candidate){
		candidDAO.save(candidate);
		return new ResponseEntity<String>("Candidate records added",HttpStatus.ACCEPTED);
	}
	public ResponseEntity<?> getCandidates()
	{
		List<Candidate> candidateList = candidDAO.findAll();
		return new ResponseEntity<List<Candidate>>(candidateList,HttpStatus.OK);
	}
	
	public ResponseEntity<?> updateCandidate(Candidate candidate){
		candidDAO.save(candidate);		
		return new ResponseEntity<String>("candidate updated",HttpStatus.ACCEPTED);
	}
	
	public ResponseEntity<?> deleteCandidate(int id){
		Candidate candidate=candidDAO.findById(id).get();
		candidDAO.delete(candidate);
		return new ResponseEntity<String>("candidate deleted",HttpStatus.OK);
	}
	
	public List<Object[]> getCandidateCourseDetails() {
        return candidDAO.findCandidateCourseDetails();
	}
}