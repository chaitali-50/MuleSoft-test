package com.mulesoft.test.service;

import java.util.List;
import java.util.Optional;

import com.mulesoft.test.entity.Students;

public interface StudentService {

	// Create Operation
	// Saving the student details in DB
	Students saveStudent(Students student);
	
	// Read Operation
	// Fetching all the Student details
	List<Students> fetchStudentsList();
	
	// Update Operation
	// Updating the student details
	Students updateStudentDetails(Long id, Students student);
	
	// Delete Operation
	// Deleting the student from DB
	void deleteStudent(Long id);

	Students fetchStudentDetails(Long id);

}
