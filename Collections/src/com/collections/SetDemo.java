package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class SetDemo {

	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		// Data isn't added on indexes
		TreeSet<String> set = new TreeSet<String>();//Data is sorted in TreeSet
		
		set.add("John");
		set.add("Jennie");
		set.add("Jim");
		set.add("Jack");
		set.add("John");//Duplicacy is not supported
		set.add("Joe");
		
		System.out.println(set);
		set.remove("Jim");
		if(set.contains("John")) {
			System.out.println("John is in set");
		}
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String nm = itr.next();
			System.out.println(nm);
		}
	}

}
