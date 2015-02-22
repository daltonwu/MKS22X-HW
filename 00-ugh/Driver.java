import java.util.ArrayList;

public class Driver {
	private ArrayList<Integer> fibArr;
	
	public Driver {
		fibArr = new ArrayList<Integer>();
		// 1,1,2,3,…
		fibArr.set(0,1);
		fibArr.set(1,1);
	}
	
	public static void main(String[] args) {
		Driver driverception = new Driver();
		System.out.println(driverception.factorial(5)+"\n");
		System.out.println(driverception.fib(0)+"\n");
		System.out.println(driverception.sqrt(49.0));
	}
	
	public int factorial(int n) {
		if(n==0) return 1;
		return n * factorial(n-1);
	}
	
	public int fib(int n) {
		// changed the list parameter to an instance variable
		// because it didn't quite make sense the other way
		if(fibArr.length() < n) {
			fibArr.add(fibArr.get(fibArr.length()-1) + fibArr.get(fibArr.length()-2));
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
	
	
	
}
