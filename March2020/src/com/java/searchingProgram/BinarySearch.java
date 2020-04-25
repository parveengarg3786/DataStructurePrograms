package com.java.searchingProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main(String aarg[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number ");
		
		int array[] = new int[5];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("enter the number you want to search");
		
		int searchNumber = Integer.parseInt(br.readLine());
		
		int first = 0;
		int last = array.length-1;
		int midItem = 0;
		boolean found = false;
		
		
		for(int i=0;i<array.length;i++)
		{
			midItem = (first + last)/2;
			
			if(searchNumber == array[midItem])
			{
				found = true;
				break;
			}
			else if( searchNumber < array[midItem])
			{
				last = midItem - 1;
			}
			else
			{
				first = midItem + 1;
			}
		}
		
		
		
		if(found == true)
		{
			System.out.println("number found");
		}
		else
		{
			System.out.println("number not found");
		}
	}
}
