package com.java.primeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberBEstComplexity {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the number ");
		
		int number = Integer.parseInt(br.readLine());
		boolean isPrimeNumber = true;
		
		int rootOfNumber = (int) Math.sqrt(number);
		System.out.println(rootOfNumber);
		for(int i = 2 ; i < rootOfNumber ; i++)
		{
			if(number%i == 0)
			{
				isPrimeNumber = false;
				break;
				
			}
		}
		if(isPrimeNumber == true)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

	
}
