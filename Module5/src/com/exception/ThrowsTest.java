package com.exception;

public class ThrowsTest {
	
	public int test(int a, int b) throws Exception {
		int c;
		c = a / b ;
		return c;
	}

	public static void main(String[] args) {
		try {
			ThrowsTest e1 = new ThrowsTest();
			int result = e1.test(10,0);
			System.out.println("Result is : " +result);
		}catch (Exception e) {
			System.out.println("Exception is " +e);
		}
	}
}
