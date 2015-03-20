public class ListNode<E> {
	private ListNode front;
	private E data;
	
	public ListNode(E data) {
		this.data = data;
	}
	
	public void setNext(ListNode next) {
		this.front = next;
	}
	public void setData(E data) {
		this.data = data;
	}
	
	public ListNode getNext() {
		return this.front;
	}
	public E getData() {
		return this.data;
	}
}
