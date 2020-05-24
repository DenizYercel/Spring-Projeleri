package com.deniz.aop.entity;



public class Student {
	
	private String isim;
	private String soyisim;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	
	public Student() {
		super();
	}

	public Student(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public void setAdSoyad(String isim,String soyisim) {
		this.isim=isim;
		this.soyisim=soyisim;
	}
	
	public String getAdSoyad() {
		return this.isim+" "+this.soyisim;
	}
	
	
	public Student getKanka() {
		Student x=new Student("veli", "deli");
		return x;
	}
	
	

}
