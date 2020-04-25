package com.java.ArrayProgram;

import java.io.IOException;

public class ArrayMainProgram {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ArrayFunction af = new ArrayFunction();
		int array[] = af.arrayInput();
		
//		af.nextGreaterElement(array);
//		System.out.println("next greater element using stack");
//		af.nextGreaterElementThoughStack(array);
//		
//		System.out.println("find pair of index");
//		af.sumOfGivenNumber(array, 6);
//		
//		System.out.println("remove duplicate from array");
//		af.removeDuplicateElementFromArray(array);
//	
//		System.out.println("frequency of element");
//		af.frequencyOfElement(array);
//		
//		System.out.println("largest Number in array");
//		af.largestNumber(array);
//		
//		System.out.println("next greater number");
//		af.nextGreaterNumber("534976");
//		
//		System.out.println("all zero at end");
//		af.zeroAtlast(array);
//		
//		System.out.println("binary serach in rotated array");
//		af.binarySearchOnRotatedArray(array, 11);
		
		
		
		System.out.println("sorting of array");
		af.mergeSort(array, 0, array.length-1);
		af.display(array);
	}
}
