package com.threads;

class MyTask1 implements Runnable
{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("No of Active Thread :" + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		MyTask1 mt = new MyTask1();
		Thread ct = new Thread(mt);
		ct.start();
		System.out.println("No of Active Thread :" + Thread.activeCount());
	}

}
