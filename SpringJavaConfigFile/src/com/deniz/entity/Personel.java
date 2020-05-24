package com.deniz.entity;

public class Personel {

	private String isim;
	private int yas;
	
	
	public Personel() {
		System.out.println("personel constructor");
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	@Override
	public String toString() {
		return "Personel [isim=" + isim + ", yas=" + yas + "]";
	}
	
	
	
	
}
