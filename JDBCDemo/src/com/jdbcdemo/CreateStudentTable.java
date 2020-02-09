package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentTable {

		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka?useTimezone=true&serverTimezone=UTC","root","");
			Statement st = con.createStatement();
			String sql = "create table student(std_id int(5),std_name varchar(30), std_class int(5),std_marks float(10,2), primary key (std_id))";
			try {
				st.execute(sql);
				System.out.println("DB table created");
			}catch(Exception ex) {
				System.out.println("Exception : "+ex.toString());
			}
			st.close();
			con.close();
		}
}


