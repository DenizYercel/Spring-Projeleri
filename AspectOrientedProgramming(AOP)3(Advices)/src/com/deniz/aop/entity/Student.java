package com.deniz.aop.entity;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String isim;
	private String soyIsim;
	private int id;
	
	
	
	
	public Student() {
		super();
	}

	
	
	public Student(String isim, String soyIsim, int id) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.id = id;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		
		//throw new RuntimeException("Hata oluþuyor getIsim");
		System.out.println("getIsim");
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	public String getNameSurname() {
		
	//	if(this.isim!=null) {
		throw new RuntimeException("Hata oluþuyor ad soyad");
	//	}
		
	//	return this.isim+" "+this.soyIsim;
		
	}

	
	
	

}
