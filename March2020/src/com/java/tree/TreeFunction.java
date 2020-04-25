package com.java.tree;

import java.util.*;
import java.util.Queue;
import java.util.Stack;



public class TreeFunction {
	int array[] = new int[2];
	
	public int[] diameterOfTree(TreeNode root)
	{
		if(root == null)
		{
			return new int[2];
		}
		else
		{			
			int leftHeight[] = diameterOfTree(root.left);
			int rightHeight[]  = diameterOfTree(root.right);
			
			int diameter = leftHeight[0] + rightHeight[0] + 1;
			
			if(leftHeight[1]>rightHeight[1] && leftHeight[1] > diameter)
			{
			array[1] = leftHeight[1];	
			}
			else if(rightHeight[1] > leftHeight[1] && rightHeight[1] > diameter)
			{
				array[1] = rightHeight[1];
			}
			else
			{
				array[1] = diameter;
			}
			
			int maxheight = Math.max(leftHeight[0], rightHeight[0]);
			array[0] = maxheight + 1;
			
			return array;
		}
	}

	public int commonAncester(TreeNode root, int number1,int number2 ) {
		if(root != null)
		{
			if(root.data == number1 || root.data == number2)
			{
				return root.data;
			}
			int left = commonAncester(root.left, number1, number2);
			int right = commonAncester(root.right, number1, number2);
			
			if(left != 0 && right != 0)
			{
				return root.data;
			}
			else if(left != 0)
			{
				return left;
			}
			else
			{
				return right;
			}
		}
		else
		{
			return 0;
		}
	}
	
	public void preorder(TreeNode root) {
		if(root!=null)
		{
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}

	}

	public void inorder(TreeNode root) {
		if(root!=null)
		{

			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}

	}

	public void postorder(TreeNode root) {
		if(root!=null)
		{

			preorder(root.left);
			preorder(root.right);
			System.out.println(root.data);
		}

	}

	public void preorderWithoutRecursion(TreeNode root) {
		Stack<TreeNode> st = new Stack<TreeNode>();

		if(root != null)
		{

			st.push(root);

			while(!st.isEmpty())
			{
				TreeNode currentNode = st.pop();
				System.out.println(currentNode.data);

				if(currentNode.right != null)
				{
					st.push(currentNode.right);
				}
				if(currentNode.left != null)
				{
					st.push(currentNode.left);
				}
			}

		}
	}

	public void inorderWithoutRecursion(TreeNode root) {
		Stack<TreeNode> st = new Stack<TreeNode>();

		if(root != null)
		{

			st.push(root);

			while(!st.isEmpty())
			{

				while( root != null)
				{

					st.push(root);

					root = root.left;
				}

				root = st.pop();


				System.out.println(root.data);

				root = root.right;
			}

		}
	}


	public void postOrderWithoutrecursion(TreeNode root)
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		Stack<TreeNode> st2 = new Stack<TreeNode>();

		st.push(root);

		while(!st.isEmpty())
		{
			TreeNode currentNode  = st.pop();

			if(currentNode.right != null)
			{
				st.push(currentNode.right);
			}
			if(currentNode.left != null)
			{
				st.push(currentNode.left);
			}
			st2.push(currentNode);

		}

		while(!st2.isEmpty())
		{
			TreeNode currentNode  = st2.pop();
			System.out.println(currentNode.data);
		}
	}
	public void heapify(TreeNode root) {
		if(root!=null)
		{
			if(root.left != null && root.right != null)
			{
				int temp = root.data;
				if(root.left.data < root.right.data && root.left.data < root.data)
				{
					root.data = root.left.data;
					root.left.data = temp;

					heapify(root.left);

				}

				else if (root.right.data < root.left.data && root.right.data < root.data)
				{
					root.data = root.left.data;
					root.right.data = temp;

					heapify(root.right);
				}
			}
			else if(root.left != null && root.right == null)
			{
				int temp = root.data;
				if(root.left.data < root.data)
				{
					root.data = root.left.data;
					root.left.data = temp;

					heapify(root.left);
				}
			}
			else if(root.right != null && root.left == null)
			{
				int temp = root.data;
				if(root.right.data < root.data)
				{
					root.data = root.right.data;
					root.right.data = temp;

					heapify(root.right);
				}
			}
		}

	}
	public void bottomView(TreeNode root)
	{
		if(root != null)
		{
			Queue<TreeNode> q = new LinkedList<TreeNode>();
			
			HashMap<Integer,TreeNode> hm = new HashMap<Integer,TreeNode>();
			
			q.add(root);
			int hd = 0;
			hm.put(hd, root);
			
			while(!q.isEmpty())
			{
				TreeNode value = q.poll();
				System.out.println(value.data);
				hd = value.hd;
				if(value.left != null)
				{
					hd = hd - 1;
					value.left.hd = hd;
					hm.put(hd, value.left);
					q.add(value.left);
				}
				hd = value.hd;
				if(value.right != null)
				{
					hd = hd + 1;
					value.right.hd = hd;
					hm.put(hd, value.right);
					q.add(value.right);
				}
				
			}
			
			System.out.println(hm);
			
			
			
		}
	}
	
	public void spiralOrderTraversal(TreeNode root)
	{
		if(root != null)
		{
			Stack<TreeNode> s1 = new Stack<TreeNode>();
			Stack<TreeNode> s2 = new Stack<TreeNode>();
			
			s1.push(root);
			
			while(!s1.isEmpty() || !s2.isEmpty())
			{
				
				
				while(!s1.isEmpty())
				{
					TreeNode node = s1.pop();
					System.out.println(node.data);
					
					if(node.left != null)
					{
						s2.push(node.left);
					}
					if(node.right != null)
					{
						s2.push(node.right);
					}
				}
				
				while(!s2.isEmpty())
				{
					TreeNode node = s2.pop();
					System.out.println(node.data);
					
					if(node.right != null)
					{
						s1.push(node.right);
					}
					if(node.left != null)
					{
						s1.push(node.left);
					}
				
				}
			}
		}
	}
	
	
	public int heightOfTree(TreeNode root, int height)
	{
		if(root != null)
		{
			int leftheight = heightOfTree(root.left, height+1);
			int rightheight = heightOfTree(root.right, height+1);
			
			if(leftheight > rightheight)
			{
				return leftheight;
			}
			else
			{
				return rightheight;
			}
		}
		else
		{
			return height;
		}
	}
	
	public void leftView(TreeNode root)
	{
		if(root != null)
		{
			Queue<TreeNode> q1 = new LinkedList<TreeNode>();
			
			q1.add(root);
			
			while(!q1.isEmpty())
			{
				int n = q1.size();
				
				for(int i=1;i<=n;i++)
				{
					TreeNode current = q1.poll();
					
					if(i == 1)
					{
						System.out.println(current.data);
					}
					if(current.left != null)
					{
						q1.add(current.left);
					}
					if(current.right != null)
					{
						q1.add(current.right);
					}
					
				}
			}
		}
	}

	public void rightView(TreeNode root) {
		if(root != null) {
			
			Queue<TreeNode> q1 = new LinkedList<TreeNode>();
			
			q1.add(root);
			
			while(!q1.isEmpty()) {
							
				int n = q1.size();
				
				for(int i=1;i<=n;i++)
				{
					TreeNode data = q1.poll();
					
					if(i == n)
					{
						System.out.println(data.data);
					}
					if(data.left != null)
					{
						q1.add(data.left);
					}
					if(data.right != null)
					{
						q1.add(data.right);
					}
					
				}
			}
			
		}
	}
	
	public void levelOrderTraversing(TreeNode root)
	{
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		q1.add(root);

		while(!q1.isEmpty())
		{
			TreeNode root1 = q1.remove();

			System.out.println(root1.data);

			if(root1.left!=null)
			{
				q1.add(root1.left);
			}
			if(root1.right != null)
			{
				q1.add(root1.right);
			}
		}

	}

}
