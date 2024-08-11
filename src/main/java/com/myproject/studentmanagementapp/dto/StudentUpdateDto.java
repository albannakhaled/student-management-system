package com.myproject.studentmanagementapp.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class StudentUpdateDto {
	private long studentId;
	private String studentName;
	private String studentAddress;
	private String studentPhoneNumber;

}
