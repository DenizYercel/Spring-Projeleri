package com.deniz.SpringIOC;

public class FenOgretmeni implements Ogretmen{
	
	String isim;
	
	

	public FenOgretmeni(String isim) {
		super();
		this.isim = isim;
	}
	
	
	
	public FenOgretmeni() {
		System.out.println("Fen olusturuluyor");
	}



	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}



	
	public void neDersin() {	
			System.out.println("fen dersine  gelin.");
	}
	
	
	

}
