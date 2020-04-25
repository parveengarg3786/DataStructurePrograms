package com.java.stack;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class StackfromQueueFunction {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int data)
	{
		q1.add(data);
	}
	
	public void pop()
	{
		int index = q1.size();
		while(index>1)
		{
			q2.add(q1.remove());
			index = index - 1;
		}
		
		System.out.println(q1.remove());
		
		q1 = q2;
	}
	
	
	public void display()
	{
			System.out.println(q1);
		
	}
	
}
