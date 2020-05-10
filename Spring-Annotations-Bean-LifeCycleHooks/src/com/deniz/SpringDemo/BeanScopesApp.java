package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {

	public static void main(String[] args) {
		

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Personel deniz=context.getBean("personel", Personel.class);
		System.out.println(deniz);
		context.close();
	}

}
