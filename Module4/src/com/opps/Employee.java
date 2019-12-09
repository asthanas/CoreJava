package com.opps;

public class Employee {
		int empno;
		String name;
		float sal;
		
		void setDetails(){
			empno = 102;
			name = "Naveen";
			sal = 5250.5f;
		}
		void displayDetails(){
		 System.out.println(empno+" | "+ name+" | "+ sal);
		}

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		/*change state with reference*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		
		emp.displayDetails();

		/*change state with method*/
		emp.setDetails();
		emp.displayDetails();
	}

}
