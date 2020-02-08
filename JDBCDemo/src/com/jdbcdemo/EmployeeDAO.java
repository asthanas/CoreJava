package com.jdbcdemo;

import java.util.List;

public interface EmployeeDAO {
	void saveEmp(Employee emp) throws Exception;
	void updateEmp(Employee emp) throws Exception;
	void deleteEmp(int eno) throws Exception;
	Employee searchEmp(int eno) throws Exception;
	List<Employee> getEmployees() throws Exception;
}
