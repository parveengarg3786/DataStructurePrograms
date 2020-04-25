package com.java.Recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class factorial {
public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int number = 5;
	
	
	int result = factorial(number);
	
	System.out.println(result);
}

	static public int factorial(int number)
	{
		if(number > 1)
		{
			
			int num = factorial(number-1);
			return  number * num;
			
		}
		else
		{
			return number;
		}
	}

}
