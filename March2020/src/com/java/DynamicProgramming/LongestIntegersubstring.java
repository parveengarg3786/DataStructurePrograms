package com.java.DynamicProgramming;

public class LongestIntegersubstring {
	public static void main(String[] args) {
		int array[] = {1,5,2,8,7,10,12};
		int result = findLis(array,0,0);
		System.out.println("longest Integer Substring " + result);
		int result1 = findLcsUsingDP(array);
		System.out.println("result 2 :  " + result1);
	}
	
	
	static int findLis(int array[], int currentIndex,int currentNumber) {
		
		if(currentIndex == array.length)
			return 0;

		int maxLength = 0;
		for(int i=currentIndex;i<array.length;i++)
		{
			if( array[i] >currentNumber )
			{
				maxLength = Math.max(maxLength,1+findLis(array, i+1, array[i]));
			}
			
		}
    	  return maxLength;
	}
	
	static int findLcsUsingDP(int array[])
	{
		int result[] = new int[array.length];
		int a =1;
		int largest =1;
		for(int i=0;i<array.length;i++)
		{
			 a =1;
			 largest =1;
			for(int j=0;j<i;j++)
			{
				if(array[i]>array[j])
				{
					a = 1+result[j];
					if(largest<a)
					{
						largest = a;
					}
				}
			}
			result[i] = largest;
		}
		
		
		int longestlength = result[0];
		
		for(int i=0;i<result.length;i++)
		{
			if(longestlength < result[i])
			{
				longestlength = result[i];
			}
		}
		
		return longestlength;
		
	}
}
