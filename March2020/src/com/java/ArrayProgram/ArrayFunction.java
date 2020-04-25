package com.java.ArrayProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Stack;
import java.util.TreeSet;

import com.java.sortingProgram.ArrayInput;

public class ArrayFunction {

	//input array
	int[] arrayInput() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");
		int array[] = new int[5];

		for(int i=0;i<array.length;i++)
		{
			array[i] = Integer.parseInt(br.readLine());
		}

		return array;

	}

	//merge sort
	public void mergeSort(int array[],int startIndex,int lastIndex)
	{
		if(startIndex != lastIndex)
		{
			int mid = (startIndex+lastIndex)/2;
			mergeSort(array,startIndex,mid);
			mergeSort(array, mid+1, lastIndex);

			merge(array,startIndex,mid,lastIndex);
		}


	}

	private void merge(int array[],int startIndex,int midIndex,int lastIndex)
	{
		int leftArraySize = midIndex - startIndex +1;
		int leftArray[] = new int[leftArraySize];

		int rightArraySize = lastIndex - midIndex;;
		int rightArray[] = new int[rightArraySize];


		for(int i=0;i<leftArraySize;i++)
		{
			leftArray[i] = array[startIndex+i];
			
		}
		
		for(int i=0;i<rightArraySize;i++)
		{
			rightArray[i] = array[midIndex + 1 + i];
		}

		int i = 0; // Initial index of first subarray 
		int j = 0; // Initial index of second subarray 
		int k = startIndex; // Initial index of merged subarray 
		while (i < leftArraySize && j < rightArraySize) 
		{ 
			if (leftArray[i] <= rightArray[j]) 
			{ 
				array[k] = leftArray[i]; 
				i++; 
			} 
			else
			{ 
				array[k] = rightArray[j]; 
				j++; 
			} 
			k++; 
		} 


		while (i < leftArraySize) 
		{ 
			array[k] = leftArray[i]; 
			i++; 
			k++; 
		} 

		/* Copy the remaining elements of R[], if there 
		       are any */
		while (j < rightArraySize) 
		{ 
			array[k] = rightArray[j]; 
			j++; 
			k++; 
		} 
	
		


}

//remove duplicate from array
public void removeDuplicateElementFromArray(int array[]) {
	LinkedHashSet<Integer> ls  = new LinkedHashSet<Integer>();

	for(int i=0;i<array.length;i++)
	{
		ls.add(array[i]);
	}

	Iterator<Integer> it = ls.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

}



// find largest number from array
public void largestNumber(int array[])
{
	int largestNumber = array[0];

	for(int i=1;i<array.length;i++)
	{
		if(largestNumber < array[i])
		{
			int temp = largestNumber;
			largestNumber = array[i];
			array[i] = temp;
		}
	}
	System.out.println("largest NUmber in Array is : " + largestNumber);
}


public void zeroAtlast(int array[]) {

	for(int i=1;i<array.length;i++)
	{
		if(array[i] != 0)
		{				
			int pos = i;
			int index = i;
			while(pos>0)
			{
				if(array[pos-1] == 0)
				{
					int temp = array[index];
					array[index] = array[pos-1];
					array[pos-1] = temp;
					index = pos - 1;
				}
				pos--;
			}
		}

	}

	for(int i = 0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
}

public void sortingOfProgram(int array[])
{
	int zeroIndex = 0;
	int twoIndex = array.length - 1;
	boolean zero = false;
	boolean two = false;


	for(int i=0;i<array.length;i++)
	{

		zero = false;
		two = false;
		if(array[i] == 0)
		{
			int temp = array[i];
			array[i] = array[zeroIndex];
			array[zeroIndex] = temp;
			zero = true;
			zeroIndex++;
		}

		if(array[i] == 2 && i < twoIndex && two!=true)
		{
			int temp = array[i];
			array[i] = array[twoIndex];
			array[twoIndex] = temp;
			twoIndex--;
		}
		if(array[i] == 0 && zero != true)
		{
			int temp = array[i];
			array[i] = array[zeroIndex];
			array[zeroIndex] = temp;
			zeroIndex++;
		}
	}


	display(array);
}

public void binarySearchOnRotatedArray(int array[],int element)
{

	int first = 0;
	int last = array.length-1;
	int mid = 0;
	boolean found = false;
	while(first<last)
	{
		mid = (first+last)/2;

		if(array[mid] == element)
		{
			found = true;
			break;
		}
		else if(array[mid] > array[first] && array[first] <= element && array[mid]>element )
		{
			last = mid-1;
		}
		else
		{
			first = mid + 1;
		}
	}

	if(found == true)
	{
		System.out.println("find");
	}
	else
	{
		System.out.println(" not present");
	}


}

public void nextGreaterNumber(String s1) {
	char array[] = s1.toCharArray();
	System.out.println(s1);
	int position = 0;
	boolean isPossible = false;
	for(int i=array.length-1;i>0;i--)
	{
		if(array[i] > array[i-1])
		{
			position = i-1;
			isPossible = true;
			break;
		}
	}


	if(isPossible == true)
	{
		System.out.println("position " + position);
		int smallestNumber = array[position+1];
		int swapPosition = position + 1;
		for(int i=position+1; i<array.length;i++)
		{
			if(smallestNumber > array[i])
			{
				swapPosition = i;
			}
		}

		System.out.println("swap position " + swapPosition);
		char temp = array[position];
		array[position] = array[swapPosition]; 
		array[swapPosition] = temp;

		TreeSet<Character> t = new TreeSet<Character>();


		for(int i=position +1; i<array.length;i++)
		{
			t.add(array[i]);
		}

		System.out.println(t);
		Iterator<Character> it = t.iterator();
		while(it.hasNext())
		{
			array[position+1] = it.next();
			position++;
		}


		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);
		}


	}
	else
	{
		System.out.println("not possible");
	}
}

public void frequencyOfElement(int array[]) {
	HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();

	for(int i=0;i<array.length;i++)
	{
		int count = 0;
		for(int j=0;j<array.length;j++)
		{
			if(array[i] == array[j])
			{
				count++;
			}
		}
		System.out.println(array[i] + " " + count);
		hs.put(array[i],count);
	}

	System.out.println(hs);
}
public void nextGreaterElement(int array[]) {
	for(int i=0;i<array.length;i++)
	{
		int element = array[i];

		for(int j=i+1;j<array.length;j++)
		{
			if(array[j]>element)
			{
				System.out.println("next greater element of " + element + " is " + array[j]);
				break;
			}
		}
	}
}

public void nextGreaterElementThoughStack(int array[])
{
	Stack<Integer> s1 = new Stack<Integer>();
	s1.push(array[0]);
	boolean isEqual = false;

	for(int i=1;i<array.length;i++)
	{
		while(!s1.isEmpty())
		{	
			int popElement = s1.pop();
			if(array[i]>popElement)
			{
				System.out.println(popElement + " -> " + array[i]);
			}
			else
			{
				s1.push(popElement);
				break;
			}
		}

		s1.push(array[i]);
	}

}

public void sumOfGivenNumber(int array[], int number)
{
	int  firstIndex = 0;
	int secondIndex = 0;
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	boolean isPresent = false;
	for(int i=0;i<array.length;i++)
	{
		hm.put(array[i],i);
	}


	for(int i=0;i<array.length;i++)
	{
		int find = number - array[i];

		Integer index = hm.get(find);

		if(index!=null)
		{
			firstIndex = i;
			secondIndex = index;
			isPresent = true;
			break;
		}
	}

	if(isPresent == true)
	{
		System.out.println("sum of " + number + " is found " + firstIndex + " , " + secondIndex);
	}
	else
	{
		System.out.println("pair is not possible");
	}

}

public void display(int array[])
{
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
}

}
