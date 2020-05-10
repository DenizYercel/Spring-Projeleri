package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonelApp {

	public static void main(String[] args) {
		
/*		Motor motor =new DizelMotor();
		Mercedes m=new Mercedes(motor);  */
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Mercedes mercedes=context.getBean("mercedes", Mercedes.class);
	//	mercedes.getMotorInfo();
		System.out.println(mercedes);

	}

}
