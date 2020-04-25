package com.java.HashMap;

import java.util.*;
import java.io.*;

public class HashMap {
	Node array[];
	HashMap()
	{
		array = new Node[16];
	}

	public void get(String key) {
		int index = hashcode(key) & (16-1) ;
		Node temp = array[index];
		boolean isPresent = false;

		if(temp == null)
		{
			System.out.println("no element");
		}
		else
		{

			while(temp != null )
			{
				if(!temp.key.equals(key))
				{
					temp = temp.next;
				}
				else 
				{
					isPresent = true;
					break;
				}
			}

			if(isPresent == false)
			{
				System.out.println("no element found");
			}else
			{
				System.out.println(key + " = " + temp.data);
			}
		}
	}

	public void put(String key,int value) {
		int index = hashcode(key) & (16-1) ;
		Node nd = new Node();
		nd.key = key;
		nd.data = value;
		nd.hash = index;
		nd.next = null;
		boolean isPresent = false;
		Node temp = array[index];

		if(temp == null)
		{
			array[index] = nd;
		}
		else
		{

			while(temp.next != null )
			{
				if(!temp.key.equals(key))
				{
					temp = temp.next;
				}
				else {
					isPresent = true;
					break;
				}
			}

			if(isPresent == false && temp.hash != index)
			{
				temp.next = nd;
			}else
			{
				temp.data = value;
			}
		}
	}


	private int hashcode(String key) {

		int hash = (int)key.charAt(0); 
		return hash; 
	}
}
