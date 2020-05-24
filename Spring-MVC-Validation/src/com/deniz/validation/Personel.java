package com.deniz.validation;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.deniz.validationn.RestDay;

public class Personel {
	
		//1.adým bunu belirlemek
		@NotEmpty(message = "Bu alan bos birakilamaz")
		private String firstName;
		
		private String lastName;
		
		@Min(value=1000,message="minimum maas bindir")
		@Max(value=10000,message="maksimum on bindir")
		private Integer salary;
		
		@RestDay
		String restDay;
		
		private String department;
		private String gender;
		private String[] sideBenefits;
		
		private LinkedHashMap<String, String> departments;
		
		@Pattern(regexp ="^[a-zA-Z0-9]{5}",message = "Posta kodunu düzgün giriniz.")
		private String postalCode;
		
		
		public Personel() {
			System.out.println("constructor");
			departments=new LinkedHashMap<String, String>();
			departments.put("HR", "Human Resourses");
			departments.put("AC", "Accounting");
			departments.put("SA","Sales");
			departments.put("SW","Software");
			
		}
		
		
		public String getRestDay() {
			return restDay;
		}


		public void setRestDay(String restDay) {
			this.restDay = restDay;
		}


		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}


		public String getPostalCode() {
			return postalCode;
		}


		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}


		public String[] getSideBenefits() {
			return sideBenefits;
		}


		public void setSideBenefits(String[] sideBenefits) {
			this.sideBenefits = sideBenefits;
		}


		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public LinkedHashMap<String, String> getDepartments() {
			return departments;
		}


		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
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
