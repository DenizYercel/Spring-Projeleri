package com.deniz.Spring.DI.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContInjectionApp {

	public static void main(String[] args) {
		
/*		Motor motor =new DizelMotor();
		Mercedes m=new Mercedes(motor);  */
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Mercedes mercedes=context.getBean("mercedes", Mercedes.class);
		mercedes.getMotorInfo();
		
		Mercedes mercedes190D=context.getBean("mercedes190D", Mercedes.class);
		mercedes190D.getMotorInfo();

	}

}
