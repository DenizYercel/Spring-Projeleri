package com.deniz.Spring.DI.ConstructorInjection;

public class Mercedes {
	String model;
	Motor motor;
	
	
	public Mercedes(Motor motor) {
		super();
		this.motor = motor;
		System.out.println("mercedes olusturuldu");
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
	}

	public void getMotorInfo() {
		System.out.println("Motor :"+motor + 
				"\nGuc : " +  motor.getGuc() +
				"\nTork : " + motor.getTork());
	}

	
	
	

}
