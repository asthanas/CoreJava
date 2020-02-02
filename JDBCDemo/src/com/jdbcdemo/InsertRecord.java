package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) throws Exception {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka?useTimezone=true&serverTimezone=UTC","root","");
		Statement st = con.createStatement();
		String sql = "insert into emp values(101, 'Saurabh', 24500.5)";
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("Employess saved -- "+ rows_affected );
		}catch(Exception ex) {
			System.out.println("Exception : "+ex.toString());
		}
		st.close();
		con.close();
	}
}
