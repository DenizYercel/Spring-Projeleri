package com.deniz.aop.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.deniz.aop.entity.Student;




@Configuration
@ComponentScan("com.deniz")
@EnableAspectJAutoProxy
public class AOPDemoConfig {
	
	@Bean
	public Student student() {
		return new Student("deniz","yercel");
		
	}
	
	@Bean
	public Student a() {
		return new Student();
	}
	
	@Bean
	public Student student(String i,String s) {
		return new Student(i,s);
		
	}
	
	
}
