package com.java.searchingProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the numbers");
		
		int array[] = new int[5];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}
		
		
		System.out.println("enter the number you want to search");
		
		int searchNumber = Integer.parseInt(br.readLine());
		
		boolean found = false;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i] == searchNumber)
			{
				found = true;
				break;
			}
		}
		
		if(found == true)
		{
			System.out.println("Number found");
		}
		else
		{
			System.out.println("number not found");
		}
	}
	
}
