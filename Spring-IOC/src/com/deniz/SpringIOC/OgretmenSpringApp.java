package com.deniz.SpringIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OgretmenSpringApp {

	public static void main(String[] args) {
		
		
		System.out.println("merhaba");
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Ogretmen hoca=context.getBean("turkceci", Ogretmen.class);
		hoca.neDersin();
		
		hoca=context.getBean("fenci", Ogretmen.class);
		hoca.neDersin();
		System.out.println("gule gule");
		

	/*	JavaOgretmeni hoca1=context.getBean("javaci", JavaOgretmeni.class);
		hoca1.selamla(); */
		
		

	}

}
