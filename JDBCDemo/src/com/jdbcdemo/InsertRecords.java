package com.jdbcdemo;

import java.sql.Connection;
import java.sql.Statement;

public class InsertRecords 
{
	public static void main(String[] args) throws Exception 
	{
		Connection con = ConnectionFactory.getConnection();
		
		Statement st = con.createStatement();
	
		String sql = "insert into emp(empno,ename,sal) values(102,'Anil',5500.5),(103,'Naveen',5000),(104,'Sharath',4500)";
		
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("Employees Saved - "+ rows_affected);
		}
		catch(Exception ex) {
			System.out.println("Exception: "+ex.toString());
		}
		
		st.close();
		con.close();

	}

}
