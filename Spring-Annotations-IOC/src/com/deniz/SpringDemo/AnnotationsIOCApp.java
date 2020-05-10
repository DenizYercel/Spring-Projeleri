package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsIOCApp {

	public static void main(String[] args) {
		

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Personel p=context.getBean("personel", Personel.class);
		p.setIsim("deniz");
		p.setSoyisim("yercel");
		
		System.out.println(p);
		
		
		
	}

}
