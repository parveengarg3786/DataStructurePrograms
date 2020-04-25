package com.java.heap;

import java.util.PriorityQueue;

public class HeapDriverProgram {
	public static void main(String[] args) {
		Heap h = new Heap();
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		h.add(1);

		while(h.size() != 0)
		{
			System.out.println(h.delete());
		}
		
		System.out.println("pro que");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(5);
		pq.add(4);
		pq.add(3);
		pq.add(2);
		pq.add(1);

		while(pq.size() != 0)
		{
			System.out.println(pq.remove());
		}
	}
}
