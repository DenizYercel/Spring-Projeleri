package com.deniz.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class BenzinliMotor implements Motor{

	
	public BenzinliMotor() {
		System.out.println("Benzinli motor olusturuldu");
	}

	@Override
	public int getMotorHacmi() {
		
		return 1;
	}

	@Override
	public int getGuc() {
		return 2;
	}

	@Override
	public int getTork() {
		return 3;
	}
	
	

}
