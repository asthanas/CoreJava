package com.exception;

import java.util.Scanner;

public class Except2 {
	
	static void method3() {
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
	static void method2() {
		method3();
	}
	
	static void method1() {
		method2();
	}
	public static void main(String[] args) {
		method1();
	}



}
