package com.deniz.SpringIOC;

public class JavaOgretmeni{
	String isim;

	
	
	
	public JavaOgretmeni() {
		System.out.println("java ogretmeni olusturuluyor");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void selamla() {
		System.out.println("ARKADASLAR MESAIMIZ VARDI..");
	}

	

}
