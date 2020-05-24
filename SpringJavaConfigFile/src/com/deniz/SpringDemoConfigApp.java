package com.deniz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.deniz.entity.Ogrenci;
import com.deniz.entity.Personel;

public class SpringDemoConfigApp {
	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringDemoConfig.class);
		
		Personel denizy=context.getBean("deniz", Personel.class);
		
		System.out.println(denizy);
		
		Personel x=context.getBean("personel", Personel.class);
		System.out.println(x);
		
		
		Ogrenci o =context.getBean("ogrenci", Ogrenci.class);
		System.out.println(o);
	}
	
}
