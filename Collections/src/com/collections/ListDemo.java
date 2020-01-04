package com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

class Employee {
	int eid;
	String name;
	
	public String toString() {
		return eid+ " - "+name;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "George";
		
		Employee e2 = new Employee();
		e2.eid = 102;
		e2.name = "Janardan";
		
		//Adding data in list
		list1.add("John");
		list1.add("Jennie");
		list1.add(100);
		list1.add(2.2);
		list1.add('A');
		list1.add(e1);
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");//Duplicacy is supported
		list2.add("Joe");
		
		list3.add(e1);
		list3.add(e2);
		
		//See data in list
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		//Read and index
		
		String str = list2.get(1);
		Employee e = list3.get(0);
		Object o = list1.get(2);
		
		//Iteration in a loop
		
		System.out.println("------For Loop-----");
		for(int i = 0; i <list1.size();i++) {
			Object o1 = list1.get(i);
			System.out.println(o1);
		}
		for(int i = 0; i <list2.size();i++) {
			String str2 = list2.get(i);
			System.out.println(str2);
		}
		for(int i = 0; i <list3.size();i++) {
			Employee emp = list3.get(i);
			System.out.println(emp);
		}
		
		System.out.println("------Enhanced For Loop-----");
		for(Object o1 : list1) {
			System.out.println(o1);
		}
		for(String str2 : list2) {
			System.out.println(str2);
		}
		for(Employee emp : list3) {
			System.out.println(emp);
		}
		
		//Iterator
		System.out.println("------Iterator-----");
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext()) {
			Object o1 = itr1.next();
			System.out.println(o1);
			//itr1.remove(); --> remove of iterator will delete from Array list
		}
		System.out.println("-----------");
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			String nm = itr2.next();
			System.out.println(nm);
			
		}
		System.out.println("-----------");
		Iterator<Employee> itr3 = list3.iterator();
		while(itr2.hasNext()) {
			Employee nm = itr3.next();
			System.out.println(itr3);
		}
		
		//ListIterator
		System.out.println("------ListIterator-----");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()) {
			String str1 = listItr.next();
			System.out.println(str1);
		}
		System.out.println("-----------");
		while(listItr.hasPrevious()) {
			String str1 = listItr.previous();
			System.out.println(str1);
		}
		//Enumeration
		System.out.println("--------Enumeration---------");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()) {
			String str1 = enm.nextElement();
			System.out.println(str1);
		}
		//Explore API's on ArrayList
		System.out.println(list2);
		//list2.remove(0);
		//list2.remove("John");
		list2.set(1, "Jeniee");		
		System.out.println(list2);
		int idx = list2.indexOf("Jack");
		System.out.println("idx is : "+idx);
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Mike");
		list4.add("Leo");
		list4.add("Harray");
		
		list2.addAll(list4);
		System.out.println("list2 is: "+list2);
		list2.add(1,"Fionna");
		System.out.println("list2 is: "+list2);
		list2.clear();
		System.out.println("list2 is: "+list2);
		
		Vector<String> vector = new Vector<String>();
		vector.add("John");
		vector.add("Jennie");
		vector.add("Jim");
		vector.add("Jack");
		vector.add("Joe");
		
		System.out.println(vector);
		System.out.println(vector.get(2));
		
		List list = new ArrayList();
		list = new Vector();
		list = new LinkedList();
		list = new Stack();
		}
}
