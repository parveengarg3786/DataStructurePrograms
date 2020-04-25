package com.java.Practise.sortingProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchingFunction {

	public int[] arrayInput() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int array[] = new int[5];

		System.out.println("enter the number");
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}

		return array;
	}


	public void quickSort(int array[],int start,int last) {
		if(start<last)
		{
			int left = start;
			int right = last-1;

			int pivot = array[last];

			while(left<right)
			{
				if(array[left]>pivot && array[right]<pivot)
				{
					int temp = array[left];
					array[left] = array[right];
					array[right] = temp;

					left++;
					right--;
				}
				if(array[left] < pivot)
				{
					left++;
				}
				 if(array[right] > pivot)
				{
					right--;
				}

			}
			
			if(array[right]>pivot)
			{
				int temp = array[right];
				array[right] = pivot;
				array[last] = temp;
			}
			
			
			quickSort(array, start, right);
			quickSort(array, right+1, last);
			
		}
	}
	
	public void display(int array[]) {
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}



}
