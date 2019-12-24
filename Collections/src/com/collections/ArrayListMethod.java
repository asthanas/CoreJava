package com.collections;

import java.util.ArrayList;

public class ArrayListMethod {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size="+names.size());
		names.add("Saurabh");
		names.add("supriya");
		names.add("Viraj");
		names.add("Saurabh");
		names.add("supriya");
		names.add("Viraj");
		names.add("Sonal");
		names.add("lovey");
		System.out.println(names+" | Size="+names.size());
		names.add(1,"Gobar");
		System.out.println(names+" | Size="+names.size());
		names.set(7,"john");
		System.out.println(names+" | Size="+names.size());
		System.out.println("lovey @"+ names.indexOf("lovey"));
		System.out.println("lovey @"+ names.indexOf("lovey1"));
		System.out.println("last position of lovey @"+ names.lastIndexOf("lovey"));
		System.out.println("Person @ 2 "+ names.get(2));
		System.out.println(names.remove("john"));
		System.out.println(names+" | Size="+names.size());
		System.out.println("Element removed " +names.remove(7));
		System.out.println(names+" | Size="+names.size());
		System.out.println(names.contains("sunil"));
	}
}
