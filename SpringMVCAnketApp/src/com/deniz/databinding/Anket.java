package com.deniz.databinding;


import java.util.LinkedHashMap;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/* @Component
@Scope("prototype") */


public class Anket {
	
	private String firstName;
	private String lastName;
	private String department;
	private String gender;
	private String[] sideBenefits;
	private int age;
	private String city;
	private String mezuniyet;
	private String[] days;
	
	private LinkedHashMap<String, String> departments;
	private LinkedHashMap<String, String> cities;
	
	


	public Anket() {
		System.out.println("constructor");
		departments=new LinkedHashMap<String, String>();
		departments.put("HR", "Human Resourses");
		departments.put("AC", "Accounting");
		departments.put("SA","Sales");
		departments.put("SW","Software");
		
		cities=new LinkedHashMap<String, String>();
		cities.put("Adana","Adana");
		cities.put("Ankara","Ankara");
		cities.put("İstanbul","istanbul");
		cities.put("Bolu","Bolu");
		
	}


	public LinkedHashMap<String, String> getCities() {
		return cities;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String[] getSideBenefits() {
		return sideBenefits;
	}


	public void setSideBenefits(String[] sideBenefits) {
		this.sideBenefits = sideBenefits;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}



	public String getMezuniyet() {
		return mezuniyet;
	}


	public void setMezuniyet(String mezuniyet) {
		this.mezuniyet = mezuniyet;
	}


	public String[] getDays() {
		return days;
	}


	public void setDays(String[] days) {
		this.days = days;
	}


	public LinkedHashMap<String, String> getDepartments() {
		return departments;
	}
	
	
	
	

}
