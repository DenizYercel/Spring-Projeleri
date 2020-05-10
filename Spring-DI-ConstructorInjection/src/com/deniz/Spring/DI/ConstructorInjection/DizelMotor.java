package com.deniz.Spring.DI.ConstructorInjection;

public class DizelMotor implements Motor{
	
	public DizelMotor() {
		System.out.println("Dizel motor olusturuldu");
	}

	
	public int getMotorHacmi() {
		// TODO Auto-generated method stub
		return 1600;
	}

	
	public int getGuc() {
		// TODO Auto-generated method stub
		return 250;
	}

	
	public int getTork() {
		// TODO Auto-generated method stub
		return 150;
	}

	

}
