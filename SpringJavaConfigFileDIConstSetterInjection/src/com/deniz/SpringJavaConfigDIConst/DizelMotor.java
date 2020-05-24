package com.deniz.SpringJavaConfigDIConst;

import org.springframework.stereotype.Component;

@Component
public class DizelMotor implements Motor{
	
	public DizelMotor() {
		System.out.println("Dizel motor olusturuldu");
	}

	@Override
	public int getMotorHacmi() {
		// TODO Auto-generated method stub
		return 1600;
	}

	@Override
	public int getGuc() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public int getTork() {
		// TODO Auto-generated method stub
		return 150;
	}

	

}
