import java.util.Arrays;

public class StackArray {
	private char[] data;
	private int size;
	
	public StackArray() {
		data = new char[10];
		size = 0;
	}
	
	public void push(char c) {
		this.makeSureSize(size+1);
		data[size++] = new LNode(c);
	}
	public LNode pop() {
		LNode temp = data[size-1];
		data[size--] = null;
		return temp;
	}
	public LNode peek() {
		return data[size-1];
	}
	public boolean isEmpty() {
		return size==0;
	}
	
	private void makeSureSize(int minSize) {
		// stolen so badly from Java's ensureCapacity() from ArrayList source code, here: 
		// http://grepcode.com/file/repository.grepcode.com/java/root/jdk/openjdk/6-b14/java/util/ArrayList.java#ArrayList.ensureCapacity%28int%29
		int oldSize = data.length;
		if(minSize > oldSize) {
			int newSize = oldSize * 3/2 + 1;
			if(newSize < minSize)
				newSize = minSize;
			data = Arrays.copyOf(data, newSize);
		}
	}
}
