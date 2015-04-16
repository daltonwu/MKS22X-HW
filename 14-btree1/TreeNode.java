public class TreeNode<E> {
	private E data;
	private TreeNode left, right;
	
	public TreeNode(E d) {
		data = d;
	}
	
	public String toString() {
		return "" + data;
	}
	
	public void setData(E d) {
		data = d;
	}
	public void setLeft(TreeNode l) {
		left = l;
	}
	public void setRight(TreeNode r) {
		right = r;
	}
	
	public E getData() {
		return data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public TreeNode getRight() {
		return right;
	}
}
