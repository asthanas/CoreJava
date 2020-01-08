package com.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashtableStudent {

	public static void main(String[] args) {
		Hashtable<String,Integer> table = new Hashtable<String, Integer>();
		
		table.put("John",101);
		table.put( "Jack",102);
		table.put("Jim",103);
		table.put("Jinne",104);
		table.put("Joe",105);
		
		Collection<Integer> values = table.values();
        Integer maxValue = Collections.max(values);
        Enumeration<String> keys = table.keys();
        while(keys.hasMoreElements()){
            Object key = keys.nextElement();
            if((table.get(key)).equals(maxValue))
                System.out.println(key);
        }
	}
}
















