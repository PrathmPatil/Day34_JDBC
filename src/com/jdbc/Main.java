package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Main {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/addressbook";
//		api:database:server:port:databaseName
		String userName="root";
		String pass="Patil@2000";
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
			con=DriverManager.getConnection(url,userName,pass);
			System.out.println("Connection done.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
