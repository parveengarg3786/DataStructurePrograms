package com.java.heapify;

public class Functions {

	int array[];
	int tail = 0;
	Functions()
	{
		array = new int[10];
	}



	public void add(int data)
	{
		array[tail] = data;
		upHeapify(tail);
		tail++;
	}

	private void upHeapify(int index){

		if(index != 0)
		{
			int parentIndex = getParentIndex(index);
			if(array[parentIndex]> array[index])
			{
				swap(array,parentIndex,index);
				upHeapify(parentIndex);
			}
		}
	}
	
	private void swap(int array[], int firstIndex, int secondIndex)
	{
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	public void delete() {
		swap(array, 0, tail-1);
		tail--;
		//downHeapify(0);
	}
	
//	private void downHeapify(int index) {
//	//	int leftChild = getleftchild(index);
//	//	int rightChild = getrightchild(index);
//		if(leftChild<tail && array[index] > array[leftChild])
//		{
//			swap(array, index, leftChild);
//			downHeapify(leftChild);
//		}
//		else if(rightChild<tail && array[index] > array[rightChild])
//		{
//			swap(array, index, rightChild);
//			downHeapify(rightChild);
//		}
//		
//		
//	}
	
	private int getParentIndex(int index)
	{
		return (index-1)/2;
	}
	
	
	
	
	public void display()
	{
		for(int i=0;i<tail;i++)
		{
			System.out.println(array[i]);
		}
	}

}
