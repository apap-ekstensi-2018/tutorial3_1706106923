package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(Optional <String> npm) {
		for(int aa = 0; aa < studentList.size(); aa++) {
			if(studentList.get(aa).getNpm().equals(npm)) {
				return studentList.get(aa);
			}
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}

}
