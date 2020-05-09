package com.deniz.Loose;

public class AracFactory {

	public static Arac getArac(String tip) {
		if(tip.equals("3")) {
			return new Otomobil("Mercedes");
		}
		else if(tip.equals("2")) {
			return new Otobus(40);
		}
		else if(tip.equals("1")) {
			return new Ucak(500);
		}
		else 
			return null;
		
	}
	
}
