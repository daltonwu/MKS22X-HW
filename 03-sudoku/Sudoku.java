import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Sudoku {
	private static ArrayList<ArrayList<String>> board;
	
	// Store side length of one small board unit
	private static int unit;
	
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("sudoku.dat"));
		} catch(Exception e) {}
		
		board = new ArrayList<ArrayList<String>>();
		
		while(input.hasNext()) {
			String line = input.nextLine();
			
			ArrayList<String> foo = new ArrayList<String>();
			for(int i=0; i<line.length(); i++) {
				foo.add(line.substring(i,i+1));
			}
			
			board.add(foo);
		}
		
		unit = (int) Math.sqrt(board.size());
		
		print();
	}
	
	private static void print() {
		String s = "";
		for(int i=0; i<board.size(); i++) {
			for(int g=0; g<board.size(); g++) {
				s += board.get(i).get(g) + " ";
				if(g!=board.size()-1 && (g+1)%unit==0) {
					s += "| "; // Vertical pipe
				}
			}
			s += "\n";
			if(i!=board.size()-1 && (i+1)%unit==0) {
				s += "[1m" + new String(new char[board.size()+unit-1]).replace("\0", "― ") + "]\n"; // 'Horizontal Bar' U+2015
			}
		}
		System.out.println(s);
	}
}
