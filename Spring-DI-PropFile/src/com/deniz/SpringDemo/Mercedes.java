package com.deniz.SpringDemo;

public class Mercedes {
	private String model;
	private Motor motor;
	
	
	public Mercedes(Motor motor) {
		super();
		System.out.println("mercedes olusturuldu");
	}
	public Mercedes() {
		
	}
	
	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
		System.out.println("mercedesin modeli :"+model);
	}


	public Motor getMotor() {
		return motor;
	}


	public void setMotor(Motor motor) {
		this.motor = motor;
		System.out.println("Mercedes'in motoru "+motor);
	}

	public void getMotorInfo() {
		System.out.println("Motor :"+motor + 
				"\nGuc : " +  motor.getGuc() +
				"\nTork : " + motor.getTork());
	}
	
	
	@Override
	public String toString() {
		return "Mercedes [model=" + model + ", motor=" + motor + "]";
	}
	

}
