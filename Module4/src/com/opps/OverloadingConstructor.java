package com.opps;
class Employee1{
	int empno;
	String name;
	float sal;
	
	Employee1(){}
	Employee1(int empno, String name){
		this.empno = empno;
		this.name = name;
	}
	Employee1(int a, String b, float c){
		this(a,b);
		sal = c;
	}
	
	void getDetails() {
		System.out.println(this.empno+" | "+this.name+" | "+this.sal);
	}
}

public class OverloadingConstructor {

	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		Employee1 emp2 = new Employee1(121,"saurabh");
		Employee1 emp3 = new Employee1(122,"Asthana",2500f);
		
		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}

}
