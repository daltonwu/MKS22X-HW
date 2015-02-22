import java.util.ArrayList;

public class Driver {
	private ArrayList<Integer> fibArr;
	private ArrayList<String> scrambled;
	
	public Driver() {
		fibArr = new ArrayList<Integer>();
		// (0),1,1,2,3,…
		fibArr.add(0);
		fibArr.add(1);
		fibArr.add(1);
	}
	
	public static void main(String[] args) {
		Driver driverception = new Driver();
		System.out.println(driverception.factorial(5)+"\n");
		for(int i=0; i<10; i++) {
			System.out.println(driverception.fib(i)+"\n");
		}
		System.out.println(driverception.sqrt(49.0)+"\n");
		System.out.println(driverception.scramble("abc").toString());
	}
	
	public int factorial(int n) {
		if(n==0) return 1;
		return n * factorial(n-1);
	}
	
	public int fib(int n) {
		// changed the list parameter to an instance variable
		// because it didn't quite make sense the other way
		if(fibArr.size() <= n) {
			fibArr.add(fibArr.get(fibArr.size()-1) + fibArr.get(fibArr.size()-2));
		}
		else return fibArr.get(n);
		return fib(n);
	}
	
	public double sqrt(double n) {
		// just for simplification:
		if(n<0) return Double.NaN;
		
		return sqrtH(n, n/2, 0.0001);
	}
	public double sqrtH(double n, double guess, double maxDiff) {
		// makes some guess, checks if abs(n - guess*guess) <= maxDiff
		if(Math.abs(n - guess*guess) <= maxDiff) return guess;
		else return sqrtH(n, (n/guess+guess)/2, maxDiff);
	}
	
	public ArrayList<String> scramble(String s) {
		// I'm going to pretend duplicate letters are distinguishable
		scrambled = new ArrayList<String>();
		scrambleH("",s);
		ArrayList<String> foo = new ArrayList<String>();
		for(int i=0; i<scrambled.size(); i+=2) {
			foo.add(scrambled.get(i));
		}
		return foo;
	}
	public void scrambleH(String one, String two) {
		if(two.length()<=1) scrambled.add(one + two);
		for(int i=0; i<two.length(); i++) {
			scrambleH(one + two.charAt(i), two.substring(0,i) + two.substring(i+1));
		}
	}
}
