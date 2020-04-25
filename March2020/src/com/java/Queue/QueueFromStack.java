package com.java.Queue;

import java.util.Stack;

public class QueueFromStack {
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public void enqueue(int data)
	{
		s1.push(data);
	}
	
	public void dequeue() {
		int index = s1.size();
		while(index>1)
		{
			s2.push(s1.pop());
			index = index - 1;
		}
		
		System.out.println(s1.pop());
		
		
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
		
	}
	
	
	public void display()
	{
		System.out.println(s1);
	}
	
}
