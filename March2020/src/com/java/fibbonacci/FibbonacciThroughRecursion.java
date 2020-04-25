package com.java.fibbonacci;

public class FibbonacciThroughRecursion {
	public static void main(String[] args) {

		int firstNumber = 1;
		int secondNumber = 1;

		int length = 10;
		fibbonacci(firstNumber, secondNumber, length);
		System.out.print(" " + firstNumber + " " + secondNumber);


	}

	static public int fibbonacci(int firstNumber, int secondNumber,int length)
	{

		if(length > 0)
		{
			int third = firstNumber + secondNumber;


			firstNumber = secondNumber;
			secondNumber = third;


			int result = fibbonacci(firstNumber,secondNumber, length-1);
			if(length != 1)
			{
				System.out.print(" " + result);
			}
			return secondNumber;
		}
		else
		{
			return secondNumber;
		}

	}
}
