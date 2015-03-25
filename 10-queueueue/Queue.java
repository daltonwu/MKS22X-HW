public class Queue {
	// add to back, remove from front
	LNode head;
	
	public Queue() {
		head = null;
	}
	
	public void enqueue(LNode n) {
		this.checkNull();
		LNode next = head;
		while(next!=null) {
			next = next.getNext();
		}
		next.setNext(n);
	}
	
	public LNode dequeue() {
		this.checkNull();
		LNode temp = head;
		head = head.getNext();
		return head;
	}
	
	public LNode peek() {
		LNode next = head;
		while(next!=null) {
			next = next.getNext();
		}
		return next;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	private void checkNull() {
		if(head==null)
			throw new NullPointerException();
	}
}
