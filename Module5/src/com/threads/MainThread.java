package com.threads;

public class MainThread {

	public static void main(String[] args) {
		int n  = Thread.activeCount();
		System.out.println("No of Active Threads = "+n);
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());
		t.setName("Edureka");
		t.setPriority(10);
		System.out.println(t);
	}
}
