package com.java.Recursion;

public class TowerOFHanoi {
	public static void main(String[] args) {
		
		printsolution(4,'A','C','B');
	}
	
	static void printsolution(int n, char source,char target,char help)
	{
		if(n==1)
		{
			System.out.println("Move disk " + n + " from rod " + source + " to rod " + target);
			return;
		}
		
		printsolution(n-1, source, help, target);
		System.out.println("Move disk " + n + " from rod " +  source + " to rod " + target); 
		printsolution(n-1,help,target,source);
	}
}
