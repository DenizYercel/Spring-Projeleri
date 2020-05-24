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
		
		session.beginTransaction();
		
		Ogretmen ogretmen=session.get(Ogretmen.class, 5);
		
		session.delete(ogretmen);
		
		
		session.getTransaction().commit(); 
		
		session.close();
		
	}

}
