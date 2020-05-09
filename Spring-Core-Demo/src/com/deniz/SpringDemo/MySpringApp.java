package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
	
	
	ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
	
	Arac araba =context.getBean("araba", Otomobil.class);
	
	araba.hizlan(10);
	
	
	Arac bus=context.getBean("bus", Otobus.class);
	bus.hizlan(50);
	
	context.close();
	
	

}
}