import java.util.Random;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		int[] d1 = getNew();
		Quicksort q1 = new Quicksort(d1);
		System.out.println(q1);
		System.out.println("HOORAY! YOU WIN, LOSER");
	}
	
	private static int[] getNew() {
		Random rand = new Random();
		int[] ret = new int[20];
		for(int i=0; i<ret.length; i++) {
			ret[i] = rand.nextInt() % ret.length; // something I don't know what
		}
		return ret;
	}
}
