package com.jdbcdemo;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {
		EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDAO();
		/*To save an Employee
		Employee emp = new Employee(110,"Saurabh", 25000);
		dao.saveEmp(emp);
		*/
		/*
		Employee emp = new Employee(110,"Saurabh Asthana", 25000);
		dao.updateEmp(emp);
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee no.: ");
		int eno = sc.nextInt();
		Employee emp = dao.searchEmp(eno);
		
		if(emp != null )
			System.out.println(emp);
		else
			System.out.println("No matchning employee found");
			
		sc.close();	
		*/
		
		List<Employee> emps = dao.getEmployees();
		for(Employee emp : emps)
		{
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}

}
