package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	static Connection con = null;
	public static Connection getConnection() throws Exception
	{
		if(con == null)
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka?useTimezone=true&serverTimezone=UTC","root","");
	}
	return con;
	
	}
}
