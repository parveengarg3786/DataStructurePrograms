package com.java.sortingProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
	public static void main(String arg[]) throws NumberFormatException, IOException
	{
		
		ArrayInput arr = new ArrayInput();
		
		
		int array[] = arr.arrayInput();
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
}
