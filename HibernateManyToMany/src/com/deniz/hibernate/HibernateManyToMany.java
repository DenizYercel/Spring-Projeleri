package com.deniz.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.deniz.entity.Kurs;
import com.deniz.entity.Ogrenci;
import com.deniz.entity.Ogretmen;
import com.deniz.entity.OgretmenDetay;

public class HibernateManyToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ogrenci.class)
				.buildSessionFactory();
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();

		
		
		Kurs kurs=session.get(Kurs.class, 28);
		
	/*	Ogrenci ogrenci1=new Ogrenci("orhan", "veli", 99);
		Ogrenci ogrenci2=new Ogrenci("veli", "týrt", 98);
		
		kurs.addOgrenci(ogrenci1);
		kurs.addOgrenci(ogrenci2);
		
		session.save(kurs);  */
		
	/*	Ogrenci ogrenci=session.get(Ogrenci.class, 2);
		for (Kurs kurs1 : ogrenci.getKurslar()) {
			System.out.println(kurs.getKursAdi());
		}*/
		
	
		session.getTransaction().commit(); 
		session.close();
		
	}

}
