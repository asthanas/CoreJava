package com.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
			Connection con = ConnectionFactory.getConnection();
		
		Statement st = con.createStatement();
	
		String sql = "select * from emp";
		
		try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int eno = rs.getInt(1);
				String name = rs.getString(2);
				float sal = rs.getFloat("sal");
				System.out.println(eno+" | "+name+" | "+sal);
				Thread.sleep(1500);
			}
			rs.close();
		}
		catch(Exception ex) {
			System.out.println("Exception: "+ex.toString());
		}
		
		st.close();
		con.close();

	}

}
