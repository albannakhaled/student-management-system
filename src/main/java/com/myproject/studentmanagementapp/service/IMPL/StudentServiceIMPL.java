package com.myproject.studentmanagementapp.service.IMPL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.studentmanagementapp.dto.StudentDto;
import com.myproject.studentmanagementapp.dto.StudentSaveDto;
import com.myproject.studentmanagementapp.entity.Student;
import com.myproject.studentmanagementapp.repository.StudentRepository;
import com.myproject.studentmanagementapp.service.StudentService;
@Service
public class StudentServiceIMPL implements StudentService{
	@Autowired
	private StudentRepository rStudentRepository;
	
	@Override
	public String addStudent(StudentSaveDto saveStudentDto) {
		Student student = new Student(
				saveStudentDto.getStudentName(),
				saveStudentDto.getStudentPhoneNumber(),
				saveStudentDto.getStudentAddress()
				);
		
		rStudentRepository.save(student);	
		return student.getStudentName();
	}
		
	@Override
	public List<StudentDto> getAllStudents(){
	    List<Student> getStudents = rStudentRepository.findAll();
	    List<StudentDto> studentDtos = new ArrayList<StudentDto>();
	    for(Student std : getStudents) {
	        StudentDto stdDto = new StudentDto(
	                std.getStudentId(),
	                std.getStudentName(),
	                std.getStudentPhoneNumber(),
	                std.getStudentAddress()
	                );
	        studentDtos.add(stdDto);
	    }
	    return studentDtos;
	}
	
}
