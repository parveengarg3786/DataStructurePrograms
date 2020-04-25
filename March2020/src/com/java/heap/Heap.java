package com.java.heap;

public class Heap {
int array[];
int tail;
	Heap(){
		array = new int[10];
		tail = 0;
	}
	
	public void add(int data)
	{
		array[tail] = data;
		upHeapify(tail);
		tail++;
	}
	
	private void upHeapify(int index)
	{
		if(index != 0)
		{
			int parent = getParentIndex(index);
			
			if(array[parent]>array[index])
			{
				int temp = array[parent];
				array[parent] = array[index];
				array[index] = temp;
				upHeapify(parent);
			}
		}
	}
	
	private void downHeapify(int index) {
		if(index<tail)
		{
			int leftChildIndex = getLeftChildIndex(index);
			int rightChildIndex = getRightChildIndex(index);
			
			if(leftChildIndex<tail && array[leftChildIndex]<array[rightChildIndex] && array[index]>array[leftChildIndex])
			{
					int temp = array[index];
					array[index] = array[leftChildIndex];
					array[leftChildIndex] = temp;
					
					downHeapify(leftChildIndex);
			}
			if(rightChildIndex < tail &&array[rightChildIndex]<array[leftChildIndex] && array[index]>array[rightChildIndex])
			{
					int temp = array[index];
					array[index] = array[rightChildIndex];
					array[rightChildIndex] = temp;
					
					downHeapify(rightChildIndex);
			}
		}
	}
	
	
	private int getLeftChildIndex(int index){
		return (2*index)+1 ;
	}
	
	
	private int getRightChildIndex(int index){
		return (2*index)+2 ;
	}
	
	private int getParentIndex(int index) {
		return(index-1)/2;
	}
	
	public void display() {
		for(int i = 0; i < tail; i++) {
			System.out.println(array[i]);
		}
	}
	
	public int size() {
		return tail;
	}
	
	
	public int delete() {
		int p = array[0];
		int temp = array[0];
		array[0] = array[tail-1];
		array[tail-1] = temp;
		tail--;
	
		downHeapify(0);
		return p;
	}

}
