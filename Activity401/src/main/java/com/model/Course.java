package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	private int duration;
	
//	@OneToMany
//    private List<Candidate> candidates;
	public Course() {}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseNAme() {
		return courseName;
	}
	
//	public List<Candidate> getCandidates() {
//		return candidates;
//	}
//	public void setCandidates(List<Candidate> candidates) {
//		this.candidates = candidates;
//	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseNAme=" + courseName + ", duration=" + duration + "]";
	}
	
	
	

}