package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Candidate;

@Repository
public interface Candidatedao extends JpaRepository<Candidate,Integer>{
	@Query("SELECT c.candidateName, co.courseName, co.duration FROM Candidate c JOIN c.course co")
    List<Object[]> findCandidateCourseDetails();
}