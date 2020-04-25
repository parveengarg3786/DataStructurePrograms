package com.java.matrix;

import java.io.IOException;

public class DriverProgram {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Function fn = new Function();
		int array1[][] = fn.input();
		
		//int array2[][] = fn.input1();
		fn.display(array1);
		
		//int thirdArray[][] = fn.add(array1, array2);
		//System.out.println("Result the adding of two array");
		//fn.display(thirdArray);
		
//		System.out.println("transpose of a matrix");
//		int trans[][] = fn.transposeOfMatrix(array1);
//		
//		fn.display(trans);
		
//		
//		System.out.println("rotation of matrix");
//		fn.rotationOfMatrix(array1);
		
		
		System.out.println("spiral of matrix");
		fn.spiralOfMatrix(array1);
		
		System.out.println("searching");
		fn.searching(array1, 40);
	}
}
