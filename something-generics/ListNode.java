public class ListNode <E>{
	private E data;
	private ListNode next;
	
	public ListNode() {
		super();
	}
	public ListNode(E data) {
		this.data = data;
	}
	
	public toString() {
		return "" + data;
	}
	
	public void setData(E data) {
		this.data = data;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public E getData() {
		return data;
	}
	public ListNode getNext() {
		return next;
	}
}
