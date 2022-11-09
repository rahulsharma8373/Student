package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface ServiceI {

	Student saveStudent(Student student);
	List<Student> saveStudents(List<Student> students);
	 List<Student> getStudents();
	 Student getStudentById(int id);
//	 Student getStudentByName(String name);
	 String deleteStudent(int id);
	 Student updateStudent(Student student);
}
