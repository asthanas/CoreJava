package com.jdbcdemo;

public class StudentDAOFactory {
	public static StudentDAO getStudentDAO() throws Exception
	{
		return new StudentDAOImpl();
	}
}
