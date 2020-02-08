package com.jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Statement st = null;
	
	
	public EmployeeDAOImpl() throws Exception{
		Connection con = ConnectionFactory.getConnection();
		st = con.createStatement();
	}
	@Override
	public void saveEmp(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getName()+"',"+emp.getSal()+")";
		//int n = st.executeUpdate(sql);
		st.execute(sql);
		int n = st.getUpdateCount();
		if(n>0) {
			System.out.println("Employee Saved");
		}
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		String sql = "update emp set ename ='"+emp.getName()+"',sal="+emp.getSal()+" where empno="+emp.getEmpno();
		//int n = st.executeUpdate(sql);
		st.execute(sql);  
		int n = st.getUpdateCount();
		if(n>0) {
			System.out.println("Employee Saved");
		}
	}

	@Override
	public void deleteEmp(int eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		//int n = st.executeUpdate(sql);
		st.execute(sql);  
		int n = st.getUpdateCount();
		if(n>0) {
			System.out.println("Employee Saved");
		}
		else 
			System.out.println("No Matching employee for deletion");
	}

	@Override
	public Employee searchEmp(int eno) throws Exception {
		Employee emp = null;
		String sql = "select * from emp where empno="+eno;
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			int empno=rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			emp = new Employee(empno,name,sal);
		}
		return emp;
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		String sql = "select * from emp";
		List<Employee> emps = new ArrayList<>();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int eno=rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat("sal");
			
			Employee emp = new Employee(eno,name,sal);
			emps.add(emp);
		}
		return emps;
	}

}
