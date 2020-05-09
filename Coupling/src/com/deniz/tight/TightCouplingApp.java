package com.deniz.tight;

public class TightCouplingApp {

	public static void main(String[] args) {
		
		Otomobil oto1=new Otomobil("Mercedes");
		oto1.hizlan(20); 
		
		Otobus bus=new Otobus(50);
		bus.hizlan(40);
		bus.hizlan(22);
		
	}
	
}
