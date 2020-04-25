package com.java.WaterStoreBetweenBuilding;

public class WaterProblem {
	public static void main(String[] args) {
		int  array[] = {5,4,3,2,1,6};
		int leftlargest = 0;
		int rightlargest = 0;
		int result = 0;
		int resultArray[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			leftlargest = leftlargest(i,array);
			rightlargest = rightlargest(i,array);
			if(leftlargest < rightlargest)
			{
			result = leftlargest - array[i];
			}
			else
			{
				result = rightlargest - array[i];
			}
			if(result < 0 || leftlargest == 0 || rightlargest == 0)
			{
				resultArray[i] = 0;
			}
			else
			{
				resultArray[i] = result;
			}
		}
		
		int sum = 0;
		
		for(int i=0;i<array.length;i++)
		{
			sum = sum + resultArray[i];
		}
		
		System.out.println("total amount of water hold : " + sum);
	}
	
	static int leftlargest(int index, int array[])
	{
		int largest = 0;
		
		for(int i=0;i<index;i++)
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
		}
		return largest;
	}
	
	static int rightlargest(int index, int array[])
	{
		int largest = 0;
		
		for(int i=index+1;i<array.length;i++)
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
		}
		return largest;
	}
}
