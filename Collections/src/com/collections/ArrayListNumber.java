package com.collections;

import java.util.ArrayList;

public class ArrayListNumber {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(100);

		for (int i = 1; i <= 10; i++)
		{
		   numbers.add(i);
		   System.out.println(numbers.get(i-1));
		}
	}

}
