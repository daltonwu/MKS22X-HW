import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Ctravel {
	private static int N, M, T;
	private static int R1, C1, R2, C2;
	private static ArrayList<ArrayList<Character>> board;
	
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("ctravel.in"));
		} catch(Exception E) {}
		
		String[] line = input.nextLine().split(" ");

		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		T = Integer.parseInt(line[2]);
		
		board = new ArrayList<ArrayList<Character>>();
		
		while(input.hasNextLine()) {
			String foo = input.nextLine();
			if(input.hasNextLine()) {
				ArrayList<Character> bar = new ArrayList<Character>();
				for(int i=0; i<foo.length(); i++) {
					bar.add(foo.charAt(i));
				}
				board.add(bar);
			}
			else {
				String[] bar = foo.split(" ");
				R1 = Integer.parseInt(bar[0]);
				C1 = Integer.parseInt(bar[1]);
				R2 = Integer.parseInt(bar[2]);
				C2 = Integer.parseInt(bar[3]);
			}
		}
		
		System.out.printf("R1, C1: %d, %d%nR2, C2: %d, %d%nN, M, T: %d, %d, %d%n", R1, C1, R2, C2, N, M, T);
		for(int i=0; i<board.size(); i++) {
			System.out.println(board.get(i).toString());
		}
		
		
		
	}
}
