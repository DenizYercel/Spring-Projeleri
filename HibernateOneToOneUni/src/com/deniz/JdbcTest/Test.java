package com.deniz.JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/deneme";
		String user="root";
		String password="12345";
		
		try {
			Connection myConnection=DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("baðlandi.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
