package com.jdbcdemo;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws Exception {
		StudentDAO dao = StudentDAOFactory.getStudentDAO();
		/*To save an Student
		Student std1 = new Student(101,"Saurabh", 3,300);
		Student std2 = new Student(102,"Supriya", 4,323);
		Student std3 = new Student(103,"Swati", 5,350);
		Student std4 = new Student(104,"Ranjana", 6,500);
		Student std5 = new Student(105,"Vijay", 7,600);
		dao.saveStd(std1);
		dao.saveStd(std2);
		dao.saveStd(std3);
		dao.saveStd(std4);
		dao.saveStd(std5);
		/*
		Student std6 = new Student(105,"Vijay Asthana",7,650);
		dao.updateStd(std6);
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id no.: ");
		int sno = sc.nextInt();
		Student std = dao.searchStd(sno);
		
		if(std != null )
			System.out.println(std);
		else
			System.out.println("No matchning student found");
			
		sc.close();	
		*/
		
		List<Student> stds = dao.getStudents();
		for(Student std11 : stds)
		{
			System.out.println(std11);
			Thread.sleep(1000);
		}
		
	}

}
