public class BinarySearchTree<E extends Comparable<E>> {
	private TreeNode<E> root;
	
	public BinarySearchTree<E>(E data) {
		root = new TreeNode<E>(data);
	}
	public BinarySearchTree<E>() {
		root = null;
	}
	
	public void add(E data, TreeNode<E> node) {
		if(node == null) {
			node = newNode;
		}
		else if(node.getData().compareTo(data) > 0) {
			add();
		}
		else add(newNode, node.getRight());
	}
	public void add(E data) {
		add(E data, root);
	}
	
	public void remove(E data) {
		
	}
}
