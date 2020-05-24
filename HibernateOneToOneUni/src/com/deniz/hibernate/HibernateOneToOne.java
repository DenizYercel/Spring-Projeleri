package com.deniz.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.deniz.entity.Ogretmen;
import com.deniz.entity.OgretmenDetay;

public class HibernateOneToOne {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		
		OgretmenDetay ogDetay=new OgretmenDetay("java", "futbol", "http:/deniz3", "http://fb.me");
		
		Ogretmen ogr=new Ogretmen(ogDetay, "deniz", "yercel", "denizyercel3@gmail.com");
		
		
		session.beginTransaction();
	//	session.save(ogDetay);
		session.save(ogr);
		session.getTransaction().commit(); 
		
		session.close();
		
	}

}
