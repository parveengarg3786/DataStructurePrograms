package com.java.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCSProgram {
	static Integer dp[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string 1");
		String s1 = br.readLine();
		System.out.println("enter the string 2");
		String s2 = br.readLine();
		int i =0,j = 0;
		dp = new Integer[s1.length()][s2.length()];
		int result = findLcs(i,j,s1,s2);
		System.out.println("lcs of string is : " + result);

		
	}
	
	static int findLcs(int firstStringIndex	,int secondStringIndex, String s1, String s2)
	{
		if(firstStringIndex < s1.length() && secondStringIndex < s1.length())
		{
			if(dp[firstStringIndex][secondStringIndex] != null) return dp[firstStringIndex][secondStringIndex];  
			if(s1.charAt(firstStringIndex) == s2.charAt(secondStringIndex))
			{
				return dp[firstStringIndex][secondStringIndex] = 1 + findLcs(firstStringIndex+1, secondStringIndex+1, s1, s2);
			}
			else
			{
				return dp[firstStringIndex][secondStringIndex] =  Math.max(findLcs(firstStringIndex+1, secondStringIndex, s1, s2),findLcs(firstStringIndex, secondStringIndex+1, s1, s2));
			}
		}
		else
		{
			return 0;
		}
	}
}
