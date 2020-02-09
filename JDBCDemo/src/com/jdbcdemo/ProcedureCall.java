package com.jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java66","password");
		
		CallableStatement cst = con.prepareCall("{call addNum(?,?,?)}");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first no: ");
		int x = sc.nextInt();
		System.out.println("Enter the second no: ");
		int y = sc.nextInt();
		
		
		cst.setInt(1, x);
		cst.setInt(2, y);
		cst.registerOutParameter(3, Types.INTEGER);
		cst.execute();
		
		System.out.println(x+" + "+y+" = "+cst.getInt(3));
		
		sc.close();
		cst.close();
		con.close();
	}
	

}
