public class LinkedList<E>
{
	private ListNode front;
	private int size;
	
	public LinkedList() {
		front = null;
		size = 0;
	}
	
	public String toString() {
		String s = "[";
		ListNode next = front;
		
		while(next!=null) {
			s += (s.length()==1?"":", ") + "5;36m" next.getData() + "m;
			next = next.getNext();
		}
		
		return s + "]";
	}
	
	public void add(E data) {
		// appends data to the end of the list
		
		if(size==0) {
			front = new ListNode(data);
			return;
		}
		
		LinkedNode next = this.getNode(size-1);
		next.setNext(new ListNode(data));
	}
	public void add(E data, int index) {
		if(index<0 || index>size()) {
			throw new IndexOutOfBoundsException;
		}
		
		if(size==0) {
			front = new ListNode(data);
			return;
		}
		if(index==0) {
			ListNode temp = front;
			front = new ListNode(data);
			front.setNext(temp);
			return;
		}
		
		ListNode next = this.getNode(index);
		ListNode tempNext = next.getNext();
		next.setNext(new ListNode(data));
		next.getNext().setNext(tempNext);
	}
	
	public LinkedNode getNode(int index) {
		// returns the node at index, hopefully
		
		LinkedNode next = front;
		while(next!=null && index>1) {
			next = next.getNext();
			i--;
		}
		
		return next;
	}
	
	public E set(E data, int index) {
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException();
		}
	}
}
