package com.jdc.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.bindings.Student;
import com.jdc.entity.StudentEntity;
import com.jdc.repository.CourseRepository;
import com.jdc.repository.GenderRepository;
import com.jdc.repository.TimingsRepository;
import com.jdc.repository.studentRepository;

@Service
public class StudentService {

	@Autowired
	private CourseRepository courseRepo;

	@Autowired
	private GenderRepository genderRepo;

	@Autowired
	private TimingsRepository timingsRepo;
	
	@Autowired
	private studentRepository studentRepo;

	public List<String> getCourses() {

		List<String> courses = courseRepo.getCourseNames();

		return courses;

	}

	public List<String> getGenders() {

		List<String> genders = genderRepo.getGenderName();

		return genders;
	}

	public List<String> getTimings() {

		List<String> timings = timingsRepo.getTimings();

		return timings;
	}
	
	public boolean savestudent(Student student) {
		
		StudentEntity entity = new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);
		
		StudentEntity save = studentRepo.save(entity);
		
		return save !=null & save.getStudentId() !=null;
		
		
		
		
		
		
		
		
	}

}
