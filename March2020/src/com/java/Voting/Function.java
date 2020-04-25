package com.java.Voting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Function {

	public String[] vote() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String array[] = new String[10];
		
		System.out.println("enter the name");
		for(int i=0;i<array.length;i++)
		{
			array[i] = br.readLine();
		}
		
		return array;
	}
	
	
	
	public String[] listOfVoter(String array[])
	{
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i=0;i<array.length;i++)
		{
			ts.add(array[i]);
		}
		
		String listVoter[] = new String[ts.size()];
		
		Iterator<String> it = ts.iterator();
		int i = 0;
		
		while(it.hasNext())
		{
			listVoter[i] = it.next();
			i++;
		}
		return listVoter;
	}
	
	
	public void countVoting(String votes[]) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(int i=0;i<votes.length;i++)
		{
			String name = votes[i];
			Integer value = hm.get(name);
			
			if(value == null)
			{
				hm.put(name, 1);
			}
			else
			{
				hm.put(name, value + 1);
			}
		}
		
		System.out.println(hm);
	}
	
}
