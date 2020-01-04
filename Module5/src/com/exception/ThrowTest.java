package com.exception;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter first no. : ");
			int x = sc.nextInt();
		
			System.out.print("Enter second no. : ");
			int y = sc.nextInt();
			try {
				if(y == 0) {
					ArithmeticException aex = new ArithmeticException("Cannot Divide by Zero");
					throw aex;
				}
			
			int z = x/y;
			System.out.println("Result = " +z);
			}
			catch (Exception ex) {
				System.out.println("Message : "+ ex.getMessage());
				System.out.println(ex.toString());
			}
			finally {
				/*cleanup code */
				
				System.out.println("Application designed and developed by");
				System.out.println("Team @ Zoomin");
				sc.close();
			}
	}

}
