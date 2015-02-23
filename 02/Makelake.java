import java.util.Scanner;
import java.io.File;

public class Makelake {
	// R, C, E, N
	private static int[][] land;
	private static int R, C, E, N;
	
	public static void main(String[] args) {
		Scanner input = null;
		try {
			input = new Scanner(new File("makelake.in"));
		} catch (Exception e) {}
		
		String[] line1 = input.nextLine().split(" ");
		R = Integer.parseInt(line1[0]);
		C = Integer.parseInt(line1[1]);
		E = Integer.parseInt(line1[2]);
		N = Integer.parseInt(line1[3]);
		
		land = new int[R][C];
		
		for(int r=0; r<R; r++) {
			String[] split = input.nextLine().split(" ");
			for(int c=0; c<C; c++) {
				land[r][c] = Integer.parseInt(split[c]);
			}
		}
		
		while(input.hasNext()) {
			String[] line = input.nextLine().split(" ");
		}
	}
}
