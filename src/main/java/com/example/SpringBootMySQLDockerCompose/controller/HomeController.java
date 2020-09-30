package com.example.SpringBootMySQLDockerCompose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootMySQLDockerCompose.model.Student;
import com.example.SpringBootMySQLDockerCompose.repository.StudentRepository;



@RestController
@RequestMapping("/school")
public class HomeController {
	
	@Autowired
	private StudentRepository _repository;
	
	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return _repository.findAll();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student)
	{
		Student save = _repository.save(student);
		Student studentSaved = _repository.findByRollnumber(save.getRollnumber());
		return studentSaved;
				
	}

}
