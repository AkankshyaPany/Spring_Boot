package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entity.Course;

@Repository
public interface coursedao extends JpaRepository<Course,Long>{
	
}
