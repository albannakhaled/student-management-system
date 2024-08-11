package com.myproject.studentmanagementapp.service;

import java.util.List;

import com.myproject.studentmanagementapp.dto.StudentDto;
import com.myproject.studentmanagementapp.dto.StudentSaveDto;
import com.myproject.studentmanagementapp.entity.Student;

public interface StudentService {
	// add student to database
	public String addStudent(StudentSaveDto saveStudentDto);
	
	// get all student
	public List<StudentDto> getAllStudents();
}
