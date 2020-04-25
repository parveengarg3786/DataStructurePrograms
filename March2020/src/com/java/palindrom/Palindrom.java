package com.java.palindrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = br.readLine();
		int last = s1.length()-1;
		int i = 0;
		boolean isPalindrom = true;
		while(i<last)
		{
			if(s1.charAt(i) != s1.charAt(last)) {
				isPalindrom = false;
				break;
			}
			else
			{
				i++;
				last--;
			}
			
		}
		
		
		if(isPalindrom == true)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}
}
