/*========== BinaryTree.java ==========
  
  Basic binary tree.
  Uses TreeNode
  
  jdyrlandweaver
  =========================*/

/*import java.io.*;
import java.util.*;*/

import java.util.Random;

public class BinaryTree<E> {
	public static final int PRE_ORDER = 0;
	public static final int IN_ORDER = 1;
	public static final int POST_ORDER = 2;
	
	private TreeNode<E> root;
	
	public BinaryTree() {
		root = null;
	}
	
	/*======== public void add() ==========
	  Inputs:   E d
	  Returns: 
	  
	  Wrapper method for the recursive add().
	  ====================*/
	public void add(E d) {
		TreeNode<E> bt = new TreeNode<E>(d);
		
		if(root == null)
			root = bt;
		else
			add(root, bt);
	}
	
	/*======== public void add() ==========
	  Inputs:   TreeNode<E> curr, TreeNode<E> bt  
	  Returns: 
	  
	  Adds bt to the tree rooted at curr. If curr has 
	  an available child space, then attach bt there.
	
	  Otherwise, try to add at the subtree rooted at
	  one of curr's children. Choose the child to be
	  added to randomly.
	  ====================*/
	public void add(TreeNode<E> curr, TreeNode<E> bt) {
		if(curr == null)
			return;
		
		if(curr.getLeft() == null)
			curr.setLeft(bt);
		else if(curr.getRight() == null)
			curr.setRight(bt);
		else {
			Random rand = new Random();
			if(rand.nextInt(2) == 0)
				add(curr.getLeft(), bt);
			else
				add(curr.getRight(), bt);
		}
	}
	
	public void traverse(int mode) {
		switch(mode) {
			case PRE_ORDER:
				preOrder(root);
				break;
			case IN_ORDER:
				inOrder(root);
				break;
			default:
				postOrder(root);
				break;
		}
		System.out.println();
	}
	/*======== public void preOrder() ==========
	  Inputs:   TreeNode<E> curr  
	  Returns: 
	  
	  Prints out the elements in the tree by doing a
	  pre-order traversal.
	  ====================*/
	public void preOrder(TreeNode<E> curr) {
		if(curr == null)
			return;
		System.out.println(curr.getData());
		preOrder(curr.getLeft());
		preOrder(curr.getRight());
	}
	
	
	/*======== public void inOrder() ==========
	  Inputs:   TreeNode<E> curr  
	  Returns: 
	  
	  Prints out the elements in the tree by doing an
	  in-order traversal.
	  ====================*/
	public void inOrder(TreeNode<E> curr) {
		if(curr == null)
			return;
		inOrder(curr.getLeft());
		System.out.println(curr.getData());
		inOrder(curr.getRight());
	}
	
	/*======== public void postOrder() ==========
	  Inputs:   TreeNode<E> curr  
	  Returns: 
	  
	  Prints out the elements in the tree by doing a
	  post-order traversal.
	
	  04/05/12 08:56:34
	  jdyrlandweaver
	  ====================*/
	public void postOrder(TreeNode<E> curr) {
		if(curr == null)
			return;
		postOrder(curr.getLeft());
		postOrder(curr.getRight());
		System.out.println(curr.getData());
	}
	
	
	public static void main(String[] args) {
		BinaryTree<Integer> t = new BinaryTree<>();
		
		for(int i=0; i<8; i++)
			t.add(i);
		
		System.out.println("Pre-order: ");
		t.traverse(PRE_ORDER);
		System.out.println("In-order: ");
		t.traverse(IN_ORDER);
		System.out.println("Post-order: ");
		t.traverse(POST_ORDER);
	}
}
