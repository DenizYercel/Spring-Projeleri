package com.deniz.tight;

import com.deniz.Loose.Arac;

public class Otobus implements Arac{
	
	int kapasite;
	int hiz=0;
	
	
	
	public Otobus(int kapasite) {
		super();
		this.kapasite= kapasite;
		System.out.println(kapasite +" kapasiteli otob�s olu�turuldu.");
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
		System.out.println(kapasite +" h�zland�");
		return this.hiz;
	}

}
