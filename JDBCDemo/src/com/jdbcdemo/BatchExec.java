package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

	public class BatchExec {

		public static void main(String[] args) throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java66","password");
			
			Statement st = con.createStatement();
			st.addBatch("insert into emp values(108,'Ram',45454)");
			st.addBatch("insert into emp values(109,'Ramesh',45587)");
			st.addBatch("insert into emp values(111,'Rahim',45000)");
			st.addBatch("update emp set sal = 50000");
			
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
