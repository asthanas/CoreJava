package com.exception;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Enter first no. : ");
			int x = sc.nextInt();
		
			System.out.print("Enter second no. : ");
			int y = sc.nextInt();
		
			int z = x/y;
			System.out.println("Result = " +z);
		}
		catch(Exception ex){
			System.out.println(ex.toString());
		}
		System.out.println("Application designed and developed by");
		System.out.println("Team @ Zoomin");
		sc.close();
		
	}
	
}