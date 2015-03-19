import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Driver {
	private static int SIZE = 9;
	private static ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	public static void main(String[] args) {
		clear();
		board.get(3).set(3,"9");
		check(3,4,9);
	}
	private static void print() {
		for(int i=0; i<SIZE; i++) {
			for(int g=0; g<SIZE; g++) {
				System.out.printf("%s ",board.get(i).get(g));
			}
			System.out.printf("%n");
		}
		System.out.printf("%n");
	}
	private static void check(int row, int column, int foo) {
		System.out.println(diagonalCheck(row, column, foo));
		board.get(row).set(column,String.valueOf(foo));
		System.out.println(diagonalCheck(row, column, foo));
		print();
	}
	private static void clear() {
		board.clear();
		for(int i=0; i<SIZE; i++) {
			ArrayList<String> line = new ArrayList<String>();
			for(int g=0; g<SIZE; g++) {
				line.add("-");
			}
			board.add(line);
		}
	}
	private static boolean diagonalCheck(int row, int column, int foo) {
		// output should be true if can place
		//    and false if cannot place
		// diagonals, snippet taken from NQueens cod3
		String thisThing = String.valueOf(foo);
		String s = "";
		int d = Math.min(row,column);
		int a = row-d;
		int b = column-d;
		while(a<SIZE && b<SIZE) {
			s += board.get(a).get(b);
			a++;
			b++;
		}
		a = row;
		b = column;
		while(a>=0 && b<SIZE) {
			s += board.get(a).get(b);
			a--;
			b++;
		}
		a = row;
		b = column;
		while(a<SIZE && b>=0) {
			s += board.get(a).get(b);
			a++;
			b--;
		}
		return s.indexOf(thisThing) == -1;
	}

}
