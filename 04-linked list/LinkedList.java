public class LinkedList {
	
    private LNode front;
	
	public LinkedList() {
	}
	
	public String toString() {
		String s = "[";
		LNode next = front;
		
		while(next!=null) {
			s += (s.length()==1?"":", ") + next.getData();
			next = next.getNext();
		}
		
		return s + "]";
	}
	
	public void add(char c) {
		// appends c to the end of the list
		
		if(front==null) {
			front = new LNode(c);
			return;
		}
		
		LNode next = front;
		
		while(next.getNext()!=null) {
			next = next.getNext();
		}
		
		next.setNext(new LNode(c));
	}
	public void add(char c, int i) {
		// adds c to the list at index i
		
		if(front==null) {
			front = new LNode(c);
			return;
		}
		
		if(i>=this.size())
			return;
			
		if(i==0) {
			LNode temp = front;
			front = new LNode(c);
			front.setNext(temp);
			return;
		}
		LNode next = this.getNode(i);
		
		LNode tempNext = next.getNext();
		next.setNext(new LNode(c));
		next.getNext().setNext(tempNext);
	}
	
	public char get(int i) {
		// returns the value at index i
		// (zero-based indexing)
		
		LNode next = front;
		
		while(i>0) {
			next = next.getNext();
			i--;
		}
		
		return next.getData();
	}
	public LNode getNode(int i) {
		// returns the LNode at index i, unless you screw up
		
		if(i>this.size())
			return null;
			
		LNode next = front;
		
		while(i>1) {
			next = next.getNext();
			i--;
		}
		
		return next;
	}
	
	
	public char set(char c, int i) {
		// changes the value at index i to c
		// returns the value that was at i before the change
		
		LNode next = this.getNode(i);
		
		char toReturn = next.getData();
		next.setData(c);
		
		return toReturn;
	}
	
	public char remove(int i) {
		// removes the node at index i and return its value
		
		LNode next = front;
		
		while(i>1) {
			next = next.getNext();
		}
		
		char toReturn = next.getNext().getData();
		next.setNext(next.getNext().getNext());
		
		return toReturn;
	}
	
	public int size() {
		// returns the number of elements in the list
		
		int i=0;
		LNode next = front;
		
		while(next!=null) {
			next = next.getNext();
			i++;
		}
		
		return i;
	}
}
