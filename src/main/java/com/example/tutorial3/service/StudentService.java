package com.example.tutorial3.service;

import java.util.List;
import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(Optional<String> npm);
	
	List<StudentModel> selectAllStudents();
	
	void addStudent(StudentModel student);
	
}
