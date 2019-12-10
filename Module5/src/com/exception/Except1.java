package com.exception;

import java.util.Scanner;

public class Except1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no. : ");
		int x = sc.nextInt();
		
		System.out.print("Enter second no. : ");
		int y = sc.nextInt();
		
		int z = x/y;
		System.out.println("Result = " +z);
		
		System.out.println("----Done----");
		sc.close();
	}

}
