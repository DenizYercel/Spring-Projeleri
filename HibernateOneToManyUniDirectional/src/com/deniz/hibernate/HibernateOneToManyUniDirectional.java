package com.deniz.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.deniz.entity.Konu;
import com.deniz.entity.Kurs;
import com.deniz.entity.Ogretmen;
import com.deniz.entity.OgretmenDetay;

public class HibernateOneToManyUniDirectional {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Konu.class)
				.buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();

		
	/*	Ogretmen ogr=session.get(Ogretmen.class, 18);
		
		Kurs kurs =new Kurs(ogr, "programlama", 201);
		
		kurs.addKonu(new Konu("Basics", "kontroller,döngüler"));
		kurs.addKonu(new Konu("oop", "inheritance"));
		kurs.addKonu(new Konu("thread", "thread1,thread2"));
		
		session.save(kurs);  */
		
		
	//Listeleme	 Ogretmenin kurslarýný ve konularýný yazýyor.
		Ogretmen ogr =session.get(Ogretmen.class, 18);
		
	/*	for (int i = 0; i<ogr.getKurslar().size(); i++) {
			System.out.println(ogr.getKurslar().get(i).getKursAdi());
			
			for(int j=0;j<ogr.getKurslar().get(i).getKonular().size();j++) {
				System.out.println(ogr.getKurslar().get(i).getKonular().get(j));
			}
			
		}*/
		
	// foreach ile
		 for(Kurs kurs: ogr.getKurslar()) {	
			  System.out.println(kurs.getKursAdi());
			 for (Konu konu : kurs.getKonular()) {
				  System.out.println(konu); 
			  	} 
			  }

		
		session.getTransaction().commit(); 
		session.close();
		
	}

}
