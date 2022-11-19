package com.jdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc.bindings.Student;
import com.jdc.entity.StudentEntity;
import com.jdc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;

	@GetMapping("/student")
	public String loadForm(Model model) {

		/*
		 * List<String> genders = studentservice.getGenders();
		 * 
		 * List<String> courses = studentservice.getCourses();
		 * 
		 * List<String> timings = studentservice.getTimings();
		 */

		model.addAttribute("genders", studentservice.getGenders());
		model.addAttribute("courses", studentservice.getCourses());
		model.addAttribute("timings", studentservice.getTimings());

		model.addAttribute("student", new StudentEntity());

		return "studentReg";

	}

	@PostMapping("/savestudent")
	public String saveStudent(Student student) {

		studentservice.savestudent(student);

		System.out.println(student);

		return "regsuccess";

	}

}
