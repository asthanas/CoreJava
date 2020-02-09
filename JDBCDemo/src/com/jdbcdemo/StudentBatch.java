package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentBatch {

	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka?useTimezone=true&serverTimezone=UTC","root","");
		Statement st = con.createStatement();
		
		st.addBatch("insert into student values(108,'Ram',7,300)");
		st.addBatch("insert into student values(109,'Ramesh',6,350)");
		st.addBatch("insert into student values(111,'Rahim',5,440)");
		st.addBatch("update student set std_marks = 564");
		
		try
		{
			int[] row_affected = st.executeBatch();
			for(int n : row_affected) {
				System.out.println("Row Affected = "+ n);
			}
			con.commit();	
		}catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		st.close();
		con.close();
}
}
