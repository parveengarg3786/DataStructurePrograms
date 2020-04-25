package com.java.Practise.sortingProgram;

import java.io.IOException;

public class DriverProgram {
	public static void main(String[] args) throws NumberFormatException, IOException {
		SearchingFunction sf = new SearchingFunction();
		int array[] = sf.arrayInput();
		sf.quickSort(array, 0, array.length-1);
	}
}
