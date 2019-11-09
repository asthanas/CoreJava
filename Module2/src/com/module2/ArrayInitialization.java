package com.module2;

import java.util.Arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,87,76,65,54};
		System.out.println("No of subjects : " +marks.length);
		for(int i = 0; i < marks.length;i++ ) {
			System.out.println("Subject - "+(i+1)+" = "+marks[i]);
		}	
		/*Array iteration using enhanced for loop */
		System.out.println("Marks Obtained : ");
		for(int mark : marks) {
			System.out.print(mark+ " | ");
		}
		System.out.println();
		//System.out.println(marks[5]);//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(marks)); //to display full array in one line
	}

}
