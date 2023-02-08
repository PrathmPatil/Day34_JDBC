package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

public class EmployeePayroll {
	
	public void returnlist(Connection con)
	{	
		String url="jdbc:mysql://localhost:3306/employeepayrolldb";
//		api:database:server:port:databaseName
		String userName="root";
		String pass="Patil@2000";
		
	try {
		con=DriverManager.getConnection(url,userName,pass);
		System.out.println("Connection done.");
		Statement ste=con.createStatement();
		ResultSet reSet=ste.executeQuery("select * from employee_payroll");
		while(reSet.next())
		{
			System.out.println(reSet.getInt(1)+" "+reSet.getString(2)+" "+reSet.getInt(3)+" "+reSet.getDate(4));
		}
				con.close();  
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
