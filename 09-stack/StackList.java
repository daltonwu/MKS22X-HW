public StackList
{
	private LNode front;
	private int size;
	
	public StackList() {
		front = null;
		size = 0;
	}
	
	public LNode pop() {
		if(size==0)
			return null;
		
		LNode temp = getNode(size);
		this.getNode(size-1).setNext(null);
		return temp;
	}
	
	public void push(char c) {
		if(size==0) {
			front = new LNode(c);
		} else {
			this.getNode(size).setNext(new LNode(c));
		}
		size++;
	}
	
	public void peek() {
		return size==0?null:getNode(size-1);
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	private getNode(int index) {
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException;
		}
		
		LNode next = front;
		while(index>1) {
			front = front.getNext();
			index--;
		}
		
		return next;
	}
}
