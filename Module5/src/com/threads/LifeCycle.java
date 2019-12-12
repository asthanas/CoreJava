package com.threads;

public class LifeCycle {

	public static void main(String[] args) throws InterruptedException {
		Thread mt = Thread.currentThread();
		for(int i =1; i<=10;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}

	}

}
