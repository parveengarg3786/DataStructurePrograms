package com.java.sortingProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInput {
	int[] arrayInput() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number");
		int array[] = new int[5];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		
		return array;
		
	}
	
	public void insertionSort(int array[]) {
		
		int length = array.length;
		if (length > 1) 
		{
			for(int i = 1;i < length;i++)
			{
				int currentElement = array[i];
				int j = i - 1;
				while(j >= 0 && currentElement < array[j])
				{
					array[j+1] = array[j];
					j--;
				}
				
				array[j+1] = currentElement;  
			}
		}
	}
	
	
	public void display(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	
}
