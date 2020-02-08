package com.jdbcdemo;

public class Employee {
	private int empno;
	private String name;
	private float sal;
	public Employee() {}
	public Employee(int empno, String name, float sal) {
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [" + empno + " | " + name + " | " + sal + "]";
	}
	
	
}
