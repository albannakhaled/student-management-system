package com.myproject.studentmanagementapp.dto;


public class StudentDto {
	private long studentId;
	private String studentName;
	private String studentAddress;
	private String studentPhoneNumber;
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public StudentDto(long studentId, String studentName, String studentAddress, String studentPhoneNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNumber = studentPhoneNumber;
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
