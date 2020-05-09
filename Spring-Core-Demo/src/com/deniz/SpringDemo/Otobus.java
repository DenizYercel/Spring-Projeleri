package com.deniz.SpringDemo;

import com.deniz.SpringDemo.Arac;

public class Otobus implements Arac{
	
	int kapasite;
	int hiz=0;
	
	
	
	public Otobus(int kapasite) {
		super();
		this.kapasite= kapasite;
		System.out.println(kapasite +" kapasiteli otob�s olu�turuldu.");
	}
	
	
	
	
	
	
	public Otobus() {
		super();
		System.out.println("ben gider...");
	}






	public int getKapasite() {
		return kapasite;
	}


	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}


	public int getHiz() {
		return hiz;
	}
	
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}


	@Override
	public int yavasla(int degisim) {
		this.hiz-=degisim;
		System.out.println(kapasite +" yavaslad�");
		return this.hiz;
	}




	@Override
	public int hizlan(int degisim) {
		this.hiz+=degisim;
		System.out.println(this.hiz +" h�zland�");
		return this.hiz;
	}

}
