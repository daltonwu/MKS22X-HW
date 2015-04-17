public class TreeNode<E> {
	private E data;
	private TreeNode<E> left, right;
	
	public TreeNode(E d) {
		data = d;
	}
	
	public String toString() {
		return "" + data;
	}
	
	public void setData(E d) {
		data = d;
	}
	public void setLeft(TreeNode<E> l) {
		left = l;
	}
	public void setRight(TreeNode<E> r) {
		right = r;
	}
	
	public E getData() {
		return data;
	}
	public TreeNode<E> getLeft() {
		return left;
	}
	public TreeNode<E> getRight() {
		return right;
	}
}
