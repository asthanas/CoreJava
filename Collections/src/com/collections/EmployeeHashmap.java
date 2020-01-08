package com.collections;

import java.util.HashMap;

public class EmployeeHashmap {

	public static void main(String[] args) {

			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(101, "John");
			map.put(102, "Jack");
			map.put(103, "Jim");
			map.put(104, "Jinne");
			map.put(105, "Joe");
			
			System.out.println(map);
		}
}
