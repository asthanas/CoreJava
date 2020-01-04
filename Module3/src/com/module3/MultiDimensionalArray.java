package com.module3;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		System.out.println("Size of Array = "+ n.length);
		
		for(int i =0;i<n.length;i++) {
			System.out.println("Size of n[" +i+ "]=" + n[i].length);
		}
		
		for(int i = 0; i <n.length;i++) {
			for(int x : n[i]) {
				System.out.print(x+ " ");
				}
			System.out.println();
		}
	}

}
