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
		
		while(input.hasNextLine()) {
			String foo = input.nextLine();
			if(!input.hasNextLine()) {
				String[] bar = foo.split(" ");
				R1 = Integer.parseInt(bar[0]);
				C1 = Integer.parseInt(bar[1]);
				R2 = Integer.parseInt(bar[2]);
				C2 = Integer.parseInt(bar[3]);
			}
		}
		
		try {
			input = new Scanner(new File("ctravel.in"));
		} catch(Exception E) {}
		
		String[] line = input.nextLine().split(" ");
		
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		T = Integer.parseInt(line[2]);
		System.out.printf("R1, C1: %d, %d; R2, C2: %d, %d; N, M, T: %d, %d, %d", R1, C1, R2, C2, N, M, T);
	}
}
