package com.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jim");
		map.put(104, "Jinne");
		map.put(105, "Joe");
		map.put(null,"Flora"); //Null value of key is supported
		map.put(123, null); //Null Value is supported 
		
		map.put(54, "Bob" );
		System.out.println(map);
		String nm = map.get(101);
		System.out.println(nm);
		
		if (map.containsKey(101)){
			System.out.println(" 101 is in the map");
		}
		
		if(map.containsValue("Flora")) {
			System.out.println("Flora is in the map");
		}
		
		//map.remove(101);
		//map.clear();
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
	
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+" "+value);
		}
		
		//Entry set
		Set<Entry<Integer,String>> entryset = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entryset.iterator();
		
		while(itr1.hasNext()) {
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+ " - "+entry.getValue());
		} 
		
		
		//Thread safe
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(101, "John");
		table.put(102, "Jack");
		table.put(103, "Jim");
		table.put(104, "Jinne");
		table.put(105, "Joe");
		//table.put(null,"Flora"); //Null value of key is not supported
		//table.put(123, null); //Null Value is not supported 
		
		System.out.println(table);
		
	}		

}
