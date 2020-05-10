package com.deniz.Spring.DI.SetterInjection;

public class DizelMotor implements Motor{
	
	public DizelMotor() {
		System.out.println("Dizel motor olusturuldu");
	}

	
	public int getMotorHacmi() {
		
		return 1600;
	}

	
	public int getGuc() {
		
		return 250;
	}

	
	public int getTork() {
		
		return 150;
	}


	@Override
	public String toString() {
		return "DizelMotor [getMotorHacmi()=" + getMotorHacmi() + ", getGuc()=" + getGuc() + ", getTork()=" + getTork()
				+ ", getClass()=" + getClass() +" toString()=" + super.toString()
				+ "]";
	}

	
	

}
