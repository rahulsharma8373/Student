package com.student.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.ServiceI;
import com.student.service.StudentService;

@RestController
public class StudentController {
@Autowired(required = true)
	private ServiceI s;
	

@PostMapping("/addStudent")
public Student addStudent(@RequestBody Student student) {
    return s.saveStudent(student);
}

@PostMapping("/addstudents")
public List<Student> addStudent(@RequestBody List<Student> students) {
    return s.saveStudents(students);
}

@GetMapping("/students")
public List<Student> findAllStudents() {
    return s.getStudents();
}

@GetMapping("/studentById/{id}")
public Student findProductById(@PathVariable int id) {
    return s.getStudentById(id);
}

//@GetMapping("/student/{name}")
//public Student findStudent(@PathVariable String name) {
//    return s.getStudentByName(name);
//}

@PutMapping("/update")
public Student updateProduct(@RequestBody Student product) {
    return s.updateStudent(product);
}

@DeleteMapping("/delete/{id}")
public String deletestudent(@PathVariable int id) {
    return s.deleteStudent(id);
}
	
	
}
