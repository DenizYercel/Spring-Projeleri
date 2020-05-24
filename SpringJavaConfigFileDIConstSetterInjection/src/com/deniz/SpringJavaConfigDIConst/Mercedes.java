package com.deniz.SpringJavaConfigDIConst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Mercedes {
	
	
	private String model;
	
	private Motor motor;
	
	
	public Mercedes(String model,Motor motor) {
		super();
		this.model=model;
		this.motor = motor;
		System.out.println("mercedes olusturuldu");
	}  
	
	
	public Mercedes() {
		System.out.println("Mercedes, Default constructor");
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Motor getMotor() {
		return motor;
	}

	
	
	public void setMotor(Motor motor) {
		this.motor = motor;
		System.out.println("Set motor olusturuldu");
		System.out.println(motor);
	}

	
	public void getMotorInfo() {
		System.out.println("Motor :"+motor + 
				"\nGuc : " +  motor.getGuc() +
				"\nTork : " + motor.getTork());
	}

	
	
	

}
