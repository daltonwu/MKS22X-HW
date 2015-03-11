public class Driver {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		for (char c = 'A'; c < 'F'; c++) {
			l.add(c);
		}
		
		System.out.println( l );
		
		l.add( '0', 0 );
		l.add( '1', 1 );
		l.add( '2', 3 );
		l.add( '3', 8 );
		
		System.out.println( l );
		
		l.set( '!', 0 );
		l.set( '@', 8 );
		
		System.out.println( l );
		
		System.out.println( l.get(0) );
		System.out.println( l.get(5) );
		System.out.println( l.get(9) );
		
		
		System.out.println( l.remove(0) );
		System.out.println( l.remove(5) );
		
		System.out.println( l );
		System.out.println( l.size() );
		
	}
}
