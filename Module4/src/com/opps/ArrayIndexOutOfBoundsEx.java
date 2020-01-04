package com.opps;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int array[] = new int [5];
			for(int i = 0; i<11;i++) {
				array[i] = sc.nextInt();
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index of bounds exception, try again " +ex);
		}finally {
			System.out.println("Execution Successfull");
		}
	}

}
