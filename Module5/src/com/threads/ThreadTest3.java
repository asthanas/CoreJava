package com.threads;
class Natural extends Thread{
	public void run() {
		for(int i=0 ; i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}

class Even extends Thread{
	public void run() {
		for(int i=0 ; i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+(i*2));
		}
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		Natural nat = new Natural();
		Even evn = new Even();
		
		nat.start();
		evn.start();
		nat.setName("Natural");
		evn.setName("Even   ");
	}

}
