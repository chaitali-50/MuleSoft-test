package com.mulesoft.test.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulesoft.test.entity.Students;
import com.mulesoft.test.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Students saveStudent(Students student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public List<Students> fetchStudentsList() {
		// TODO Auto-generated method stub
		return (List<Students>) studentRepository.findAll();
	}
	
	@Override
	public Students fetchStudentDetails(Long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Students updateStudentDetails(Long id, Students student) {
		// TODO Auto-generated method stub
		Students studentUpdation = studentRepository.findById(id).get();
		
		if(Objects.nonNull(student.getName())) {
			studentUpdation.setName(student.getName());
		}
		
		if(Objects.nonNull(student.getFaculty())) {
			studentUpdation.setFaculty(student.getFaculty());
		}
		
		return studentRepository.save(studentUpdation);
		
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
	
	
}
