package com.myproject.studentmanagementapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="student_id",length = 11)
	private long studentId;
	
	@Column(name="student_name",length = 100)
	private String studentName;
	@Column(name="student_address",length = 60)
	private String studentAddress;
	@Column(name="student_phone",length = 15)
	private String studentPhoneNumber;
	public Student() {
		
	}
	public Student(String studentName, String studentAddress, String studentPhoneNumber) {
		super();	
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNumber = studentPhoneNumber;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}
	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}
	
	
}
