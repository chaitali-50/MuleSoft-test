package com.mulesoft.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mulesoft.test.entity.Students;
import com.mulesoft.test.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	// CREATE operation
	@PostMapping("/students/add")
	public Students addStudent(@RequestBody Students student) {
		return studentService.saveStudent(student);

	}

	// READ operation
	@GetMapping("/students/all")
	public List<Students> fetchAllStudents() {
		return studentService.fetchStudentsList();
		
	}
	
	@GetMapping("/students/{id}")
	public Students fetchStudentDetails(@PathVariable("id") Long id) {
		return studentService.fetchStudentDetails(id);
	}

	// UPDATE OPERATION
	@PutMapping("/students/update")
	public Students updateStudent(@RequestParam Long id, @RequestBody Students student) {
		return studentService.updateStudentDetails(id, student);
		
	}

	// DELETE operation
	@DeleteMapping("/students/delete/{id}")
	public void deleteStudent(@PathVariable("id") Long id) {
		studentService.deleteStudent(id);

	}

}
