package com.deniz.Loose;

public class LooseCouplingApp {

	public static void main(String[] args) {
		
	//	Arac araba=new Otomobil("Mercedes");
		Arac araba=AracFactory.getArac("3");
		araba.hizlan(20); 
		
	//	araba=new Otobus(50);
		araba=AracFactory.getArac("2");
		araba.hizlan(40);
		araba.hizlan(22);
		
		araba=AracFactory.getArac("1");
		araba.hizlan(14);
		
	}
	
}
