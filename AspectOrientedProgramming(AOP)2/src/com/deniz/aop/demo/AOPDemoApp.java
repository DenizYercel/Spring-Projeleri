package com.deniz.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deniz.aop.dao.StudentDAO;
import com.deniz.aop.entity.Student;

public class AOPDemoApp {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		
		System.out.println("context started");
		
		StudentDAO stdntDao= context.getBean("studentDAO",StudentDAO.class);
		
		
	//	stdntDao.addStudent(new Student("deniz"));
		
	//	stdntDao.getStudent("deniz");
		
		Student student=context.getBean("student",Student.class);
	//	student.setIsim("deniz");
	//	System.out.println(student.getIsim());
		
	//	student.getAdSoyad();
		
		Student kanka=student.getKanka();
		
		System.out.println(kanka.getAdSoyad());
		
		context.close();
	
		System.out.println("context closed");
	}

}
