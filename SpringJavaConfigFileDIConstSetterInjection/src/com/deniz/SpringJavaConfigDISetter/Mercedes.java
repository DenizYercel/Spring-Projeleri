package com.deniz.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Mercedes {
	String model;
	Motor motor;
	
	
/*	public Mercedes(Motor motor) {
		super();
		this.motor = motor;
		System.out.println("mercedes olusturuldu");
	}  */
	
	
	public void startVars(Motor motor) {
		model="500SEL";
		System.out.println("Autowired,startVars metodu");
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
