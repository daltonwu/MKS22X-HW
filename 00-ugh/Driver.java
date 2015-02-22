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
	}
	
	public int factorial(int n) {
		if(n==0) return 1;
		return n * factorial(n-1);
	}
	
	public int fib(int n) {
		if(fibArr.length() < n) {
			fibArr.add(fibArr.get(fibArr.length()-1) + fibArr.get(fibArr.length()-2));
		}
		else return fibArr.get(n);
		return fib(n);
	}
	
	
}
