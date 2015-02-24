import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Ctravel {
	private static int N, M, T;
	private static int R1, C1, R2, C2;
	
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("ctravel.in"));
		} catch(Exception E) {}
		
		String[] line = input.nextLine().split(" ");
		
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		T = Integer.parseInt(line[2]);
		
		
	}
}
