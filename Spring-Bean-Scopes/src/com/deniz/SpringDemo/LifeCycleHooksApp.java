package com.deniz.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleHooksApp {

	public static void main(String[] args) {
		

		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
	/*	Personel omer=context.getBean("omer", Personel.class);
		System.out.println(omer); */
		
		Personel deniz=context.getBean("deniz", Personel.class);
		System.out.println(deniz); 
		Personel deniz2=context.getBean("deniz", Personel.class);
		System.out.println(deniz2); 
		
		deniz.destroyPersonel();
		deniz2.destroyPersonel();
		
		//prototypede spring destroy yapmaz,biz kendimiz yapacagiz. singletonda kendisi destroy yapiyor.
		
		context.close();
	}

}
