package com.module2;

import java.util.Scanner;

public class Employee {
	int[] empid;
	String[] name;
	double[] salaries;

	public static void main(String[] args) {
		
		int[] empid = new int[5];
		String[] name = new String[5];
		double[] salaries = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print(" Enter employee id : ");
			empid[i] = sc.nextInt();
			System.out.print(" Enter employee name : ");
			name[i] = sc.next();
			System.out.print(" Enter employee salaries : ");
			salaries[i] = sc.nextDouble();	
		}
		Employee e = new Employee();
		e.display(empid, name, salaries);
		System.out.println();
		e.display(empid, name);
		System.out.println("Enter name of employee to be searched");
		String empName = sc.next();
		e.display(empid, name, salaries, empName);
	   }	
		void display(int empid[], String name[], double salaries[]){
			System.out.println("ID           Name          Salary");
			for (int j = 0; j<5; j++) {
				 
				 System.out.println(empid[j]+ "          "+name[j]+"          "+salaries[j]);
			}
		}
			
		void display(int empid[], String name[]){
			System.out.println("ID          Name          Salary");
			for (int j = 0; j<5; j++) {
					 System.out.println(empid[j]+ "          "+name[j]);
			}	
		}
		
		void display(int empid[],String name[],double salaries[],String empName) {
			
			for(int k = 0; k<5;k++) {
				if(name[k].equals(empName)) {
					 System.out.println("ID          Name          Salary");
					 System.out.println(empid[k]+ "          "+name[k]+"          "+salaries[k]);
				}
			}
		}
}      