package com.deniz.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mercedes {
	String model;
	
	@Autowired
	@Qualifier("dizelMotor")
	private Motor motor;
	//JAVA REFLECTION ILE YAPIYOR.
	
	
/*	public Mercedes(Motor motor) {
		super();
		this.motor = motor;
		System.out.println("mercedes olusturuldu");
	}  */
	
	

	
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

	
/*	@Autowired
	public void setMotor(Motor motor) {
		this.motor = motor;
		System.out.println("Set motor olusturuldu");
	}
 */
	
	public void getMotorInfo() {
		System.out.println("Motor :"+motor + 
				"\nGuc : " +  motor.getGuc() +
				"\nTork : " + motor.getTork());
	}

	
	
	

}
