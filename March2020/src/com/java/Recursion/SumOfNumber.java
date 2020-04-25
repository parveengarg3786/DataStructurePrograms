package com.java.Recursion;

public class SumOfNumber {
	public static void main(String[] args) {
		
		int number = 10;
		
		int result = sum(number);
		System.out.println(result);
	}
	
	
	static public int sum(int number) {
		if(number > 0)
		{
			
			int result = sum(number-1);
			return result + number;
		}
		else
		{
			return 0;
		}
	}
	

}
