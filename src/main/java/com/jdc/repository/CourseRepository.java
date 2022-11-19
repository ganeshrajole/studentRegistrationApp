package com.jdc.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jdc.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable>{

	@Query("select courseName from Course")
	public List<String> getCourseNames();
}
