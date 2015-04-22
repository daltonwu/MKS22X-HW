public class BinarySearchTree<T extends Comparable<? super T>> {
	public BinarySearchTreeNode<T> root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	public boolean isLeaf(BinarySearchTreeNode<T> t) {
		return t.getLeft() == null && t.getRight() == null;
	}
	
	/*======== public void add() ==========
	  Inputs:   T c  
	  Returns: 
	  
	  Wrapper for the recursive add method
	  ====================*/
	public void add(T c) {
		root = add(root, new BinarySearchTreeNode<T>(c));
	}
	
	/*======== public BinarySearchTreeNode<T> add() ==========
	  Inputs:  BinarySearchTreeNode<T> curr
	           BinarySearchTreeNode<T> t 
	  Returns: BinarySearchTreeNode<T> curr
	  
	  Add t to the correct place in the tree rooted at curr.
	  ====================*/
	public BinarySearchTreeNode<T> add(BinarySearchTreeNode<T> curr, BinarySearchTreeNode<T> t) {
		if(curr == null) {
			curr = t;
		}
		else if(t.getData().compareTo(curr.getData()) < 0) {
			add(curr.getLeft(), t);
		}
		else {
			add(curr.getRight(), t);
		}
		
		return curr;
	}
	
	/*======== public void remove() ==========
	  Inputs:   T c  
	  Returns: 
	  
	  Wrapper for the recursive remove method
	  ====================*/
	public void remove(T c) {
		root = remove(root, c);
	}
	
	/*======== public BinarySearchTreeNode<T> remove() ==========
	  Inputs:   BinarySearchTreeNode<T> curr
	            T c
	  Returns:  BinarySearchTreeNode<T> curr
	  
	  Removes the value c from the tree rooted at
	  curr, if it exists.
	  ====================*/
	public BinarySearchTreeNode<T> remove(BinarySearchTreeNode<T> curr, T c) {
		if(curr == null) return null;
		int compare = curr.getData().compareTo(c);
		if(compare == 0) {
			if(isLeaf(curr)) return null;
			if(curr.getLeft() == null) {
				curr = curr.getRight();
			}
			if(curr.getRight() == null) {
				curr = curr.getLeft();
			}
			else {
				curr = rhs(curr).setRight(curr.getRight());
			}
		}
		else if(compare < 0) {
			curr = remove(curr.getLeft(), c);
		}
		else {
			curr = remove(curr.getRight(), c);
		}
		
		return curr;
	}
	
	// run lhs() on getRight()
	public BinarySearchTreeNode<T> lhs(BinarySearchTreeNode<T> curr) {
		if(isLeaf(curr.getLeft())) {
			
		}? curr : lhs(curr.getLeft()));
	}
	// run rhs() on getLeft()
	public BinarySearchTreeNode<T> rhs(BinarySearchTreeNode<T> curr) {
		return (isLeaf(curr) ? curr : rhs(curr.getRight()));
	}
	
	/*======== public void inOrder()) ==========
	  Inputs:   
	  Returns: 
	  
	  Wrapper for the recursive inOrder method
	  ====================*/
	public void inOrder() {
		inOrderHelper(root);
		System.out.println();
	}
	
	/*======== public void inOrderHelper() ==========
	  Inputs:   BinarySearchTreeNode<T> t  
	  Returns: 
	  
	  Performs an in-order traversal for the tree with 
	  root t.
	  ====================*/
	public void inOrderHelper(BinarySearchTreeNode<T> t) {
		if(t == null) return;
		inOrderHelper(t.getLeft());
		System.out.print(t.getData() + " ");
		inOrderHelper(t.getRight());
	}
	
	/*======== public void traverse() ==========
	  Inputs: 
	  Returns: 
	  
	  Performs a traversal of the tree formatted for use
	  with the "dot" program to create an image of the tree.

	  To create the image:
	  1. modify main so that it only prints out the result
	  of this method.
	  2. in the shell, do the following:
	       $ java BinarySearchTree > tree.dot
	     this will put the output of the program into a 
	     file called tree.dot
	   $ dot -Tpng tree.dot -o tree.png
	     this will create the image file tree.png
	   $ display tree.png
	  ====================*/
	public void traverse() {
		System.out.println("digraph T {");
		traverse(root);
		System.out.println("}");
	}
	
	public void traverse(BinarySearchTreeNode<T> t) {
		if(t == null) return;
		if(t.getLeft() != null) {
			System.out.println("edge [color=red]");
			System.out.println(t.getData() + " -> " + t.getLeft().getData() + ";");
		}
		if(t.getRight() != null) {
			System.out.println("edge [color=blue]");
			System.out.println(t.getData() + " -> " + t.getRight().getData() + ";");
		}
		
		traverse(t.getLeft());
		traverse(t.getRight());
	}
	
	public static void main(String[] args) {
		
	}
}
