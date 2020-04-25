
package com.java.palindrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromUsingStringBUilderClass {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String");
		String s1 = br.readLine();
		
		StringBuilder sbr = new StringBuilder(s1);
		String s2 = sbr.reverse().toString();
		
		
		if(s1.equals(s2)) {
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
		
		
	}
}
