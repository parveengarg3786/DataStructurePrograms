package com.java.fibbonacci;

public class Fibbonacci {
	public static void main(String[] args) {
		
		int firstNumber = 1;
		int secondNumber = 1;
	
		fibbonacci(firstNumber, secondNumber);
		
		
	}
	
	static public void fibbonacci(int firstNumber, int secondNumber)
	{
		System.out.print(firstNumber + " " + secondNumber);
		int third = 0;
		for(int i = 3; i < 10; i++)
		{
			third = firstNumber + secondNumber;
			System.out.print(" " + third);
			
			firstNumber = secondNumber;
			secondNumber = third;
		}
	}
}
