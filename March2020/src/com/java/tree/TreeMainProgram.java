package com.java.tree;

public class TreeMainProgram {
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(100);
		TreeNode t2 = new TreeNode(12);
		TreeNode t3 = new TreeNode(13);
		TreeNode t4 = new TreeNode(14);
		TreeNode t5 = new TreeNode(15);
		TreeNode t6 = new TreeNode(16);
		TreeNode t7 = new TreeNode(17);
		
		t1.left = t2;
		t1.right = t3;
		
		t2.left = t4;
		t2.right = t5;
		
		t3.left = t6;
		t3.right = t7;
		
		
		TreeFunction tf = new TreeFunction();
		tf.preorder(t1);
		
		System.out.println("inordee");
		tf.inorder(t1);
		
		System.out.println("in order traversal without recursion");
		tf.inorderWithoutRecursion(t1);
		
		System.out.println("post order");
		tf.postorder(t1);
		
		System.out.println("post order without recursion");
		tf.postOrderWithoutrecursion(t1);
		
		System.out.println("level order traversal");
		tf.levelOrderTraversing(t1);
		
		System.out.println("preorder traversal");
		tf.preorder(t1);
		
		
//		System.out.println("heapify" +  t1.data);
//		tf.heapify(t1);
//		
//		System.out.println("level order traversal after heapify");
//		tf.levelOrderTraversing(t1);
//		
//		
		System.out.println("preorder without recursion");
		tf.preorderWithoutRecursion(t1);
		
		System.out.println("right side view");
		tf.rightView(t1);
		
		System.out.println("left side view");
		tf.leftView(t1);
		
		System.out.println("bottom view");
		tf.bottomView(t1);
		
		System.out.println("spiral order traversal");
		tf.spiralOrderTraversal(t1);
		
		System.out.println("height of tree");
		int result = tf.heightOfTree(t1, 0);
		result = result - 1;
		System.out.println("height of a tree is : " + result);
		
		
		System.out.println("common parent of two root are");
		int result1 = tf.commonAncester(t1, 14, 15);
		System.out.println(result1);
	
		System.out.println("Diameter of tree");
		int diameter[] = tf.diameterOfTree(t1);
		System.out.println(diameter[1]);
	
	}
}
