package com.collection;

import java.util.PriorityQueue;

public class priorityQueueExample {

	public static void main(String[] args) {
		// queue is performing FIFO
		//we have types 
		//1.priority queue
		//2.Dequeue - Array and LinkedList
		// it is not followed sorting and insertion order
		//it allow duplicate element
		//priority decided by JVM
		PriorityQueue  q = new PriorityQueue();
		q.offer(80);
		q.offer(34);
		q.offer(45);
		q.offer(67);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);

	}

}
