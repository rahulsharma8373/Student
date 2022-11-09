package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;


@Repository
@EnableJpaRepositories("com.student.repository")
public interface StudentRepository extends JpaRepository<Student, Integer> {

	

//	Student findByName(String name);

	

}
