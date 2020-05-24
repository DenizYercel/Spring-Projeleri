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
	

	
	
}
