package com.deniz.aop.dao;

import org.springframework.stereotype.Repository;

import com.deniz.aop.entity.Student;

@Repository
public class StudentDAO{

	
	public void addStudent(Student s) {
		System.out.println("addStudent called");
		
	}
	
	public Student getStudent(String name) {
		System.out.println("getStudent called");
		return new Student();
	}

	
	public void deleteStudent(Student s) {
		System.out.println("deleteStudent called");
		
	}

	
	public Student queryStudent() {
		System.out.println("queryStudent called");
		return new Student();
	}

}
