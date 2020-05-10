package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {

	public static void main(String[] args) {
		

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Personel omer=context.getBean("omer", Personel.class);
		System.out.println(omer);
		Personel omer2=context.getBean("omer", Personel.class);	
		System.out.println(omer2);
		Personel deniz=context.getBean("deniz", Personel.class);
		System.out.println(deniz); 
		Personel deniz2=context.getBean("deniz", Personel.class);
		System.out.println(deniz2); 
		
		context.close();
	}

}
