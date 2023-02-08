package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {

	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
//			class load using jdbc driver
			System.out.println("Driver Loaded successfully.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		try {
			EmployeePayroll emp=new EmployeePayroll();
			emp.returnlist(con);
			
			System.out.println("Add data Susseccfully showed.");			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
