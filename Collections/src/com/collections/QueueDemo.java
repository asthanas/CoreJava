package com.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i = 10;i>0;i--) {
			queue.add(i);
		}
		//How we added
		//(head) 10 9 8 7 6 5 4 3 2 1 (tail)
		
		//PriorityQueue Sorts the data
		//(Head) 1 2 3 4 5 6 7 8 9 10 (tail)
		//System.out.println(queue.peek());//return head of the queue
		//System.out.println(queue.poll()); //Removes and return head of the queue
		//System.out.println(queue.peek()); //always Returns head
		
		for(int i = 1;i<=10;i++) {
			//System.out.println(queue.peek());
			System.out.println(queue.poll());
		}
	}

}
