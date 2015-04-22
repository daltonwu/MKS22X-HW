public class BinarySearchTreeNode<T extends Comparable> {
	private T data;
	private BinarySearchTreeNode<T> left, right;
	
	public BinarySearchTreeNode(T d) {
		data = d;
		left = right = null;
	}
	
	// getters …
	public T getData() {
		return data;
	}
	public BinarySearchTreeNode<T> getLeft() {
		return left;
	}
	public BinarySearchTreeNode<T> getRight() {
		return right;
	}
	
	// … 'n' setters
	public void setData(T d) {
		data = d;
	}
	public void setLeft(BinarySearchTreeNode<T> l) {
		left = l;
	}
	public void setRight(BinarySearchTreeNode<T> r) {
		right = r;
	}
}

