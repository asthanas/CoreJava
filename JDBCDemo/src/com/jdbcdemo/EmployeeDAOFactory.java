package com.jdbcdemo;

public class EmployeeDAOFactory {
	public static EmployeeDAO getEmployeeDAO() throws Exception
	{
		return new EmployeeDAOImpl();
	}
}
