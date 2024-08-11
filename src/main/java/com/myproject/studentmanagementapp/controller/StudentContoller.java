package com.myproject.studentmanagementapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.studentmanagementapp.dto.StudentDto;
import com.myproject.studentmanagementapp.dto.StudentSaveDto;
import com.myproject.studentmanagementapp.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/student")
public class StudentContoller {
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping(path="/addStudent")
	public ResponseEntity<Map<String, Object>> saveStudent(@RequestBody StudentSaveDto studentSaveDto) {
	    String name = studentService.addStudent(studentSaveDto);
	    
	    Map<String, Object> response = new HashMap<>();
	    response.put("status", "success");
	    response.put("message", "Student added successfully");
	    response.put("name", name);
	    
	    return ResponseEntity.status(HttpStatus.CREATED)
	                         .header("Custom-Header", "Value")
	                         .body(response);
	}
	
	@GetMapping(path = "/getAllStudent")
	public List<StudentDto> getAllStudents(){
	    List<StudentDto> listStudent = studentService.getAllStudents();
	    return listStudent;
	}
	
}
