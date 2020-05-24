package com.deniz.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.deniz.entity.Kurs;
import com.deniz.entity.Ogretmen;
import com.deniz.entity.OgretmenDetay;

public class HibernateOneToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();

	/*	Ogretmen ogretmen=new Ogretmen(null, "denz", "denz", "yrcl@gmail.com");
		
		ogretmen.addKurs(new Kurs(ogretmen, "JAVAEE", 500));
		ogretmen.addKurs(new Kurs(null, "ORACLEEE", 200));
		ogretmen.addKurs(new Kurs(null, "WEBDESIGNER", 150));
		
		session.save(ogretmen);  */
		
	/*	Ogretmen ogr=session.get(Ogretmen.class, 25);
		
		session.delete(ogr); */
		
		
	/*	List<Kurs> kurs= session.createQuery("from Ogretmen where id=27").getResultList();
		
		for (Kurs kurs2 : kurs) {
			System.out.println(kurs2.getKursAdi());
		}
		*/
		
		Ogretmen ogr=session.get(Ogretmen.class, 27);   // buradan aþagýsý silip güncelleme yapýyor
		
		Kurs k=ogr.getKurslar().get(0);
		ogr.getKurslar().remove(0); // burasý arraylist siliyor ama hibernate araþtýr
		session.remove(k); // burasý db'den hareket ediyor
		
		Kurs k2=ogr.getKurslar().get(0);
		k2.setKursAdi("DB3");
		session.save(k2);
		
		session.save(ogr); 
		
		session.getTransaction().commit(); 
		
		session.close();
		
	}

}
