package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContInjectionApp {

	public static void main(String[] args) {
		

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Mercedes E200=context.getBean("mercedes", Mercedes.class);
		E200.getMotorInfo();
		
		

	}

}
