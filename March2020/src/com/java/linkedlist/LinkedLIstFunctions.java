package com.java.linkedlist;

import java.util.HashSet;

public class LinkedLIstFunctions {
	Node head = null;
	Node head2 = null;
	DoublyNode head1 = null;
	Node odd = null;
	Node even = null;


	public void add(int data)
	{
		Node nd = new Node();
		nd.data = data;
		nd.next = null;

		if(head == null)
		{
			head = nd;
		}
		else
		{
			Node temp = head;

			while(temp.next != null)
			{
				temp = temp.next;
			}

			temp.next = nd;
		}
	}

	public void add1(int data)
	{
		Node nd = new Node();
		nd.data = data;
		nd.next = null;

		if(head2 == null)
		{
			head2 = nd;
		}
		else
		{
			Node temp = head2;

			while(temp.next != null)
			{
				temp = temp.next;
			}

			temp.next = nd;
		}



	}
	public void toCheckMergeOfLinklist()
	{
		HashSet<Node> hs = new HashSet<Node>();

		Node temp1 = head;
		Node temp2 = head2;
		boolean result  = false;
		int data = -1;
		while(temp1 != null)
		{
			hs.add(temp1);
			temp1 = temp1.next;
		}


		while(temp2 != null)
		{
			if(hs.contains(temp2))
			{
				result = true;

				data = temp2.data;
				break;
			}
			else
			{
				temp2 = temp2.next;
			}
		}


		if(result == false)
		{
			System.out.println("not merged");
		}
		else
		{
			System.out.println("merging point " + temp2.data);
		}
	}

	public void  oddEven() {


		Node temp = head;
		Node put = temp;

		
		while(temp != null )
		{

			Node nd = new Node();
			nd.data = temp.data;
			nd.next = null;
			if(temp.data % 2 == 0)
			{
				if(even == null)
				{
					even = nd;
				}
				else
				{
					Node evenTemp = even;

					while(evenTemp.next != null)
					{
						evenTemp = evenTemp.next;
					}

					evenTemp.next = nd;
				}

			}
			else
			{
				if(odd == null)
				{
					odd = nd;
				}
				else
				{
					Node oddtemp = odd;

					while(oddtemp.next != null)
					{
						oddtemp = oddtemp.next;
					}

					oddtemp.next = nd;
				}

			}


			temp = temp.next;
		}

		System.out.println("even");
		Node temp32 = even;
		while(temp32.next != null)
		{
			temp32 = temp32.next;
		}

		temp32.next = odd;
		System.out.println("odd even complete");
		display1(even);
	}

	public void createTwoMergeLinkedList() {
		Node temp1 = head;
		Node temp2 = head2;
		temp1 = temp1.next.next;

		while(temp2.next != null)
		{
			temp2 = temp2.next;
		}


		temp2.next = temp1;
	}


	public boolean detectLoopInLinkedList() {
		Node temp = head;
		Node midelement = temp;
		boolean isLoopDetect = false;
		while(temp.next != null)
		{
			temp = temp.next.next;
			midelement = midelement.next;
			if(temp == midelement)
			{
				isLoopDetect = true;
				break;
			}
		}
		if(isLoopDetect == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Node reverseLinkedListThroughRecursion(Node previous , Node current)
	{
		if(current != null)
		{
			Node temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
			Node head = reverseLinkedListThroughRecursion(previous , current);
			return head;
		}
		else {
			return previous;
		}
	} 

	public Node reverseLinkedList()
	{
		if(head != null || head.next != null)
		{
			Node previous = null;
			Node current = head;
			Node nxt = current.next;


			while( nxt != null )
			{
				Node temp = nxt.next;

				nxt.next = current;
				current.next = previous;

				previous = current;
				current = nxt;
				nxt = temp;

			}

			return current;
		}
		else
		{
			return head;
		}
	}

	public void doublyLinkedlistAdd(int data)
	{
		DoublyNode nd = new DoublyNode();
		nd.data = data;
		nd.previous = null;
		nd.next = null;

		if(head1 == null)
		{
			head1 = nd;
		}
		else
		{
			DoublyNode temp = head1;

			while(temp.next != null)
			{
				temp = temp.next;

			}
			temp.next = nd;
			nd.previous = temp;
		}

	}

	public void display() {
		Node temp = head;

		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}


	public void display1(Node head) {
		Node temp = head;

		while(temp!=null)
		{
			System.out.print(temp.data + "->" );
			temp = temp.next;
		}
	}


	public void doublydisplay() {
		DoublyNode temp = head1;

		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}


	public void reversedisplay() {
		DoublyNode temp = head1;

		while(temp.next!=null)
		{

			temp = temp.next;
		}

		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.previous;
		}
	}

	public void middleElement() {
		Node temp = head ;
		Node middle = head;
		while(temp.next != null)
		{
			if(temp.next.next!=null)
			{
				temp = temp.next.next;
			}
			else
			{
				temp = temp.next;
			}
			middle = middle.next;
		}

		System.out.println(middle.data);
	}


}
