package com.deniz.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deniz.aop.dao.StudentDAO;
import com.deniz.aop.entity.Student;

public class AOPDemoApp {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		
		System.out.println("context started");
		
	//	StudentDAO stdntDao= context.getBean("studentDAO",StudentDAO.class);
		
		
	//	stdntDao.addStudent(new Student());
		
	//	stdntDao.getStudent("deniz");
		
		Student student=context.getBean("student",Student.class);
		student.setIsim("deniz");
		
		
		
	/*	try {
			System.out.println(student.getIsim());
		//	System.out.println(student.getNameSurname());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		*/
		
	/*	try {
		//	System.out.println(student.getIsim());
			System.out.println(student.getNameSurname());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		*/
		
		System.out.println(student.getIsim());
		
		context.close();
	
		System.out.println("context closed");
	}

}
