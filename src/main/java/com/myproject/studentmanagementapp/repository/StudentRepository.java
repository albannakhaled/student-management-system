package com.myproject.studentmanagementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.studentmanagementapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
	
}
