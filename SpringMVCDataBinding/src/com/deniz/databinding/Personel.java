package com.deniz.databinding;

public class Personel {
	
	private String firstName;
	private String lastName;
	
	
	public Personel() {
		System.out.println("constructor");
	}
	
	public String getFirstName() {
		System.out.println("getname");
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("setname");
		this.firstName = firstName;
	}
	public String getLastName() {
		System.out.println("getlast");
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("setlast");
		this.lastName = lastName;
	}
	
	

}
