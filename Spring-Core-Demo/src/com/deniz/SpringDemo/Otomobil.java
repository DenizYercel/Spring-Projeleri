package com.deniz.SpringDemo;

public class Otomobil implements Arac {
	
	String marka;
	int hiz=0;
	
	public int hizlan(int degisim) {
		this.hiz+=degisim;
		System.out.println("Otomobilin yeni hizi " + degisim);

		return this.hiz;
	}
	
	
	
	
	public Otomobil() {
		super();
		System.out.println("hiii");
	}




	public Otomobil(String marka) {
		super();
		this.marka = marka;
		System.out.println(marka +" marka otomobil olu�turuldu.");
	}
	
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
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
		System.out.println("Otomobilin yeni hizi" + degisim);

		return this.hiz;
	}
	
	

}
