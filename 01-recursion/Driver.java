public class Driver {
	// various codingbat problems
	public static void main(String[] args) {
		System.out.println("Whatever");
	}
	
	public int fibonacci(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		return fibonacci(n-2) + fibonacci(n-1);
	}
	public int bunnyEars2(int bunnies) {
		if(bunnies==0) return 0;
		if(bunnies==1) return 2;
		if(bunnies%2==0) return 3 + bunnyEars2(bunnies-1);
		return 2 + bunnyEars2(bunnies-1);
	}
	public int strCount(String str, String sub) {
		if(str.length()<sub.length()) return 0;
		if(str.startsWith(sub)) return 1 + strCount(str.substring(sub.length()),sub);
		return strCount(str.substring(1),sub);
	}
	public int sumDigits(int n) {
		if(n<10) return n;
		return n%10 + sumDigits(n/10);
	}
	public int bunnyEars2(int bunnies) {
		if(bunnies==0) return 0;
		if(bunnies==1) return 2;
		if(bunnies%2==0) return 3 + bunnyEars2(bunnies-1);
		return 2 + bunnyEars2(bunnies-1);
	}
	public String allStar(String str) {
		if(str.length()<=1) return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}
}
