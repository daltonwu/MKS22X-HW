public class StackList {
	private LNode top;
	
	public StackList() {
		top = null;
	}
	
	public LNode pop() {
		LNode temp = top;
		top = top.getNext();
		return temp;
	}
	public void push(char c) {
		LNode temp = new LNode(c);
		temp.setNext(top);
		top = temp;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public LNode peek() {
		return top;
	}
}
