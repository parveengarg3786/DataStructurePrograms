package com.java.linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		
		LinkedLIstFunctions lf = new LinkedLIstFunctions();
		lf.add(1);
		lf.add(2);
		lf.add(3);
		lf.add(4);
		lf.add(5);
		lf.add(6);
		lf.display();
		
		lf.add1(11);
		lf.add1(23);
		lf.add1(33);
		lf.add1(44);
		lf.createTwoMergeLinkedList();
		lf.display1(lf.head2);
		System.out.println();
		
		lf.toCheckMergeOfLinklist();
		System.out.println("oddeven");
		lf.oddEven();
//		lf.doublyLinkedlistAdd(51);
//		lf.doublyLinkedlistAdd(52);
//		lf.doublyLinkedlistAdd(53);
//		lf.doublyLinkedlistAdd(54);
//		lf.doublyLinkedlistAdd(55);
//		lf.doublyLinkedlistAdd(56);
//		lf.reversedisplay();
//		lf.middleElement();
		
		System.out.println("reverse linkedlist");
		Node head = lf.reverseLinkedListThroughRecursion(null, lf.head);
		lf.display1(head);
	
		System.out.println();
		//check whether linkedlist contain loop ur not
		
		boolean loop = lf.detectLoopInLinkedList();
		if(loop == true)
		{
			System.out.println("loop is present");
		}
		else
		{
			System.out.println("loop is not present");
		}
		
	}
}
