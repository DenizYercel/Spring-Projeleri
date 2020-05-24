package com.deniz.SpringDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigSetterInjectionApp {

	public static void main(String[] args) {
		

		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Mercedes E200=context.getBean("mercedes", Mercedes.class);
		E200.getMotorInfo();
		
		

	}

}
