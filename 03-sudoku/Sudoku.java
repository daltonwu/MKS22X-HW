import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Sudoku {
	private static ArrayList<ArrayList<String>> board;
	private static ArrayList<ArrayList<Boolean>> originals; // make different color = true; original = false;
	
	// Store side length of one small board unit
	private static int unit;
	
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("sudoku.dat"));
		} catch(Exception e) {}
		
		board = new ArrayList<ArrayList<String>>();
		originals = new ArrayList<ArrayList<Boolean>>();
		
		while(input.hasNext()) {
			String line = input.nextLine();
			
			ArrayList<String> foo = new ArrayList<String>();
			ArrayList<Boolean> bar = new ArrayList<Boolean>();
			
			for(int i=0; i<line.length(); i++) {
				foo.add(line.substring(i,i+1));
				bar.add(line.substring(i,i+1).equals("-"));
			}
			
			board.add(foo);
			originals.add(bar);
		}
		
		unit = (int) Math.sqrt(board.size());
		
		print();
		Print();
		
		solve();
		print();
	}
	
	private static void print() {
		String s = "";
		for(int i=0; i<board.size(); i++) {
			for(int g=0; g<board.size(); g++) {
				if(originals.get(i).get(g)) {
					s += "[32m";
				}
				else {
					s += "[1;31m";
				}
				s += board.get(i).get(g) + "[0m ";
				if(g!=board.size()-1 && (g+1)%unit==0) {
					s += "[36m|[0m "; // Vertical pipe
				}
			}
			s += "\n";
			if(i!=board.size()-1 && (i+1)%unit==0) {
				s += "[36m" + new String(new char[board.size()+unit-1]).replace("\0", "― ") + "[0m\n"; // 'Horizontal Bar' U+2015
			}
		}
		System.out.println(s);
	}
	
	private static void Print() {
		String s = "";
		for(int i=0; i<originals.size(); i++) {
			for(int g=0; g<originals.size(); g++) {
				s += (originals.get(i).get(g) ? "T" : "F") + " ";
				if(g!=board.size()-1 && (g+1)%unit==0) {
					s += "| ";
				}
			}
			s += "\n";
			if(i!=board.size()-1 && (i+1)%unit==0) {
				s += new String(new char[board.size()+unit-1]).replace("\0", "― ") + "\n";
			}
		}
		System.out.println(s);
	}
	
	private static void solve() {
		solveH(0);
	}
	
	private static boolean solveH(int row) {
		// if done, return true
		// if not done:
		// 		find next empty thing
		// 		at next empty thing, get foo value
		// 		check if foo value work
		// 		now check if foo value work in future
		// 		blah
		if(row >= board.size()) return true;
		
		for(int g=0; g<board.size(); g++) {
			if(board.get(row).get(g).equals("-")) {
				for(int foo=1; foo<=board.size(); foo++) {
					board.get(row).set(g,String.valueOf(foo));
					if(check(row,g) /*&& solveH(row)*/) {
						System.out.printf("%s%n", board.get(row).get(g));
						return solveH(row);
					}
					else {
						board.get(row).set(g,"-");
						//System.out.printf("wefoij");
					}
				}
				return false;
			}
		}
		
		return solveH(row+1);
	}
	
	private static boolean check(int row, int column) {
		// rows and columns
		String thisThing = board.get(row).get(column);
		for(int g=0; g<board.size(); g++) {
			if(g!=column && board.get(row).get(g).equals(thisThing)) return false;
		}
		for(int i=0; i<board.size(); i++) {
			if(i!=row && board.get(i).get(column).equals(thisThing)) return false;
		}
		
		// that darn box
		for(int i=row/unit; i<row/unit+unit; i++) {
			for(int g=column/unit; g<column/unit+unit; g++) {
				if(i!=row && g!=column && board.get(i).get(g).equals(thisThing)) return false;
			}
		}
		
		return true;
	}
}
