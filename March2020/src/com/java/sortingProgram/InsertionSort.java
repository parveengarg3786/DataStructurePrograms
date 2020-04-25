package com.java.sortingProgram;

import java.io.IOException;

public class InsertionSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayInput arr = new  ArrayInput();
		int array[] = arr.arrayInput();
	
		 arr.insertionSort(array);
		
		arr.display(array);
	}
}
