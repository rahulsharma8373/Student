package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService implements ServiceI{
@Autowired
	private StudentRepository repo;
	
	public Student saveStudent(Student student) {
		return repo.save(student);
	}
	
	
	
	 public List<Student> saveStudents(List<Student> students) {
	        return repo.saveAll(students);
	
	 }	
	 
	 public List<Student> getStudents() {
	        return repo.findAll();
	 }
	 
	 public Student getStudentById(int id) {
	        return repo.findById(id).orElse(null);
	    }


//	    public Student getStudentByName(String name) {
//	        return repo.findByName(name);
//	
//}
	    public String deleteStudent(int id) {
	        repo.deleteById(id);
	        return "student removed !! " + id;
	    }
	    
	    
	    public Student updateStudent(Student student) {
	       Student existingStudent = repo.findById(student.getSt_id()).orElse(null);
	        existingStudent.setCityname(student.getCityname());
	        existingStudent.setAdd(student.getAdd());
	       // existingProduct.setPrice(product.getPrice());
	        return repo.save(existingStudent);
	    
	    
	    
	    }   
	  
	    
}