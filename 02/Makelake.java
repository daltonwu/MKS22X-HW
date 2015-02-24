import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class Makelake {
	// R, C, E, N
	private static int[][] land;
	private static int R, C, E, N;
	private static int X, Y, D;
	
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
			X = Integer.parseInt(line[0]);
			Y = Integer.parseInt(line[1]);
			D = Integer.parseInt(line[2]);
			
			int max = -1;
			for(int i=X-1; i<X+2; i++) {
				for(int g=Y-1; g<Y+2; g++) {
					max = Math.max(max, land[i][g]);
				}
			}
			
			for(int n=D; n>0; n--) {
				for(int i=X-1; i<X+2; i++) {
					for(int g=Y-1; g<Y+2; g++) {
						if(land[i][g] == max)
							land[i][g]--;
					}
				}
				max--;
			}
		}
		
		int sum = 0;
		
		for(int r=0; r<R; r++) {
			for(int c=0; c<C; c++) {
				if(land[r][c] < E)
					sum += E - land[r][c];
			}
		}
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("makelake.out");
		} catch(Exception e) {}
		pw.println(sum * 72 * 72);
		pw.close();
	}
}
