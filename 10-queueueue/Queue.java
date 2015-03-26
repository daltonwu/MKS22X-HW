public class Queue {
	// add to back, remove from front
	LNode head;
	LNode tail;
	
	public Queue() {
		head = null;
		almostEnd = null;
	}
	
	public void enqueue(LNode n) {
		if(head==null) {
			head = n;
			tail = n;
			return;
		}
		tail.setNext(n);
		tail = tail.getNext();
	}
	
	public LNode dequeue() {
		this.checkNull();
		LNode temp = head;
		head = head.getNext();
		return temp;
	}
	
	public LNode peek() {
		return head;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	private void checkNull() {
		if(head==null)
			throw new NullPointerException();
	}
}
