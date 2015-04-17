/*========== BinaryTree.java ==========
  
  Basic binary tree.
  Uses TreeNode
  
  jdyrlandweaver
  =========================*/

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
	
	/*======== public int getHeight()) ==========
	  Inputs:   
	  Returns: The height of the tree

	  Wrapper for the recursive getHeight method
	  ====================*/
	public int getHeight() {
		return getHeight(root, 0);
	}
	
	/*======== public int getHeight() ==========
	  Inputs:   TreeNode<E> curr  
	  Returns:  The height of the tree rooted at node curr
	  
	  ====================*/
	public int getHeight(TreeNode<E> curr) {
		return getHeight(curr, 0);
	}
	
	public int getHeight(TreeNode<E> curr, int height) {
		if(curr == null) {
			return height;
		}
		int a = getHeight(curr.getLeft(), height+1);
		int b = getHeight(curr.getRight(), height+1);
		return a>b ? a : b;
	}
	
	/*======== public String getLevel() ==========
	  Inputs:   TreeNode<E> curr
	            int level
	            int currLevel  
	  Returns: A string containing all the elements on the
	           given level, ordered left -> right
	  
	  ====================*/
	public String getLevel(TreeNode<E> curr, int level, int currLevel) {
		if(curr == null) {
			return "";
		}
		if(currLevel == level) {
			return curr.getLeft() + "\t" + curr.getRight() + "\t";
		}
		return getLevel(curr.getLeft(), level, currLevel+1) + getLevel(curr.getRight(), level, currLevel+1);
	}
	
	/*======== public String toString()) ==========
	  Inputs:   
	  Returns: A string representation of the tree
	 
	  This string should display each level as a separate line.
	  A simple version might look something like this:

	  0
	  1 2
	  3 4 5
	
	  Note that you cannot tell exactly where 3, 4 and 5 lie.
	  That is ok, but if you want a challenge, you can try to
	  get the output to look nicer, something like this:

	       0
	    1     2
	     3   4 5

	  04/05/12 09:13:06
	  jdyrlandweaver
	  ====================*/
	public String toString() {
		String str = "";
		int lim = getHeight(root);
		for(int i=0; i<lim; i++) {
			str += getLevel(root, i, 0) + "\n";
		}
		return str;
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
		System.out.println("Height: " + t.getHeight());
		System.out.println(t);
	}
}
