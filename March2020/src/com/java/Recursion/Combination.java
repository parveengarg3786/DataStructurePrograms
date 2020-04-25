package com.java.Recursion;

public class Combination {
public static void main(String[] args) {
	int array[] = new int[3];
	int index = 0;
	combination(array,index);
}

static public void combination(int array[],int index)
{
	if(index<array.length)
	{
		array[index] = 0;
		combination(array, index+1);
		array[index] = 1;
		combination(array, index+1);
	}
	else
	{
		display(array);
		System.out.println();
	}
}

static public void display(int array[])
{
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]);
	}
	
}

}
