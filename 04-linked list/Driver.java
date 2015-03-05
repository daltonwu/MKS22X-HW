public class Driver {
	
	private static LinkedList LL;
	
	public static void main(String[] args) {
		
/*		LL = new LinkedList();
		checkThings();
		
		LL.add('a');
		checkThings();
		
		LL.add('b');
		checkThings();
		
		LL.add('d');
		checkThings();
		
		LL.add('c',2);
		checkThings();
*/
/*		LL = new LinkedList();
		checkThings();
		
		LL.add('a',0);
		checkThings();
		
		LL.add('b',0);
		checkThings();
		
		LL.add('c',5);
		checkThings();
*/
/*		LL = new LinkedList();
		LL.add('A');
		LL.add('B');
		LL.add('C');
		checkThings();
		
		print(0);
		print(1);
		print(2);
		print(-1); // oh well
*/		
/*		LL = new LinkedList();
		LL.add('a');
		LL.add('b');
		LL.add('c');
		checkThings();
		
		pr(0);
		pr(0);
		pr(0);
		checkThings();
*/		
		
	}
	private static void checkThings() {
		System.out.println(LL.toString());
		System.out.println(LL.size());
	}
	private static void print(int index) {
		System.out.println(LL.get(index));
	}
	private static void pr(int index) {
		System.out.println(LL.remove(index));
	}
}
