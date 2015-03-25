public class Queue {
	LNode head;
	
	public Queue() {
		head = null;
	}
	
	public void enqueue(LNode n) {
		n.setNext(head);
		head = n;
	}
	
	public LNode dequeue() {
		if(head==null)
			throw new NullPointerException();
		LNode temp = head;
		head = head.getNext();
		return head;
	}
	
	public LNode peek() {
		return head;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
}
