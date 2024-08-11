package com.myproject.studentmanagementapp.dto;



public class StudentSaveDto {
	private String studentName;
	private String studentAddress;
	private String studentPhoneNumber;
	public String getStudentName() {
		return studentName;
	}
	public StudentSaveDto() {
		super();
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
