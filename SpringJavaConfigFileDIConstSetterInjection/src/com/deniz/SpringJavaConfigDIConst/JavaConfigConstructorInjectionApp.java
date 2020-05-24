package com.deniz.SpringJavaConfigDIConst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigConstructorInjectionApp {

	public static void main(String[] args) {
		

		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Mercedes E200=context.getBean("mercedes", Mercedes.class);
		E200.getMotorInfo();
		System.out.println(E200.getModel());
		
		

	}

}
