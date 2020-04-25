package com.java.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Function {

	public int[][] input() throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array[][] = new int[4][4];


		System.out.println("enter the input for first matrix");

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				array[i][j] = Integer.parseInt(br.readLine());
			}
		}
		return array;
	}

	public int[][] input1() throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int array[][] = new int[5][5];


		System.out.println("enter the input for second matrix");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j] = Integer.parseInt(br.readLine());
			}
		}
		return array;
	}

	public int[][] add(int array1[][], int array2[][]) {
		int c[][] = new int[3][3];

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return c;
	}

	public void display(int array[][]) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}


	public int[][] transposeOfMatrix(int array[][]) {

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j>i)
				{
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}
		}
		
		return array;
	}
	
	public void rotationOfMatrix(int[][] matrix)
	{
		int transposeMatrix[][] = transposeOfMatrix(matrix);
		int result[][] = reverseOfMatrix(transposeMatrix);
		display(result);
	}
	
	public void spiralOfMatrix(int[][] matrix)
	{
		
		int rowStartIndex = 0;
		int rowEndIndex = 4;
		int columnStartIndex = 0;
		int columnEndIndex = 4;

		while(rowStartIndex < rowEndIndex && columnStartIndex < columnEndIndex)
		{
			for(int i=columnStartIndex;i<columnEndIndex;i++)
			{
				System.out.print(matrix[rowStartIndex][i] + " ");
			}
			rowStartIndex++;
			for(int i=rowStartIndex;i<rowEndIndex;i++)
			{
				System.out.print(matrix[i][columnEndIndex-1] + " ");
			}
			columnEndIndex--;
			
			if(rowStartIndex < rowEndIndex)
			{
				for(int i=columnEndIndex-1;i >= rowStartIndex-1;i--)
				{
					System.out.print(matrix[rowEndIndex-1][i] + " ");
				}
				rowEndIndex--;
			}
			
			if(columnStartIndex < columnEndIndex)
			{
				for(int i=rowEndIndex-1;i>=rowStartIndex;i--)
				{
					System.out.print(matrix[i][columnStartIndex] + " ");
				}
				columnStartIndex++;
			}
		}
		
	}
	
	
	public int[][] reverseOfMatrix(int[][] matrix) {
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==2)
				{
					int temp = matrix[i][0];
					matrix[i][0] = matrix[i][j];
					matrix[i][j] = temp;
				}
			}
		}
		
		return matrix;
	}
	
	public void searching(int[][] matrix,int number)
	{
		boolean found = false;
		
		int rowStartIndex = 0;
		int rowEndIndex = 4;
		int columnStartIndex = 0;
		int columnEndIndex = 4;
		
		while(rowStartIndex < rowEndIndex && columnStartIndex < columnEndIndex)
		{
			if(number == matrix[rowStartIndex][columnEndIndex - 1])
			{
				found = true;
				break;
			}
			else if(number <  matrix[rowStartIndex][columnEndIndex - 1])
			{
				columnEndIndex--;
			}
			else 
			{
				rowStartIndex++;
			}
		}
		
		
		if(found == true)
		{
			System.out.println("number found");
		}
		else
		{
			System.out.println("number not found");
		}
	}
	
}
