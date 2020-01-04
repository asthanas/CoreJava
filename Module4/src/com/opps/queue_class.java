package com.opps;

import java.util.Scanner;

interface queue_interface{
	void insert(int a);
	int delete();
}

public class queue_class implements queue_interface
{
	int queue_array[] = new int[5];
	int front = 0;
	int rear = 0;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter 4 numbers to insert into the queue..");
		int x = sc.nextInt();
		queue_class q1 = new queue_class();
		q1.insert (x);
		
		
		x = sc.nextInt();
		q1.insert (x);
		
		
		x = sc.nextInt();
		q1.insert (x);

		
		x = sc.nextInt();
		q1.insert (x);
		
		System.out.println("Queue contains : ");
		q1.display();
		
		System.out.println("Deleting 2 elements from queue..");
		int y = q1.delete();
		System.out.println("Deleted element is "+y);

		
		y = q1.delete();
		System.out.println("Deleted element is "+y);
		
		System.out.println("Queue Contains..");
		q1.display();	}

	@Override
	public void insert(int x) {
		queue_array[rear++] = x;		 
		
	}

	@Override
	public int delete() {
		
		return queue_array[front++];
		 
	}
	
	public void display()
	{
		for (int i = front; i < rear; ++i)
			System.out.println(queue_array[i]);
		
	}
}

