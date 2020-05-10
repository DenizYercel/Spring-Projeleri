package com.deniz.SpringDemo;

public class Personel {
	private String isim;
	private String soyisim;
	
	
	public Personel(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		System.out.println("ikili constructor");
	}

	
	
	public Personel() {
		System.out.println("default constructor");
	}



	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public String getSoyisim() {
		return soyisim;
	}


	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public void initPersonel() {
		System.out.println("Personel init method");
	}
	
	public void destroyPersonel() {
		System.out.println("Personel destroy method");
	}
	
	

}
