package com.deniz.SpringIOC;

public class OgretmenApp {
	public static void main(String[] args) {
		
		Ogretmen hoca =new TurkceOgretmeni();
		
		hoca.neDersin();
		
		Ogretmen hoca1=new FenOgretmeni();
		hoca1.neDersin();
		
	}

}
