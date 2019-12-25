package com.calculate;

import java.util.Scanner;

import com.calcfunction.calcFunctions;

public class calculator {

	public static void main(String[] args) {
		calcFunctions cf = new calcFunctions();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers...");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int reverse = cf.reverse(x);
		int fact = cf.factor(x);
		int sub = cf.subtract(x, y);
		int mul = cf.multiply(x, y);
		double div = cf.devide(x, y);
		
		System.out.println("Factorial of "+ x + " is "+ fact);
		System.out.println("Reverse of "+ x + " is "+ reverse); 
		System.out.println("Subtraction result is "+ sub); 
		System.out.println("Multiplicaton result is "+ mul); 
		System.out.println("Division result is "+ div); 


	}

}
