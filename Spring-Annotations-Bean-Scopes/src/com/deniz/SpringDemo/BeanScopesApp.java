package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesApp {

	public static void main(String[] args) {
		

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		//singleton
		Personel deniz=context.getBean("personel", Personel.class);
		Personel oya=context.getBean("personel", Personel.class);
		System.out.println(deniz);
		System.out.println(oya);
		System.out.println("esit mi ? " +(deniz==oya));
		
		System.out.println();
		System.out.println();
		
		//prototype
		Ogrenci ali=context.getBean("ogrenci", Ogrenci.class);
		Ogrenci pinar=context.getBean("ogrenci", Ogrenci.class);
		System.out.println(ali);
		System.out.println(pinar);
		System.out.println("acaba esit mi ? "+(ali==pinar));
		
		ali.destroyOgrenci();
		pinar.destroyOgrenci();
		
		context.close();

		
	}

}
