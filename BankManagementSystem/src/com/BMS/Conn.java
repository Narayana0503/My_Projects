package com.BMS;

import java.sql.*;

public class Conn {
	
	Connection con;
	
	Statement s;
	
	public Conn() {
		
		String url = "jdbc:mysql://localhost:3306/BankManagmentSystems";
		
		String uName = "root";
		
		String pass = "";
		
		
		
		try {
			 con = DriverManager.getConnection(url,uName,pass);
			
			 s = con.createStatement();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		
	}

	
}
