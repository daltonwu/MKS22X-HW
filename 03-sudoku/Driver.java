import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Driver {
	private static ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	
	private static boolean diagonalCheck(int row, int column, int foo) {
		// diagonals, snippet taken from NQueens cod3
		String thisThing = String.valueOf(foo);
		String s = "";
		int d = Math.min(row,column);
		int a = row-d;
		int b = column-d;
		while(a<board.size() && b<board.size()) {
			s += board.get(a).get(b);
			a++;
			b++;
		}
		a = row;
		b = column;
		while(a>=0 && b<board.size()) {
			s += board.get(a).get(b);
			a--;
			b++;
		}
		a = row;
		b = column;
		while(a<board.size() && b>=0) {
			s += board.get(a).get(b);
			a++;
			b--;
		}
		return s.indexOf(thisThing) == -1;
	}

}
