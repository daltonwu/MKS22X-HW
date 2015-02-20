public class NQueens {
	private char[][] board;
	
	public static void main(String[] args) {
		int n=0;
		try {
			n = Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("Uh, what are you doing?");
			System.exit(1);
		}
		
		char[][] board = new char[n][n];
		for(int i=0; i<board.length; i++) {
			for(int g=0; g<board.length; g++) {
				board[i][g] = '-';
			}
		}
		
		NQueens foo = new NQueens(board);
		foo.solve(0);
		System.out.println(foo.toString());
	}
	
	public NQueens(char[][] board) {
		this.board = board;
	}
	
	private boolean solve(int i) {
		if(i>=board.length) return true;
		for(int g=0; g<board.length; g++) {		
			//System.out.printf("i is %d, g is %d, gChk is %b, dgChk is %b%n", i, g, gCheck(g), diagonalCheck(i,g));
			if(gCheck(g) && diagonalCheck(i,g)) {
				board[i][g] = 'Q';
				if(solve(i+1)) return true;
				board[i][g] = '-'; // whelp, that was easy
			}
		}
		return false;
	}
	
	// checks return true if no queen found
	private boolean gCheck(int g) {
		String s = "";
		for(int i=0; i<board.length; i++) {
			s += board[i][g];
		}
		return s.indexOf('Q') == -1;
	}
	
	private boolean diagonalCheck(int i, int g) {
		String s = "";
		int d = Math.min(i,g);
		int a = i-d;
		int b = g-d;
		while(a<board.length && b<board.length) {
			s += board[a][b];
			a++;
			b++;
		}
		a = i;
		b = g;
		while(a>=0 && b<board.length) {
			s += board[a][b];
			a--;
			b++;
		}
		a = i;
		b = g;
		while(a<board.length && b>=0) {
			s += board[a][b];
			a++;
			b--;
		}
		return s.indexOf('Q') == -1;
	}
	
	public String toString() {
		String s = "";
		for(int i=0; i<board.length; i++) {
			for(int g=0; g<board.length; g++) {
				s += board[i][g] + " ";
			}
			s += "\n";
		}
		return s;
	}
}
