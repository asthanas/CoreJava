package com.exception;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String req="Y";
		while(req.equalsIgnoreCase("Y"))
		{
			try {
			System.out.print("Enter Age of Voter : ");
			int age = sc.nextInt();
			
			if (age<18) 
				throw new InvalidAgeException("Age should be greater then or equal to 18");
			
			System.out.println("VOTING DONE");
		    }
			catch(Exception ex) {
				System.out.println(ex.toString());
			}
			System.out.print("Next Voter [Y/N] : ");
			req = sc.next();
		}
		sc.close();
	}
}
