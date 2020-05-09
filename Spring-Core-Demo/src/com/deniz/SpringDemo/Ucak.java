package com.deniz.SpringDemo;

public class Ucak implements Arac{
	
	int hiz;

	public Ucak(int guc) {
		super();
		this.hiz = guc;
	}

	public int getGuc() {
		return hiz;
	}

	public void setGuc(int guc) {
		this.hiz = guc;
	}

	@Override
	public int hizlan(int degisim) {
		this.hiz+=degisim;
		System.out.println("Otomobilin yeni hizi" + degisim);

		return this.hiz;
	}

	@Override
	public int yavasla(int degisim) {
		this.hiz-=degisim;
		System.out.println("Otomobilin yeni hizi" + degisim);

		return this.hiz;
	}
	
	

}
