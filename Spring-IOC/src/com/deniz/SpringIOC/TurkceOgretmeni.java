package com.deniz.SpringIOC;

public class TurkceOgretmeni implements Ogretmen{
	
	String isim;
	
	
	

	public TurkceOgretmeni() {
		System.out.println("T�rkce olusturuluyor");
	}

	public TurkceOgretmeni(String isim) {
		super();
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void neDersin() {
		System.out.println("derse gelin.");
	}
	
	

}
