package com.jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertRecords1 {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getConnection();
		
		Scanner sc = new Scanner(System.in);
		
		PreparedStatement pst = con.prepareStatement("insert into emp value(?,?,?)");
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter emp no: ");
			int eno = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Salary : ");
			float sal = sc.nextFloat();
			
			try {
				pst.setInt(1,eno);
				pst.setString(2, name);
				pst.setFloat(3, sal);
				
				int n = pst.executeUpdate();
				if(n>0) {
					System.out.println("Employee Saved");
				}
			}catch(Exception ex) {
				System.out.println(ex.toString());
			}
			System.out.println("Do you have more registrations [Y/N]: ");
			req = sc.next();
		}
	}
}	
