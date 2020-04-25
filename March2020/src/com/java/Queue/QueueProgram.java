package com.java.Queue;

public class QueueProgram {
	public static void main(String[] args) {
		QueueFromStack q = new QueueFromStack();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.display();
		q.dequeue();
		q.dequeue();
		q.enqueue(5);
	
		q.dequeue();
	}
}
